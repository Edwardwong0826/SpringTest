package com.wongweiye.controller;

import com.wongweiye.dto.InvoiceDTO;
import com.wongweiye.dto.SubscriptionDTO;
import com.wongweiye.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path ="/subscription")
@RestController
public class SubscriptionController {

    @Autowired
    private SubscriptionService subsService;

    @PostMapping("/create")
    public ResponseEntity createSubscription(@RequestBody SubscriptionDTO newSubscription){

        InvoiceDTO invoice = subsService.createSubscription(newSubscription);

        if(invoice != null) {
            return ResponseEntity.ok().body(invoice);
        }
        else
        {
            return ResponseEntity.notFound().build();

        }

    }

}
