package com.moneyhub.web.serviceimpls;

import java.util.List;


import com.moneyhub.web.domains.MoneyhubBean;
import com.moneyhub.web.services.MoneyhubService;

public class MoneyhubServiceImpl implements MoneyhubService{
	private static MoneyhubServiceImpl instance = new MoneyhubServiceImpl();
	public static MoneyhubServiceImpl getInstance() {return instance;}
	private MoneyhubServiceImpl() {}

	public void join(MoneyhubBean param) {
		System.out.println("joinService=");
	}
	
	public MoneyhubBean login(MoneyhubBean param) {
		return null;
	}

	public List<String> viewMypage() {
		return null;
	}
	

}
