package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.SearchHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SearchHistoryRepository extends MongoRepository<SearchHistory,String> {

    Optional<SearchHistory> findAllByJourney(String journey);
}
