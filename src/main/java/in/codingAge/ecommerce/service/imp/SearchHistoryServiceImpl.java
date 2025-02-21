package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.repository.imp.SearchHistoryRepositoryImpl;
import in.codingAge.ecommerce.service.SearchHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchHistoryServiceImpl implements SearchHistoryService {

    SearchHistoryRepositoryImpl searchHistoryRepository = new SearchHistoryRepositoryImpl();


    public SearchHistory createSearchHistory(SearchHistory searchHistory) {

        return   searchHistoryRepository.createSearchHistory(searchHistory);
    }

    public List<SearchHistory> getAllSearchHistory() {
        return searchHistoryRepository.getAllSearchHistory();
    }

    public SearchHistory getASearchHistory(double id) {
        return searchHistoryRepository.getASearchHistory(id);
    }

    public SearchHistory updateSearchHistory(double id, String journey) {

        return searchHistoryRepository.updateSearchHistory(id,journey);

    }

    public boolean deleteSearchHistory(double id) {
        return searchHistoryRepository.deleteSearchHistory(id);
    }

}
