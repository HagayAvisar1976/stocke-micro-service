package com.stock.micro.service.stockemicroservice.service;

import com.stock.micro.service.stockemicroservice.model.Stock;

import java.util.List;

public interface IStockService {

    void addStock(Stock stock);

    void updateStock(Stock stock);

    void deleteStock(String id);

    List<Stock> getAllStocks();

    Stock getStockById(String id);


}
