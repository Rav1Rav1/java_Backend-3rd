package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.EcommerceCarousel;

import java.util.List;

public interface EcommerceCarouselRepository {

//    List<EcommerceCarousel> createEcommerceCarousel();

    EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel);

    List<EcommerceCarousel> getEcommerceCarousel();


    List<EcommerceCarousel> getAllCarousel();

    EcommerceCarousel updateCarousel(double id, String item);

    boolean deleteCarousel(double id);

    EcommerceCarousel getACarousel(double id);
}
