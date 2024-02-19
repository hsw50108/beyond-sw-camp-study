package com.encore.mvc.model.service;

import java.util.Map;

import com.encore.mvc.domain.PostRequestDto;
import com.encore.mvc.model.sql.EncoreDao;

// Service 는 Dao 갖는다.
public class EncoreServiceImpl {
	
	private EncoreDao dao ; 
	public EncoreServiceImpl() {
		dao = new EncoreDao() ; 
	}
	
	// Dao insertRow() 메서드를 호출해서 결과 반환 
	public int insertService(PostRequestDto params) {
		System.out.println(">>> Servivce insertService <<< "); 
		System.out.println(">>> params : " + params);
		int flag = dao.insertRow(params);
		return flag ;  
	}
	
	public int insertService(Map<String, String> params) {
		System.out.println(">>> Dao insertService <<< "); 
		System.out.println(">>> params : " + params); 
		int flag = dao.insertRow(params);
		return flag ; 
	}
}



