package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.repository.imp.EcommerceCarouselRepositoryImp;
import in.codingAge.ecommerce.service.EcommerceCarouselService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class EcommerceCarouselServiceImp implements EcommerceCarouselService {


    EcommerceCarouselRepositoryImp ecommerceCarouselRepositoryImp = new EcommerceCarouselRepositoryImp();
    Scanner sc;
    List<EcommerceCarousel> ecommerceCarouselList1;
    List<EcommerceCarousel> ecommerceCarouselList;
    List<EcommerceCarousel> ecommerceCarouselList2;
    List<EcommerceCarousel> ecommerceCarouselList3;

//    public EcommerceCarouselServiceImp() {
//        this.sc = new Scanner(System.in);
//        this.ecommerceCarouselList1 = new ArrayList();
//        this.ecommerceCarouselList = this.ecommerceCarouselRepositoryImp.getEcommerceCarousel();
//        this.ecommerceCarouselList2 = new ArrayList();
//        this.ecommerceCarouselList3 = new ArrayList();
//    }

//    public List<EcommerceCarousel> createEcommerceCarousel() {
//        return this.ecommerceCarouselRepositoryImp.createEcommerceCarousel();
//    }


    @Override
    public EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel) {
//        EcommerceCarousel ecommerceCarousel = new EcommerceCarousel();
//        ecommerceCarousel.setInterval(carousel.getInterval());
//        ecommerceCarousel.setItems(carousel.getItems());
//        ecommerceCarousel.setUserId(carousel.getUserId());
        return ecommerceCarouselRepositoryImp.createEcommerceCarousel(carousel);
    }

    public List<EcommerceCarousel> getEcommerceCarousel() {
        return this.ecommerceCarouselRepositoryImp.getEcommerceCarousel();
    }

    public List<EcommerceCarousel> getEcommerceCarouselById(double id) {
        for(EcommerceCarousel ecommerceCarousel : this.ecommerceCarouselList) {
            if (ecommerceCarousel.getUserId() == id) {
                this.ecommerceCarouselList1.add(ecommerceCarousel);
            }
        }

        return this.ecommerceCarouselList1;
    }

    public List<EcommerceCarousel> updateEcommerceCarousel(double id) {
        for(EcommerceCarousel ecommerceCarousel : this.ecommerceCarouselList) {
            if (ecommerceCarousel.getUserId() == id) {
                System.out.println("Enter id");
                double userId = this.sc.nextDouble();
                System.out.println("Enter Item");
                String item = this.sc.nextLine();
                System.out.println("Enter Interval");
                double interval = this.sc.nextDouble();
                ecommerceCarousel.setInterval(interval);
                ecommerceCarousel.setItems(item);
                ecommerceCarousel.setUserId(userId);
                this.ecommerceCarouselList2.add(ecommerceCarousel);
            } else {
                this.ecommerceCarouselList2.add(ecommerceCarousel);
            }
        }

        return this.ecommerceCarouselList2;
    }

    public List<EcommerceCarousel> deleteEcommerceCarousel(double id) {
        for(EcommerceCarousel ecommerceCarousel : this.ecommerceCarouselList) {
            if (ecommerceCarousel.getUserId() != id) {
                this.ecommerceCarouselList3.add(ecommerceCarousel);
            }
        }

        return this.ecommerceCarouselList3;
    }

    @Override
    public List<EcommerceCarousel> getAllCarousel() {
        return ecommerceCarouselRepositoryImp.getAllCarousel();
    }

    @Override
    public EcommerceCarousel updateCarousel(double id, String item) {
        return ecommerceCarouselRepositoryImp.updateCarousel(id,item);
    }

    @Override
    public boolean deleteCarousel(double id) {
        return ecommerceCarouselRepositoryImp.deleteCarousel(id);
    }


    @Override
    public EcommerceCarousel getACarousel(double id) {
        return ecommerceCarouselRepositoryImp.getACarousel(id);
    }

}
