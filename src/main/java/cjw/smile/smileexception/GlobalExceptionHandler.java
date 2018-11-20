package cjw.smile.smileexception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(Exception.class)
    @ResponseBody
    String handleException(Exception e){
        return "Exception Deal!"+e.getMessage();
    }
}
