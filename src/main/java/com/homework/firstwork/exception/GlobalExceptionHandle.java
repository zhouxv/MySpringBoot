package com.homework.firstwork.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;

/*
@Note：全局异常处理

@User：NineSun
@Time:2020/3/4   15:02
*/
@ControllerAdvice
public class GlobalExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandle(HttpServletRequest req,Exception error){
        ModelAndView mav=new ModelAndView("errorPage");
        mav.addObject("exception", error);
        mav.addObject("url", req.getRequestURL());
        return mav;
    }
}
