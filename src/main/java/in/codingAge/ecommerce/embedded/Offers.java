package in.codingAge.ecommerce.embedded;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Offers {

    private String name;
    private double discountPercentage;
    private Data expiryDate;
    private  boolean active;


}
