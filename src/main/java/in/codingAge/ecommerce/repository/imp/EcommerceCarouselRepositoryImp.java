package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.repository.EcommerceCarouselRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EcommerceCarouselRepositoryImp implements EcommerceCarouselRepository {

    List<EcommerceCarousel> ecommerceCarousels = new ArrayList();
    Scanner sc;

    public EcommerceCarouselRepositoryImp() {
        this.sc = new Scanner(System.in);
    }

//    public List<EcommerceCarousel> createEcommerceCarousel() {
//        for(int i = 0; i < 2; ++i) {
//            EcommerceCarousel ecommerceCarousel = new EcommerceCarousel();
//            System.out.println("Enter id");
//            double userId = this.sc.nextDouble();
//            System.out.println("Enter Item");
//            String item = this.sc.nextLine();
//            System.out.println("Enter Interval");
//            double interval = this.sc.nextDouble();
//            ecommerceCarousel.setInterval(interval);
//            ecommerceCarousel.setItems(item);
//            ecommerceCarousel.setUserId(userId);
//            this.ecommerceCarousels.add(ecommerceCarousel);
//        }
//
//        return this.ecommerceCarousels;
//    }

    @Override
    public EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel) {
         ecommerceCarousels.add(carousel);
         return carousel;
    }

    public List<EcommerceCarousel> getEcommerceCarousel() {
        return this.ecommerceCarousels;
    }

    @Override
    public List<EcommerceCarousel> getAllCarousel() {
        return ecommerceCarousels;
    }

    @Override
    public EcommerceCarousel updateCarousel(double id, String item) {
        for (EcommerceCarousel carousel : ecommerceCarousels) {
            if(carousel.getUserId() == id) {
                carousel.setItems(item);
                return carousel;
            }
        }
        return null;
    }

    @Override
    public boolean deleteCarousel(double id) {
        for (EcommerceCarousel carousel: ecommerceCarousels){
            if (carousel.getUserId()==id){
                ecommerceCarousels.remove(carousel);
                return true;

            }
        }
        return false;
    }

    @Override
    public EcommerceCarousel getACarousel(double id) {
        for (EcommerceCarousel carousel: ecommerceCarousels){
            if (carousel.getUserId()==id){
                ecommerceCarousels.remove(carousel);
                return carousel;

            }
        }
        return null;
    }


}
