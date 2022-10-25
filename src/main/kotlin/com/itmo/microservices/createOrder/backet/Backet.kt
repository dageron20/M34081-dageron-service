package com.itmo.microservices.createOrder.backet
import com.itmo.microservices.createOrder.backetPostion.BacketPosition

class Backet {
    var listBacketPosition: Collection<BacketPosition>? = null
    var totalPrice: Number? = null
    var price: Number? = null


    constructor()

    constructor(listBacketPosition: Collection<BacketPosition>?, totalPrice: Number?, price: Number?) {
        this.listBacketPosition = listBacketPosition
        this.totalPrice = totalPrice
        this.price = price
    }
}