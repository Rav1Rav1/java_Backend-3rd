package in.codingAge.ecommerce.controller;

import in.codingAge.ecommerce.model.Category;
import in.codingAge.ecommerce.model.SearchHistory;
import in.codingAge.ecommerce.service.SearchHistoryService;
import in.codingAge.ecommerce.service.imp.CategoryServiceImpl;
import in.codingAge.ecommerce.service.imp.SearchHistoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/searchHistory")
public class SearchHistoryController {

//    private final SearchHistoryServiceImpl searchHistoryService = new SearchHistoryServiceImpl();
    @Autowired
    @Qualifier("SearchHistoryServiceImpl")
    private SearchHistoryService searchHistoryService;


    @PostMapping("/create")
    public SearchHistory createSearchHistory(@RequestBody SearchHistory searchHistory) {
        return searchHistoryService.createSearchHistory(searchHistory);
    }


    @GetMapping("/get/all")
    public List<SearchHistory> getAllSearchHistory () {
        return searchHistoryService.getAllSearchHistory();
    }

    @GetMapping("/get/aSearchHistory")
    public SearchHistory getASearchHistory (@RequestParam double id) {
        return searchHistoryService.getASearchHistory(id);
    }


    @PutMapping("/update/journey")
    public SearchHistory updateSearchHistory(@RequestParam double id, String journey) {

        return searchHistoryService.updateSearchHistory(id,journey);

    }
    @DeleteMapping("/delete")
    public boolean deleteSearchHistory(@RequestParam double id){
        return searchHistoryService.deleteSearchHistory(id);

    }

}
