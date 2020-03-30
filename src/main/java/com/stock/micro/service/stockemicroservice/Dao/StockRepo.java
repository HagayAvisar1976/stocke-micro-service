package com.stock.micro.service.stockemicroservice.Dao;

import com.google.common.collect.Lists;
import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public class StockRepo {

    @Autowired
    private CrudRepository<Stock, String > crudRepository;

    void addStock(Stock stock){

        crudRepository.save(stock);
    }

    void updateStock(Stock stock){
        Optional<Stock> stockData = crudRepository.findById(stock.getId());

        if(stockData.isPresent()){
            crudRepository.save(stock);
        }
        else{
            throw new RuntimeException("record is not found for stock id" + stock.getId());
        }

    }

    void deleteStock(String id){

        crudRepository.deleteById(id);

    }

    List<Stock> getAllStocks(){
        List<Stock> result = Lists.newArrayList(crudRepository.findAll());
        return result;

    }

    Stock getStockById(String id){
       Optional<Stock> stockData = crudRepository.findById(id);
       if(stockData.isPresent()){
           return stockData.get();
       }
       else{
           return null;
       }
    }
}
