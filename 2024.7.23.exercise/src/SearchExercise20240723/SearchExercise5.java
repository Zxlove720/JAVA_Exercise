package SearchExercise20240723;
import java.util.Arrays;
import java.util.Scanner;
public class SearchExercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要多大的数组?");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        // 创建索引表
        int blockSize = (int)Math.sqrt(array.length);
        Block[] blocksArray = creatBlocksArray(array, blockSize);
        // 分块查找
        System.out.println("请输入要查找的元素");
        int key = sc.nextInt();
        int result = blockSearch(array, blocksArray, key);
        if (result == -1) {
            System.out.println("数组中无法找到该元素");
        } else {
            System.out.printf("成功找到，下标是%d", result);
        }


    }
    public static Block[] creatBlocksArray(int[] array, int blockSize) {
        int blockNumbers = (int)Math.ceil(array.length * 1.0 / blockSize);
        Block[] blockArray = new Block[blockNumbers];
        for (int i = 0; i < blockArray.length; i++) {
            int start = i * blockSize;
            int end = Math.min(start + blockSize, array.length);
            int maxKey = Arrays.stream(array, start, end).max().orElse(Integer.MIN_VALUE);
            blockArray[i] = new Block(start, end, maxKey);
        }
        return blockArray;
    }
    
    public static int blockSearch(int[] array, Block[] blocksArray, int key) {
        int blockIndex = -1;
        for (int i = 0; i < blocksArray.length; i++) {
            if (key <= blocksArray[i].getMaxKey()) {
                blockIndex = i;
                break;
            }
        }
        if (blockIndex == -1) {
            return -1;
        }
        int start = blocksArray[blockIndex].getStart();
        int end = blocksArray[blockIndex].getEnd();
        for (int i = start; i < end; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
}



class Block{
    private int start;
    private int end;
    private int maxKey;

    public Block(int start, int end, int maxKey) {
        this.start = start;
        this.end = end;
        this.maxKey = maxKey;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getMaxKey() {
        return maxKey;
    }

    public void setMaxKey(int maxKey) {
        this.maxKey = maxKey;
    }
}
