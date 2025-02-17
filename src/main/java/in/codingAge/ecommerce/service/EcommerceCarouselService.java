package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.EcommerceCarousel;

import java.util.List;

public interface EcommerceCarouselService {

//    List<EcommerceCarousel> createEcommerceCarousel();
    EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel);
    List<EcommerceCarousel> getEcommerceCarousel();

    List<EcommerceCarousel> getEcommerceCarouselById(double var1);

    List<EcommerceCarousel> updateEcommerceCarousel(double var1);

    List<EcommerceCarousel> deleteEcommerceCarousel(double var1);


    List<EcommerceCarousel> getAllCarousel();

    EcommerceCarousel updateCarousel(double id, String item);

    boolean deleteCarousel(double id);

    EcommerceCarousel getACarousel(double id);
}
