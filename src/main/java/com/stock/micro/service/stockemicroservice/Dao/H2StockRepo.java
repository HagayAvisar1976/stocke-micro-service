package com.stock.micro.service.stockemicroservice.Dao;

import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface H2StockRepo extends CrudRepository<Stock, String> {
}
