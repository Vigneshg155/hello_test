package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bank;
import com.example.demo.service.BankService;

@RestController
@RequestMapping("bank")
public class BankController {
	@Autowired
	BankService bser;

	@PostMapping(value = "/addlist")
	public String addList(@RequestBody List<Bank> b) {
		return bser.addList(b);
	}

	@GetMapping(value = "/findall")
	public List<Bank> findAll() {
		return bser.findAll();
	}

	@GetMapping(value = "/getbranchbyifce/{branch}")
	public String getBranchByIfse(@PathVariable String branch) {
		return bser.getBranchByIfse(branch);
	}
}
