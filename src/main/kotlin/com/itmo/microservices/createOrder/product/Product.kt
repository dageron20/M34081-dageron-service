package com.itmo.microservices.createOrder.product
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Product {
    @Id
    var name: String? = null
    var discription: String? = null
    var price: Number? = null


    constructor()

    constructor(name: String?, discription: String?, price: Number?) {
        this.name = name
        this.discription = discription
        this.price = price
    }
}