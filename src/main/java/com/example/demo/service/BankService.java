package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BankDao;
import com.example.demo.entity.Bank;

@Service
public class BankService {
	@Autowired
	BankDao bDao;

	public String addList(List<Bank> b) {
		return bDao.addList(b);
	}

	public List<Bank> findAll() {
	 return bDao.findAll();
	}

	public String getBranchByIfse(String branch) {
		return bDao.getBranchByIfse(branch);
	}

}
