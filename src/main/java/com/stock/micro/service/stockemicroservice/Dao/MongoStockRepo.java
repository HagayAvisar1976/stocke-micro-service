package com.stock.micro.service.stockemicroservice.Dao;

import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoStockRepo extends MongoRepository<Stock,String> {
}
