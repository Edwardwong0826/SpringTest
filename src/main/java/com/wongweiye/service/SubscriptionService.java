package com.wongweiye.service;

import com.wongweiye.dto.InvoiceDTO;
import com.wongweiye.dto.SubscriptionDTO;
import com.wongweiye.model.Subscription;
import org.springframework.stereotype.Service;

@Service
public interface SubscriptionService {

    InvoiceDTO createSubscription(SubscriptionDTO newSubscription);

}
