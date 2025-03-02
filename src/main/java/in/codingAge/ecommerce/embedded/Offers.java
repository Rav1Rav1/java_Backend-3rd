package in.codingAge.ecommerce.embedded;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Offers {

    private String name;
    private double discountPercentage;
    private LocalDate expiryDate;
    private  boolean active;


}
