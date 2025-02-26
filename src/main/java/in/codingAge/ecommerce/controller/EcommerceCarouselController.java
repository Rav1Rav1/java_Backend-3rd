package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import in.codingAge.ecommerce.service.EcommerceCarouselService;
import in.codingAge.ecommerce.service.imp.EcommerceCarouselServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/carousel")
public class EcommerceCarouselController {


    @Autowired
    private EcommerceCarouselService carouselService;

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
        return carouselService.createEcommerceCarousel(carousel);
    }

    @GetMapping("/get/all")
    public List<EcommerceCarousel> getAllCarousel () {
        return carouselService.getAllCarousel();
    }

    @GetMapping("/get/aCarousel")
    public EcommerceCarousel getACarousel (@RequestParam String id) {
        return carouselService.getACarousel(id);
    }

    @GetMapping("/get/aCarouselItem")
    public EcommerceCarousel getACarouselByItemName (@RequestParam String items) {
        return carouselService.getACarouselByItem(items);
    }

    @PutMapping("/update/item")
    public void updateCarousel(@RequestParam String id,@RequestParam String item) {

         carouselService.updateCarousel(id,item);

    }


@DeleteMapping("/delete")
    public void deleteCarousel(@RequestParam String id){
        carouselService.deleteCarousel(id);

}



}
