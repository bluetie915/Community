package com.zhang.community.advice;

import com.zhang.community.dto.ResultDTO;
import com.zhang.community.exception.CustomizeErrorCode;
import com.zhang.community.exception.CustomizeException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CustomizeExceptionHandler {

    @ExceptionHandler(Exception.class)
    Object handle(HttpServletRequest request, Throwable e, Model model) {

        String contentType = request.getContentType();
        if ("application/json".equals(contentType)){
            //返回json
            if (e instanceof CustomizeException) {
                return ResultDTO.errorOf((CustomizeException) e);
            } else {
                model.addAttribute(CustomizeErrorCode.SYS_ERROR);
            }
        }else {
            //错误页面跳转
            if (e instanceof CustomizeException) {
                model.addAttribute("message", e.getMessage());
            } else {
                model.addAttribute("message", "服务器冒烟了，要不然你稍后再试试!!!");
            }
            return new ModelAndView("error");
        }
    }
}
