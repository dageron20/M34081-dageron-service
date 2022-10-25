package com.itmo.microservices.createOrder.customer.impl.entity
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Customer {
    @Id
    var name: String? = null
    var surname: String? = null
    var email: String? = null
    var password: String? = null
    var numberPhone: Number? = null


    constructor()

    constructor(name: String?, surname: String?, email: String?, password: String?, numberPhone: Number?) {
        this.name = name
        this.surname = surname
        this.email = email
        this.password = password
        this.numberPhone = numberPhone
    }
}