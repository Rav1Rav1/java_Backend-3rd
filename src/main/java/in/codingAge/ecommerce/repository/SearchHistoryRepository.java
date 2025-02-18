package in.codingAge.ecommerce.repository;

import in.codingAge.ecommerce.model.SearchHistory;

import java.util.List;

public interface SearchHistoryRepository {

    SearchHistory createSearchHistory(SearchHistory searchHistory);

    List<SearchHistory> getAllSearchHistory();

    SearchHistory getASearchHistory(double id);

    SearchHistory updateSearchHistory(double id, String journey);

    boolean deleteSearchHistory(double id);


}
