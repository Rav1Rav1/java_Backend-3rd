package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.exception.ProductNotFoundException;
import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.repository.EcommerceCarouselRepository;
import in.codingAge.ecommerce.service.EcommerceCarouselService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
     return   ecommerceCarouselRepository.save(carousel);

    }


    @Override
    public Page<EcommerceCarousel> getAllCarousel(int pageNo, int pageSize) {
        Sort sortByItem=Sort.by("item").ascending();
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return ecommerceCarouselRepository.findAll(pageable);
    }

    @Override
    public EcommerceCarousel getACarousel ( String id) {
        return ecommerceCarouselRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Carousel not found"));
    }


    @Override
    public EcommerceCarousel getACarouselByItem(String items) {
        return ecommerceCarouselRepository.findByItem(items).orElseThrow(()->new ProductNotFoundException("Carousel not found"));
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


