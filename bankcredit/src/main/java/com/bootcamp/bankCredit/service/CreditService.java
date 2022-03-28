package com.bootcamp.bankCredit.service;

import com.bootcamp.bankCredit.model.dto.Client;
import com.bootcamp.bankCredit.model.entities.Credit;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface CreditService{


    Mono<Credit> findByContractNumber(String contractNumber);




    Flux<Credit> findByClientIdNumber(String clientIdNumber);

    Mono<Credit> validateClientIdNumber(String clientIdNumber);

    Mono<Credit> create(Credit obj);

    Flux<Credit> findAll();

    Mono<Credit> findById(String id);

    Mono<Credit> update(Credit obj);

    Mono<Void> deleteByIdCredit(String id);


}
