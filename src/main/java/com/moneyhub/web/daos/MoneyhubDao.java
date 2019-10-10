package com.moneyhub.web.daos;

import java.util.List;

import com.moneyhub.web.domains.MoneyhubBean;

public interface MoneyhubDao {
	public void insertJoin(MoneyhubBean param);
	public MoneyhubBean selectLogin(MoneyhubBean param);
	public List<String> searchMypage();
}
