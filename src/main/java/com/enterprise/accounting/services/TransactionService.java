package com.enterprise.accounting.services;

import com.enterprise.accounting.repositories.TransactionRepository;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
    private TransactionRepository repository;

    public TransactionService(TransactionRepository repository){
        this.repository = repository;
    }


}
