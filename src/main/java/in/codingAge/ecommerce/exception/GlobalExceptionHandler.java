package in.codingAge.ecommerce.exception;


import in.codingAge.ecommerce.base.ApiResponse;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

//    @ExceptionHandler(ResourceNotFoundException.class)
//    public CustomError handleProductNotFound(Exception exception){
//        return new CustomError("1000",exception.getMessage());
//    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ApiResponse<Object> handleProductNotFound(ResourceNotFoundException exception){
        return new ApiResponse<>(null,"failure" ,new CustomError("1000",exception.getMessage()));
    }


    @ExceptionHandler(Exception.class)
    public String handleGenericExeption(Exception exception){
        return exception.getMessage();

    }


}
