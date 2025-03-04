package in.codingAge.ecommerce.service.imp;

import in.codingAge.ecommerce.exception.ProductNotFoundException;
import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.repository.SearchHistoryRepository;
import in.codingAge.ecommerce.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public Page<SearchHistory> getAllSearchHistory(int pageNo,int pageSize) {
        Sort sortById=Sort.by("Id").ascending();
        Pageable pageable= PageRequest.of(pageNo,pageSize);
        return searchHistoryRepository.findAll(pageable);
    }

    @Override
    public SearchHistory getASearchHistory(String id) {
        return searchHistoryRepository.findById(id).orElseThrow(()->new ProductNotFoundException("Search history not found "));
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
    public SearchHistory getASearchHistoryByJourney(String journey) {
        return searchHistoryRepository.findAllByJourney(journey).orElseThrow(()->new ProductNotFoundException("Search history not found "));
    }
}
