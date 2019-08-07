package com.show.sign.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.show.sign.vo.User;

import lombok.extern.slf4j.Slf4j;

/**
 * 
* @ClassName: SignController
* @Description: 签名测试
* @author darren
* @date 2019年8月7日
*
 */
@RestController
@Slf4j
@RequestMapping("/signTest")
public class SignController {

    @PostMapping
    public Map<String, Object> signTestPost(@RequestBody User user) {

        String username = (String) user.getUsername();
        String password = (String) user.getPassword();
        log.info("username：{},password：{}", username, password);
        Map<String, Object> resParam = new HashMap<>(16);
        resParam.put("msg", "参数校验成功");
        resParam.put("success", "true");
        return resParam;
    }

    @GetMapping
    public Map<String, Object> signTestGet(String username, String password) {

        log.info("username：{},password：{}", username, password);
        Map<String, Object> resParam = new HashMap<>(16);
        resParam.put("msg", "参数校验成功");
        resParam.put("success", "true");
        return resParam;
    }

}
