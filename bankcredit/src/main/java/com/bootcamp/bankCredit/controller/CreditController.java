package com.bootcamp.bankCredit.controller;

import com.bootcamp.bankCredit.model.dto.Client;
import com.bootcamp.bankCredit.model.entities.Credit;
import com.bootcamp.bankCredit.service.CreditService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.annotation.Resource;

@RestController
@RequestMapping(path = "/api/credit")
public class CreditController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CreditController.class);
    @Autowired(required = false)
    private WebClient.Builder webClient;
    @Resource
    private CreditService creditService;


    @GetMapping("/contract-number/{contractNumber}")
    public Mono<Credit> findByContractNumber(@PathVariable String contractNumber) {
        LOGGER.debug("Getting Credit!");
        return creditService.findByContractNumber(contractNumber);
    }

    @GetMapping("/client/{clientIdNumber}")
    public Flux<Credit> findByClientIdNumber(@PathVariable String clientIdNumber) {
        LOGGER.debug("Getting Credits!");
        return creditService.findByClientIdNumber(clientIdNumber);
    }



    @GetMapping("/validate/{clientIdNumber}")
    public Mono<Credit> validateClientIdNumber(@PathVariable String clientIdNumber) {
        LOGGER.debug("Validating client idNumber!");
        return creditService.validateClientIdNumber(clientIdNumber);
    }

    @PostMapping("/")
    public Mono<Credit> create(@RequestBody Credit obj) {
        LOGGER.debug("Creading credit!");
        return creditService.create(obj);
    }


    @GetMapping("/")
    public Flux<Credit> findAll() {
        LOGGER.debug("Getting credits!");
        return creditService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Credit> findById(@PathVariable String id) {
        LOGGER.debug("Getting one credit!");
        return creditService.findById(id);
    }

    @PutMapping("/{id}")
    public Mono<Credit> update(@RequestBody Credit obj, @PathVariable String id) {
        return creditService.update(obj);
    }


    @DeleteMapping("/{id}")
    public Mono<Void> deleteByIdCredit(@PathVariable String id){
        return creditService.deleteByIdCredit(id);
    }



}
