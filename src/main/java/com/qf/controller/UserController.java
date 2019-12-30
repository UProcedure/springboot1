package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.BindException;
import java.util.List;

/**
 * @author weimin
 * @ClassName UserController
 * @Description TODO
 * @date 2019/10/21 12:01
 */
@Controller
@RequestMapping("user")
@Slf4j
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello!!!!";
    }

    @RequestMapping("{id}")
    @ResponseBody
    public User getUserById(@PathVariable Integer id){
        log.debug("debug...");
        log.info("info...");
        return userService.getUserById(id);
    }


    @RequestMapping("page")
    @ResponseBody
    public String page(@Valid User user, BindingResult bindingResult){
        log.info("是不是空[{}]",user.getUsername()==null);
        if(bindingResult.hasErrors()){
            List<FieldError> fieldErrors =
                    bindingResult.getFieldErrors();
            for (FieldError fieldError : fieldErrors) {
                String message = fieldError.getDefaultMessage();
                String field = fieldError.getField();
            }
            return "xxxx";
        }
        return "yyyy";
    }
}
