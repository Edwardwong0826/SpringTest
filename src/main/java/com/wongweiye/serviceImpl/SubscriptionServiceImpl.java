package com.wongweiye.serviceImpl;

import com.wongweiye.dto.InvoiceDTO;
import com.wongweiye.dto.SubscriptionDTO;
import com.wongweiye.model.Subscription;
import com.wongweiye.repository.SubscriptionRepository;
import com.wongweiye.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SubscriptionServiceImpl implements SubscriptionService {

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Override
    public InvoiceDTO createSubscription(SubscriptionDTO newSubscription) {

        Subscription subs = new Subscription(newSubscription.getAmount(),newSubscription.getSubsType(),
                newSubscription.getDayOfWeekOrMonth(),newSubscription.getStartDate(),newSubscription.getEndDate());

        subscriptionRepository.save(subs);

        LocalDate start = LocalDate.parse(subs.getStartDate(), DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDate end = LocalDate.parse(subs.getEndDate(), DateTimeFormatter.ISO_LOCAL_DATE);

        Period diff = Period.between(
                start.withDayOfMonth(1),
                end.withDayOfMonth(1));
        if(diff.getMonths()>3)
        {
            throw new RuntimeException("Maximum only 3 months allowed");
        }

        List<LocalDate> listOfDates = new ArrayList<>();

        switch(subs.getType()){

            case "DAILY":
                subs.getStartDate();
                while(start.isBefore(end)){

                    listOfDates.add(start.plusWeeks(1));
                }

            case "WEEKLY":
                subs.getStartDate();
                while(start.isBefore(end)){

                    listOfDates.add(start.plusDays(1));
                }

            case "MONTHLY":
                subs.getStartDate();
                while(start.isBefore(end)){

                    listOfDates.add(start.plusMonths(1));
                }

        }

        InvoiceDTO invoice = new InvoiceDTO(subs.getAmount(),subs.getType(),listOfDates);

        return invoice;
    }
}
