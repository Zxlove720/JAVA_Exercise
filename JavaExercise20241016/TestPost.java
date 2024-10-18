package JavaExercise20241016;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestPost {
    // HttpClient
    // HttpClient是Apache的一个子项目，主要是用于提供高效、最新的、功能丰富的支持HTTP协议的客户端编程工具包；
    // 并且支持HTTP的最新版本及其建议

    // 作用：
    // 在后端发送HTTP请求
    // 接收请求的响应数据

    // 为什么要在Java后端中发送HTTP请求？又有哪些应用场景呢？
    // 1.对于一些复杂的功能，应用程序实现是十分困难的，所以说需要在应用程序中访问提供了这些功能的服务，访问这些服务就需要
    // Java后端发送HTTP请求，并且接收其响应的数据，所以说HttpClient就可以帮助我们在Java后端中发送HTTP请求
    // 2.应用场景十分广泛如：扫码支付、查看地图、获取验证码、查看实时天气；这些功能实现起来是十分困难的（主要是不方便），
    // 所以说需要Java后端程序发送HTTP请求去请求提供了这些功能的服务

    // 通常情况下，需要将 HttpClient 依赖添加到 Maven 项目中。但由于已经导入了阿里云相关的依赖，
    // 且阿里云依赖中已包含 HttpClient，因此无需额外再导入 HttpClient 依赖。（依赖传递）


    // HttpClient的核心API：
    // HttpClient：Http客户端对象类型，使用该类型的对象可以发起Http请求
    // HttpClients：可以理解为构造器，可创建HttpClient对象
    // CloseableHttpClient：实现类，实现了HttpClient接口
    // HttpGet：发送Get方法请求类型
    // HttpPost：发送Post方法请求类型

    // HttpClient发送请求步骤
    // 1.创建HttpClient对象
    // 2.创建Http请求对象
    // 3.调用HttpClient对象的execute的方法发送请求

    @Test
    public void testGet() throws IOException {
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建Http的请求对象
        HttpGet httpGet = new HttpGet("http://localhost:8080/user/shop/status");
        // 发送Http请求，接收其响应结果
        CloseableHttpResponse response = httpClient.execute(httpGet);
        // 获取服务端返回的状态码
        int statusCode = response.getStatusLine().getStatusCode();
        // 获取服务端返回的数据
        HttpEntity entity = response.getEntity();
        String body = EntityUtils.toString(entity);
        System.out.println("服务端返回的数据是：" + body);
        // 关闭资源
        response.close();
        httpClient.close();
    }

    @Test
    public void testPost() throws JSONException, IOException {
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建Post请求对象
        HttpPost httpPost = new HttpPost("http://localhost:8080/admin/employee/login");

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("username", "admin");
        jsonObject.put("password", "123456");

        StringEntity entity = new StringEntity(jsonObject.toString());
        // 指定请求编码方式
        entity.setContentEncoding("utf-8");
        // 设置数据格式
        entity.setContentType("application/json");
        httpPost.setEntity(entity);
        // 发送请求
        CloseableHttpResponse response = httpClient.execute(httpPost);

        // 解析返回的结果
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("响应码为：" + statusCode);

        HttpEntity entity1 = response.getEntity();
        String body = EntityUtils.toString(entity1);
        System.out.println("响应数据为：" + body);

        // 关闭资源
        response.close();
        httpClient.close();
    }
}
