package com.itmo.microservices.delivery.order.impl.entity;

import com.itmo.microservices.createOrder.backet.Backet
import com.itmo.microservices.createOrder.customer.impl.entity.Customer
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
public class Order {
    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "cutomer_name", nullable = false)

    var customer: Customer? = null

    var timeDelivery: Date? = null

    constructor()

    constructor(customer: Customer?, deliveryTime: Date?) {
        this.customer = customer
        this.timeDelivery = deliveryTime
    }

}
