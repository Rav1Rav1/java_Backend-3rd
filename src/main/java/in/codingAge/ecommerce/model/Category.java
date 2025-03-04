package in.codingAge.ecommerce.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document("category")
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    private String id;
    private String categoryName;
    private String url;
    int categorySlides;

}
