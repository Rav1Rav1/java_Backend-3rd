package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.repository.SearchHistoryRepository;
import in.codingAge.ecommerce.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchHistoryServiceImpl implements SearchHistoryService {


    @Autowired
    SearchHistoryRepository searchHistoryRepository;
    @Override
    public SearchHistory createSearchHistory(SearchHistory searchHistory) {
        return searchHistoryRepository.save(searchHistory);
    }

    @Override
    public List<SearchHistory> getAllSearchHistory() {
        return searchHistoryRepository.findAll();
    }

    @Override
    public SearchHistory getASearchHistory(String id) {
        return searchHistoryRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteSearchHistory(String id) {
        searchHistoryRepository.deleteById(id);
    }

    @Override
    public SearchHistory updateSearchHistory(SearchHistory searchHistory) {
        return searchHistoryRepository.save(searchHistory);
    }

    @Override
    public SearchHistory getASearchHistoryByJourney(String id,String journey) {
        return searchHistoryRepository.findAllByJourney();
    }
}
