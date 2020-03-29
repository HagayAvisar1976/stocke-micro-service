package com.stock.micro.service.stockemicroservice.controller;

import com.stock.micro.service.stockemicroservice.model.Stock;
import com.stock.micro.service.stockemicroservice.service.IStockService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/stocks")
public class StockController {

    @Autowired
    IStockService stockService;

    @GetMapping()
    @ApiOperation(value = "This method return all stocks",
    notes = "this is a note", response = Stock.class )
    public List<Stock> getAllStocks(){

        return stockService.getAllStocks();
    }

    @GetMapping(path = "{id}")
    public Stock getStockById(@ApiParam(value = "the id of requested stock")
            @PathVariable String id)
    {
        return stockService.getStockById(id);
    }

    @PostMapping
    public void addStock(@RequestBody Stock stock){
        stockService.addStock(stock);
    }

    @PutMapping
    public void updateStock(@RequestBody Stock stock){
        stockService.updateStock(stock);
    }

    @DeleteMapping(path = "{id}")
    public void deleteStock(@PathVariable String id){
        stockService.deleteStock(id);
    }


}
