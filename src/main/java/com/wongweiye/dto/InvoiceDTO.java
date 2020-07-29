package com.wongweiye.dto;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class InvoiceDTO
{
    private double amount;
    private String subscriptionType;
    private List<LocalDate> invoiceDates;

    public InvoiceDTO(double amount, String subscriptionType, List<LocalDate> invoiceDates) {
        this.amount = amount;
        this.subscriptionType = subscriptionType;
        this.invoiceDates = invoiceDates;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public List<LocalDate> getInvoiceDates() {
        return invoiceDates;
    }

    public void setInvoiceDates(List<LocalDate> invoiceDates) {
        this.invoiceDates = invoiceDates;
    }

    @Override
    public String toString() {
        return "InvoiceDTO{" +
                "amount=" + amount +
                ", subscriptionType='" + subscriptionType + '\'' +
                ", invoiceDates=" + invoiceDates +
                '}';
    }
}
