package com.itmo.microservices.createOrder.backetPostion
import javax.persistence.Entity
import javax.persistence.Id

import com.itmo.microservices.createOrder.product.Product
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class BacketPosition {
    @Id
    var count: Number? = null
    @ManyToOne
    @JoinColumn(name = "product_name")
    var product: Product? = null


    constructor()

    constructor(count: Number?, product: Product?) {
        this.count = count
        this.product = product
    }
}