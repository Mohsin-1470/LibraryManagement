package com.Project.LibaryManagmentSystem.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import com.Project.LibaryManagmentSystem.Entity.StaffDetail;
import com.Project.LibaryManagmentSystem.Repository.StaffDetailRepository;


public class StaffDetailService {

	@Autowired
	private StaffDetailRepository satffDetailRepository;
	
	public StaffDetail saveStaffDetail(StaffDetail staffDetail) {
	return satffDetailRepository.save(staffDetail);
	
}
	public List<StaffDetail>getAllStaffDetail(){
		return satffDetailRepository.findAll();
		
	}
}
