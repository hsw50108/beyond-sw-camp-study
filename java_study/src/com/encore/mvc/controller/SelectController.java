package com.encore.mvc.controller;

import com.encore.mvc.domain.PostResponseDto;
import com.encore.mvc.model.service.EncoreServiceImpl;

import java.util.List;

public class SelectController {

	private EncoreServiceImpl service ;
	public SelectController() {
		service = new EncoreServiceImpl() ;
	}
	public List<PostResponseDto> execute() {
		System.out.println(">>> SelectController execute <<< ");
		// 의존관계형성 후 메서드 호출 / 반환
		return service.selectService() ;
	}
	
	
}
