package com.example.urbaneasytt.controller;

import com.example.urbaneasytt.entity.Booking;
import com.example.urbaneasytt.model.Transaction;
import com.example.urbaneasytt.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TransactionController {
    @Autowired
    TransactionRepository transactionRepository;

    @GetMapping("/transaction")
    List<Transaction> getDetails() {

        return transactionRepository.getTransactionDetail();
    }
}
