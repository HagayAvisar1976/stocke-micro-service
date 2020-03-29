package com.stock.micro.service.stockemicroservice.Dao;

import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraStockRepo extends CassandraRepository<Stock,String > {
}
