package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {
   @Query(value="select ifsecode from bank_details where branch like ?",nativeQuery = true)
	String getBranchByIfse(String branch);

}
