package com.stock.micro.service.stockemicroservice.Dao;

import com.stock.micro.service.stockemicroservice.model.Stock;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.cassandra.repository.CassandraRepository;

@Qualifier("Cassandra")
public interface CassandraStockRepo extends CassandraRepository<Stock,String > {
}
