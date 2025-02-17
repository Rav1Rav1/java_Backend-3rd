package in.codingAge.ecommerce.repository;

import java.util.List;

public interface SearchHistoryRepository {

    SearchHistoryRepository createSearchHistory(in.codingAge.ecommerce.model.SearchHistory searchHistory);

    List<in.codingAge.ecommerce.model.SearchHistory> getAllSearchHistory();

    in.codingAge.ecommerce.model.SearchHistory getASearchHistory(double id);

    in.codingAge.ecommerce.model.SearchHistory updateSearchHistory(double id, String journey);

    boolean deleteSearchHistory(double id);


}
