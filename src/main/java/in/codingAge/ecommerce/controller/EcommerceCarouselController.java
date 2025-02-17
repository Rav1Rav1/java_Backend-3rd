package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.service.imp.EcommerceCarouselServiceImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/carousel")
public class EcommerceCarouselController {

//   private final EcommerceCarouselServiceImp ecommerceCarouselServiceImp = new EcommerceCarouselServiceImp();

    private final EcommerceCarouselServiceImp carouselServiceImpl = new EcommerceCarouselServiceImp();

//    @PostMapping
//    public List<EcommerceCarousel> createEcommerceCarousel() {
//        return this.ecommerceCarouselServiceImp.createEcommerceCarousel();
//    }
//
//    @GetMapping
//    public List<EcommerceCarousel> getEcommerceCarousel() {
//        return this.ecommerceCarouselServiceImp.getEcommerceCarousel();
//    }
//    @GetMapping("/{id}")
//    public List<EcommerceCarousel> getEcommerceCarouselById(double id) {
//        return this.ecommerceCarouselServiceImp.getEcommerceCarouselById(id);
//    }
//
//    @PutMapping("/{id}")
//    public List<EcommerceCarousel> updateEcommerceCarousel(@Path double id) {
//        return this.ecommerceCarouselServiceImp.updateEcommerceCarousel(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public List<EcommerceCarousel> deleteEcommerceCarousel(double id) {
//        return this.ecommerceCarouselServiceImp.deleteEcommerceCarousel(id);
//    }


    // POST --> GET --> PUT --> DELETE


//    MODEL --> @RequestBody
    // normal parameter --> @RequestParam
    // normal parmeter --> @Path  // google

    @PostMapping("/create")
    public EcommerceCarousel createCarousel(@RequestBody EcommerceCarousel carousel) {
        return carouselServiceImpl.createEcommerceCarousel(carousel);
    }

    @GetMapping("/get/all")
    public List<EcommerceCarousel> getAllCarousel () {
        return carouselServiceImpl.getAllCarousel();
    }

    @GetMapping("/get/aCaruosel")
    public EcommerceCarousel getACarousel (@RequestParam double id) {
        return carouselServiceImpl.getACarousel(id);
    }

    @PutMapping("/update/item")
    public EcommerceCarousel updateCarousel(@RequestParam double id, String item) {

        return carouselServiceImpl.updateCarousel(id,item);

    }


@DeleteMapping("/delete")
    public boolean deleteCarousel(@RequestParam double id){

        return carouselServiceImpl.deleteCarousel(id);

}



}
