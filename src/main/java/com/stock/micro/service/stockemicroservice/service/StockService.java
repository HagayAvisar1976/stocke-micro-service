package com.stock.micro.service.stockemicroservice.service;

import com.stock.micro.service.stockemicroservice.Dao.H2StockRepo;
import com.stock.micro.service.stockemicroservice.Dao.MongoStockRepo;
import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class StockService implements IStockService{

    //@Autowired
    //private StockRepoCassandra stockRepoCassandra;

    //@Autowired
    //private H2StockRepo h2StockRepo;

    @Autowired
    private MongoStockRepo mongoStockRepo;

    List<Stock> list = new ArrayList<Stock>();

    public StockService(){
        list.add(new Stock("FB",100, new Date()));
        list.add(new Stock("SPY",101, new Date()));
        list.add(new Stock("AMZ",102, new Date()));
        list.add(new Stock("AAPL",103, new Date()));
    }
    @Override
    public void addStock(Stock stock) {

        list.add(stock);
        mongoStockRepo.save(stock);
        //cassandraRepository.save(stock);
        //h2StockRepo.save(stock);

    }

    @Override
    public void updateStock(Stock stock) {
        Optional<Stock> result = list.stream().filter(s -> s.getId().equals(stock.getId())).findFirst();

        if(result.isPresent()){
            Stock toUpdate = result.get();
            toUpdate.setValue(stock.getValue());
            toUpdate.setValueDate(stock.getValueDate());
        }
    }

    @Override
    public void deleteStock(String id) {
        list.removeIf(s-> s.getId().equals(id));

    }

    @Override
    public List<Stock> getAllStocks() {
        return list;
    }

    @Override
    public Stock getStockById(String id) {
        Optional<Stock> result = list.stream().filter(s -> s.getId().equals(id)).findAny();
        return result.isPresent()? result.get(): null;
    }
}
