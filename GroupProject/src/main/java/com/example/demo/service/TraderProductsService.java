package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.TraderProducts;
import com.example.demo.model.Trader;

@Service
public interface TraderProductsService {
	
	List<TraderProducts> fetchProductsList();
	List<TraderProducts> traderproducts(int tid);
	TraderProducts updateProduct(TraderProducts p,int ppid);
	TraderProducts deleteProduct(int ppid);
	void saveProduct(TraderProducts p);
	

}
