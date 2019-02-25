package beans.controllers.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GenericExceptionHandler {

    @ExceptionHandler(value = {Exception.class, RuntimeException.class})
    public ModelAndView handleException(Exception e){

        e.printStackTrace();

        ModelAndView mv = new ModelAndView("error");

        return mv;
    }
}