package JPA_One_toOne_Mapping.User;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

@RestControllerAdvice
public class UserControllerAdvice {

    Map<String,Object> responseMap = new LinkedHashMap<String, Object>();

    @ExceptionHandler
    public Map<String,Object> handleException(Exception e, HttpServletRequest request){
        responseMap.put("status", HttpStatus.BAD_GATEWAY.value());
        responseMap.put("error", HttpStatus.BAD_GATEWAY.getReasonPhrase());
        responseMap.put("path", request.getRequestURI());
        responseMap.put("exception", e.getClass());
        responseMap.put("message",e.getMessage());
        responseMap.put("timestamp", LocalDateTime.now());
        return responseMap;
    }
}
