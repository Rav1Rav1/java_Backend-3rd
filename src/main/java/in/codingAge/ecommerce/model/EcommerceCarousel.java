package in.codingAge.ecommerce.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(collection = "ecommerce_carousel")
@AllArgsConstructor
@NoArgsConstructor
public class EcommerceCarousel {

    @Id
    private String id;
    private String item;
    private double interval;
}