package com.example.controller;

import com.example.bean.param.UserAddParam;
import com.example.bean.result.Response;
import org.springframework.web.bind.annotation.*;

/**
 * 切面测试
 *
 * @author 码农猿
 */
@RestController
@RequestMapping("/aspect")
public class AspectExampleController {
    /**
     * 切面测试
     *
     * @author 码农猿
     */
    @GetMapping(value = "/test")
    public Response test() {
        return Response.success();
    }

}