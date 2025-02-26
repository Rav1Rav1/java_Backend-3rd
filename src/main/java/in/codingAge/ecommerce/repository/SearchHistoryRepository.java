package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.SearchHistory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchHistoryRepository extends MongoRepository<SearchHistory,String> {

    SearchHistory findAllByJourney();
}
