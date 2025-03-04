package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.EcommerceCarousel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface EcommerceCarouselRepository extends MongoRepository<EcommerceCarousel,String> {

   Optional<EcommerceCarousel> findByItem(String name);
}
