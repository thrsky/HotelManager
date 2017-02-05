package com.hotel.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.hotel.bean.Admin;
import com.hotel.service.AdminService;

public class FindAllAdmin {
	
	public static AdminService adminService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Admin admin;
		List<Admin> list=(List<Admin>) new Admin();
		list = adminService.findAllAdmin();
		for (int i=0;i<list.size();i++){
			System.out.println(list);
		}
	}

}
