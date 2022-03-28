package com.bootcamp.bankCredit.service;

import com.bootcamp.bankCredit.model.dto.Client;
import com.bootcamp.bankCredit.model.entities.Credit;
import com.bootcamp.bankCredit.repository.CreditRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class CreditServiceImpl implements CreditService {

    private static final Logger log = LoggerFactory.getLogger(CreditServiceImpl.class);

    @Autowired
    private CreditRepository creditRepository;

    @Override
    public Mono<Credit> findByContractNumber(String contractNumber) {
        return creditRepository.findByContractNumber(contractNumber);
    }

    @Override
    public Flux<Credit> findByClientIdNumber(String clientIdNumber){
        return creditRepository.findByClientIdNumber(clientIdNumber);
    }

    @Override
    public Mono<Credit> validateClientIdNumber(String clientIdNumber) {
        return null;
    }


    @Override
    public Mono<Credit> create(Credit obj) {
        return creditRepository.save(obj);
    }

    @Override
    public Flux<Credit> findAll() {
        return creditRepository.findAll();
    }

    @Override
    public Mono<Credit> findById(String id) {
        return creditRepository.findById(id);
    }

    @Override
    public Mono<Credit> update(Credit obj) {
        return creditRepository.save(obj);
    }

    @Override
    public Mono<Void> deleteByIdCredit(String id) {
        return creditRepository.deleteById(id);
    }
}
