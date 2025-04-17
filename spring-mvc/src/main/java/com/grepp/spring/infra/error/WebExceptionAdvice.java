package com.grepp.spring.infra.error;

import com.grepp.spring.infra.error.exceptions.CommonException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(basePackages = "com.grepp.spring.app.controller.web") // api 용과 web 용 분리
public class WebExceptionAdvice {

    @ExceptionHandler(CommonException.class) // web exception 이 터졌을 때
    public String webExceptionHandler(CommonException ex, Model model) {
        model.addAttribute("message", ex.code().message());
        return "error/500";
    }
}
