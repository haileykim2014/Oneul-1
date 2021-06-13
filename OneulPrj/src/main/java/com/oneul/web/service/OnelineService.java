package com.oneul.web.service;

import java.util.List;

import com.oneul.web.entity.Oneline;

public interface OnelineService {

	List<Oneline> getList();
	List<Oneline> getList(int page);
	List<Oneline> getList(int page, String field, String query); //serviceimp.java
	
	int insert(Oneline oneline);
	int delete(int id);
	

}
