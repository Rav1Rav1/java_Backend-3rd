//package in.codingAge.ecommerce.exception;
//
//public class CustomError {
//
//    String errorCode;
//
//    public CustomError(String errorCode,String message) {
//        this.errorCode = errorCode;
//    }
//}


package in.codingAge.ecommerce.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomError {

    private String errorCode;
    private String message;

    public CustomError(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

}

