package JavaExercise220240827;

import java.util.Arrays;
import java.util.Random;

public class JavaExercise2 {
    public static void main(String[] args) {
        char[] words = makeWords();
        char[] numbers = makeNumbers();
        char[] captcha = makeCaptcha(words, numbers);
        String str = "";
        for (char c : captcha) {
            str = str + c;
        }
        System.out.println(str);
    }

    public static char[] makeWords(){
        char[] words = new char[52];
        for (int i = 0; i < words.length; i++) {
            if (i <= 25) {
                words[i] = (char) (65 + i);
            } else {
                words[i] = (char) (97 + i - 26);
            }
        }
        return words;
    }

    public static char[] makeNumbers(){
        char[] numbers = new char[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (char)(i + 48);
        }
        return numbers;
    }

    public static char[] makeCaptcha(char[] words, char[] numbers){
        Random r = new Random();
        char[] captcha = new char[5];
        int randomNumber;
        for (int i = 0; i < 4; i++) {
            randomNumber = r.nextInt(words.length);
            captcha[i] = words[randomNumber];
        }
        randomNumber = r.nextInt(numbers.length);
        captcha[4] = numbers[randomNumber];
        return captcha;
    }

    public static void randomCaptcha(char[] captcha){
        Random r = new Random();
        int randomNumber;
        char temp;
        for (int i = captcha.length - 1; i >= 0; i--) {
            randomNumber = r.nextInt(i + 1);
            temp = captcha[randomNumber];
            captcha[randomNumber] = captcha[i];
            captcha[i] = temp;
        }
    }
}
