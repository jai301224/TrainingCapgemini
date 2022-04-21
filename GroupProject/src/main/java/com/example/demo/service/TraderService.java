package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Trader;

@Service
public interface TraderService {
	
	List<Trader> fetchTraderList(String tname,String tphone,String tmailid);
	Trader updateTrader(Trader t,int tid);
	Trader deleteTrader(int tid);
	void saveTrader(Trader t);
}
