package in.codingAge.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {


    @Id
    private String Id;
    private String title;
    private double price;
    private String brand;
    private String specialFeature;
    private String offers;


}
