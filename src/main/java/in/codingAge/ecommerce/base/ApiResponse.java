package in.codingAge.ecommerce.base;

import in.codingAge.ecommerce.exception.CustomError;
import in.codingAge.ecommerce.exception.GlobalExceptionHandler;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse <T>{

    private T content;

    private String code;

    private CustomError error;

}
