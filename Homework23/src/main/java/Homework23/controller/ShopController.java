package Homework23.controller;

import Homework23.model.Shop;
import Homework23.service.ShopService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/order")
public class ShopController {
    private final ShopService shopService;

    public ShopController(ShopService shopService) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public List<Integer> addId(@RequestParam List<Integer> ID) {
        return shopService.addId(ID);
    }
    @GetMapping("/get")
    public Collection<Shop> getId() {
        return shopService.getId();
    }

}
