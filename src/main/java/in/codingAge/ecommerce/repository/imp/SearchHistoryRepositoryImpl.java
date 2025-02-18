package in.codingAge.ecommerce.repository.imp;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.repository.SearchHistoryRepository;

import java.util.ArrayList;
import java.util.List;

public class SearchHistoryRepositoryImpl implements SearchHistoryRepository {

    List<SearchHistory> searchHistories=new ArrayList<>();

    public SearchHistory createSearchHistory(SearchHistory searchHistory) {

        searchHistories.add(searchHistory);
        return searchHistory;
    }

    public List<SearchHistory> getAllSearchHistory() {
        return searchHistories;
    }

    public SearchHistory getASearchHistory(double id) {
        for( SearchHistory searchHistory : searchHistories){
            if(searchHistory.getUserId()==id){
                return searchHistory;
            }
        }
        return null;
    }

    public SearchHistory updateSearchHistory(double id, String journey) {

        for (SearchHistory searchHistory : searchHistories) {
            if(searchHistory.getUserId() == id) {
                searchHistory.setJourney(journey);
                return searchHistory;
            }
        }
        return null;
    }

    public boolean deleteSearchHistory(double id) {
        for (SearchHistory searchHistory : searchHistories){
            if (searchHistory.getUserId()==id){
                searchHistories.remove(searchHistory);
                return true;

            }
        }
        return false;
    }


}
