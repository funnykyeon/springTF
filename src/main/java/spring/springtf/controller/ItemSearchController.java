//package spring.springtf.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import spring.springtf.domain.dto.ItemDto;
//import spring.springtf.service.ItemSearchService;
//
//import java.io.IOException;
//import java.util.List;
//
//@Controller
//public class ItemSearchController {
//
//    private final ItemSearchService itemSearchService;
//
//    @Autowired
//    public ItemSearchController(ItemSearchService itemSearchService) {
//        this.itemSearchService = itemSearchService;
//    }
//
//    @GetMapping("/api/search")
//    @ResponseBody
//    public List<ItemDto> getItems(@RequestParam String query) throws IOException {
//        List<ItemDto> itemDtoList = itemSearchService.getItems(query);
//
//        return itemDtoList;
//    }
//}
