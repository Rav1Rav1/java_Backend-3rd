package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;

import java.util.List;

public interface SearchHistoryService {

    SearchHistory createSearchHistory(SearchHistory searchHistory);

    List<SearchHistory> getAllSearchHistory();

    SearchHistory getASearchHistory(String id);

    void deleteSearchHistory(String id);


    SearchHistory updateSearchHistory(SearchHistory searchHistory);

    SearchHistory getASearchHistoryByJourney(String id ,String journey);
}
