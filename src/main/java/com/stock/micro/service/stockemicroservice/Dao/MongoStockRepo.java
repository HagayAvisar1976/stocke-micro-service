package com.stock.micro.service.stockemicroservice.Dao;

import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.repository.MongoRepository;

@Qualifier("Mongo")
public interface MongoStockRepo extends MongoRepository<Stock,String> {
}
