package com.wongweiye.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="SUB")
public class SubscriptionDTO
{

    private double amount;
    private String subsType;
    private String dayOfWeekOrMonth;
    private String startDate;
    private String endDate;

    public SubscriptionDTO(double amount, String subsType, String dayOfWeekOrMonth, String startDate, String endDate) {
        this.amount = amount;
        this.subsType = subsType;
        this.dayOfWeekOrMonth = dayOfWeekOrMonth;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public String getSubsType() {
        return subsType;
    }

    public String getStartDate() {
        return startDate;
    }


    public String getEndDate() {
        return endDate;
    }

    public String getDayOfWeekOrMonth() {
        return dayOfWeekOrMonth;
    }

    public void setDayOfWeekOrMonth(String dayOfWeekOrMonth) {
        this.dayOfWeekOrMonth = dayOfWeekOrMonth;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setSubsType(String subsType) {
        this.subsType = subsType;
    }


    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }


    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "subscriptionDTO{" +
                "amount=" + amount +
                ", subsType='" + subsType + '\'' +
                ", dayOfWeekOrMonth='" + dayOfWeekOrMonth + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
