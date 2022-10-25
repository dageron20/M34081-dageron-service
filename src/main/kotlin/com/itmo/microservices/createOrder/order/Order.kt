package com.itmo.microservices.createOrder.order
import com.itmo.microservices.createOrder.backet.Backet
import com.itmo.microservices.createOrder.customer.impl.entity.Customer
import com.itmo.microservices.createOrder.product.Product
import java.util.Date
import javax.persistence.*

@Entity
class Order {
    @Id
    @OneToOne(optional = false)
    @JoinColumn(name = "cutomer_name", nullable = false)
    var cutomer: Customer? = null


    var backet: Backet?
        get() = null
        set(value) = TODO()

    var deliveryTime: Date? = null


    constructor()

    constructor(cutomer: Customer?, backet: Backet?, deliveryTime: Date?) {
        this.cutomer = cutomer
        this.backet = backet
        this.deliveryTime = deliveryTime
    }
}