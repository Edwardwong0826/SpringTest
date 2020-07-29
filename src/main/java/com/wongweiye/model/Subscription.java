package com.wongweiye.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sub")
public class Subscription {

    @Id
    @GeneratedValue
    private long id;
    private double amount;
    private String type;
    private String dayOfWeekOrMonth;
    private String startDate;
    private String endDate;

    public Subscription(double amount, String type, String dayOfWeekOrMonth, String startDate, String endDate) {
        this.amount = amount;
        this.type = type;
        this.dayOfWeekOrMonth = dayOfWeekOrMonth;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDayOfWeekOrMonth() {
        return dayOfWeekOrMonth;
    }

    public void setDayOfWeekOrMonth(String dayOfWeekOrMonth) {
        this.dayOfWeekOrMonth = dayOfWeekOrMonth;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "subscription{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                ", dayOfWeekOrMonth='" + dayOfWeekOrMonth + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
