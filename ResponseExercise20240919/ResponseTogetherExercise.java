package com.wzb.ResponseExercise20240919;

import com.wzb.ResponseExercise20240919.Result.Result;
import com.wzb.ResponseExercise20240919.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResponseTogetherExercise {
    /* 响应的值多种多样，没有规范；不便于前后端分离开发：前端若拿到响应的数据，没有统一的规范，那么需要对不同的数据
       进行不同的解析，成本高、效率低、维护困难 */

    /* 所以说一般在开发中，定义一个统一的返回结果，所有请求都返回这个类型的结果，便于开发 */

    /* 这个统一的返回结果应该包含：
       1.响应状态码：当前的请求的成功还剩失败
       2.状态码信息：给页面的提示信息
       3.返回的数据：给前端响应的数据（字符串、对象、集合；所以说要用Object定义数据类型）*/

    /* 有了统一的返回结果Result之后，就可以对Controller进行改造 */

    @RequestMapping("/simplePojoTogether")
    public Result simplePojo(User user) {
        System.out.println(user);
        /* 能够走到这一步，那么说明成功响应了 */
        return Result.success(user);
    }

}
