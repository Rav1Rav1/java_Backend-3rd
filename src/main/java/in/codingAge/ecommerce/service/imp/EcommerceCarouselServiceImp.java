package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.repository.EcommerceCarouselRepository;
import in.codingAge.ecommerce.service.EcommerceCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EcommerceCarouselServiceImp implements EcommerceCarouselService {


    @Autowired
    EcommerceCarouselRepository ecommerceCarouselRepository;

    @Override
    public EcommerceCarousel createEcommerceCarousel(EcommerceCarousel carousel) {
        EcommerceCarousel ecommerceCarousel = new EcommerceCarousel();
       ecommerceCarouselRepository.save(carousel);
        return ecommerceCarousel;
    }


    @Override
    public List<EcommerceCarousel> getAllCarousel() {
        return ecommerceCarouselRepository.findAll();
    }

    @Override
    public EcommerceCarousel getACarousel ( String id) {
        return ecommerceCarouselRepository.findById(id).orElse(null);
    }


    @Override
    public EcommerceCarousel getACarouselByItem(String items) {
        return ecommerceCarouselRepository.findByItem(items);
    }

    @Override
    public void updateCarousel(String id, String item) {
        EcommerceCarousel ecommerceCarousel =ecommerceCarouselRepository.findById(id).orElse(null);
        if(ecommerceCarousel !=null) {
            ecommerceCarousel.setItem(item);
            ecommerceCarouselRepository.save(ecommerceCarousel);
        }
    }

    @Override
    public void deleteCarousel(String id) {
        ecommerceCarouselRepository.deleteById(id);
    }

}


