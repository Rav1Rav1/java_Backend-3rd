package in.codingAge.ecommerce.service;


import in.codingAge.ecommerce.model.EcommerceCarousel;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EcommerceCarouselService {

//    List<EcommerceCarousel> createEcommerceCarousel();
    EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel);


    Page<EcommerceCarousel> getAllCarousel(int pageNo, int pageSize);

    void updateCarousel(String id, String item);

    void deleteCarousel(String id);

    EcommerceCarousel getACarousel(String id);

    EcommerceCarousel getACarouselByItem(String items);
}
