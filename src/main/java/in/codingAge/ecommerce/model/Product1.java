package in.codingAge.ecommerce.model;

import in.codingAge.ecommerce.embedded.Brand;
import in.codingAge.ecommerce.embedded.Features;
import in.codingAge.ecommerce.embedded.Offers;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("product1")
public class Product1 {

    @Id
    private String id;
    private String name;
    private String type;
    private String title;
    private double price;
    private LocalDate createDate;
    private LocalDate updateDate;

    private List<Features> featuresList;
    private List<Offers> offersList;
    private List<Brand> brandList;

    private List<String> size;


}
