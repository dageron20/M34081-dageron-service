package com.itmo.microservices.payment.impl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Payment {
    @Id
    private long paymentID;
    private long orderID;
    private long paymentCardUserID;
    private Date date;

    public Payment() {}

    public Payment(long paymentID, long orderID, long paymentCardUserID, Date date)
    {
        super();
        this.paymentID = paymentID;
        this.orderID = orderID;
        this.paymentCardUserID = paymentCardUserID;
        this.date = date;
    }

    public long getPaymentID()
    {
        return paymentID;
    }

    public void setPayment_ID(long paymentID)
    {
        this.paymentID = paymentID;
    }

    public long getOrderID()
    {
        return orderID;
    }

    public void setOrderID(long orderID)
    {
        this.orderID = orderID;
    }

    public long paymentCardUserID()
    {
        return paymentCardUserID;
    }

    public void setPaymentCardUserID(long paymentCardUserID)
    {
        this.paymentCardUserID = paymentCardUserID;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }
}
