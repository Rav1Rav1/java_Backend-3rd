package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;

import java.util.List;

public interface SearchHistoryService {

    SearchHistory createSearchHistory(SearchHistory searchHistory);

    List<SearchHistory> getAllSearchHistory();

    SearchHistory getASearchHistory(double id);

    SearchHistory updateSearchHistory(double id, String journey);

    boolean deleteSearchHistory(double id);



}
