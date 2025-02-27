package in.codingAge.ecommerce.model;

import in.codingAge.ecommerce.embedded.Brand;
import in.codingAge.ecommerce.embedded.Features;
import in.codingAge.ecommerce.embedded.Offers;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document("product1")
public class Product1 {

    @Id
    private String id;
    private String name;
    private String type;
    private String title;
    private double price;
    private List<Features> featuresList;
    private List<Offers> offersList;
    private List<Brand> brandList;

    private Date createDate;
    private Date updateDate;

    private List<String> size;


}
