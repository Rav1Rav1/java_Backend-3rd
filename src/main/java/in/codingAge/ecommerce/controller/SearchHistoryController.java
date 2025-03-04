package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.base.ApiResponse;
import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.service.SearchHistoryService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/searchHistory")
public class SearchHistoryController {

//    private final SearchHistoryServiceImpl searchHistoryService = new SearchHistoryServiceImpl();
    @Autowired

//    @Qualifier("SearchHistoryServiceImpl")
    private SearchHistoryService searchHistoryService;


    @PostMapping("/create")
    public SearchHistory createSearchHistory(@RequestBody SearchHistory searchHistory) {
        return searchHistoryService.createSearchHistory(searchHistory);
    }


    @GetMapping("/get/all")
    public Page<SearchHistory> getAllSearchHistory (@RequestParam int pageNo, int pageSize) {
        return searchHistoryService.getAllSearchHistory(pageNo,pageSize);
    }

    @GetMapping("/get/aSearchHistory")
    public ApiResponse<SearchHistory> getASearchHistory (@RequestParam String id) {
        return new ApiResponse<>(searchHistoryService.getASearchHistory(id),"success",null) ;
    }

    @GetMapping("/get/aSearchHistoryByJourney")
    public ApiResponse<SearchHistory> getASearchHistoryByJourney (@RequestParam String journey) {
        return new ApiResponse<>(searchHistoryService.getASearchHistoryByJourney(journey),"success",null) ;
    }


    @PutMapping("/update/journey")
    public SearchHistory updateSearchHistory(@RequestBody SearchHistory searchHistory) {

        return searchHistoryService.updateSearchHistory(searchHistory);

    }
    @DeleteMapping("/delete")
    public void deleteSearchHistory(@RequestParam String id){
         searchHistoryService.deleteSearchHistory(id);

    }

}
