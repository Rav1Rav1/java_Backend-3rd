package in.codingAge.ecommerce.service;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;
import org.springframework.data.domain.Page;

import java.util.List;

public interface SearchHistoryService {

    SearchHistory createSearchHistory(SearchHistory searchHistory);

    Page<SearchHistory> getAllSearchHistory(int pageNo,int pageSize);

    SearchHistory getASearchHistory(String id);

    void deleteSearchHistory(String id);


    SearchHistory updateSearchHistory(SearchHistory searchHistory);

    SearchHistory getASearchHistoryByJourney(String journey);
}
