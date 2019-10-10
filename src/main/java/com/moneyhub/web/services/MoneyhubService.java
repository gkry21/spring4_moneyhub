package com.moneyhub.web.services;

import java.util.List;

import com.moneyhub.web.domains.MoneyhubBean;

public interface MoneyhubService {
	public void join(MoneyhubBean param);
	public MoneyhubBean login(MoneyhubBean param);
	public List<String> viewMypage();
}
