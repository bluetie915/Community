package com.zhang.community.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CustomizeExceptionHandler {
//    @ControllerAdvice(basePackageClasses = AcmeController.class)
//    public class AcmeControllerAdvice extends ResponseEntityExceptionHandler {

//        @ExceptionHandler(Exception.class)
//        ModelAndView handle(HttpServletRequest request, Throwable ex) {
//            HttpStatus status = getStatus(request);
//            return new ResponseEntity<>(new CustomErrorType(status.value(), ex.getMessage()), status);
//        }
//
//        private HttpStatus getStatus(HttpServletRequest request) {
//            Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//            if (statusCode == null) {
//                return HttpStatus.INTERNAL_SERVER_ERROR;
//            }
//            return HttpStatus.valueOf(statusCode);
//        }

//    }
}
