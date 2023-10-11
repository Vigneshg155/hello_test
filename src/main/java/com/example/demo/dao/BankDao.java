package com.example.demo.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bank;
import com.example.demo.repository.BankRepository;

@Repository
public class BankDao {
	@Autowired
	BankRepository bRepo;

	public String addList(List<Bank> b) {
		bRepo.saveAll(b);
		return "Suceess";
	}

	public List<Bank> findAll() {
		return bRepo.findAll();
	}

	public String getBranchByIfse(String branch) {
		return bRepo.getBranchByIfse(branch);
	}

}
