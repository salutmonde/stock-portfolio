package ch.boostmedia.stock.stockportfolio.controller;

import ch.boostmedia.stock.stockportfolio.dto.StockDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

    @PostMapping("/stock/create")
    public StockDto create(@RequestBody StockDto stockDto) {

        return new StockDto("hamid");

    }

    @GetMapping()
    public String create(){
        return "hello";
    }
}
