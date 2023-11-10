package shop.mtcoding.blogv2._core.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import shop.mtcoding.blogv2._core.error.ex.*;
import shop.mtcoding.blogv2._core.util.Script;

@ControllerAdvice
public class MyExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception400.class)
    public String ex400(Exception400 e){
        return Script.back(e.getMessage());
    }

@ResponseBody
@ExceptionHandler(Exception401.class)
public String ex401(Exception401 e){
    if(e.isBack()){
        return Script.back(e.getMessage());
    }else{
        return Script.href("/loginForm", e.getMessage());
    }
}

    @ResponseBody
    @ExceptionHandler(Exception403.class)
    public String ex403(Exception403 e){
        return Script.back(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception404.class)
    public String ex404(Exception404 e){
        return Script.back(e.getMessage());
    }

    @ResponseBody
    @ExceptionHandler(Exception500.class)
    public String ex500(Exception500 e){
        return Script.back(e.getMessage());
    }
}
