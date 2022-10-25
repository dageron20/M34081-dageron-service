package com.itmo.microservices.createOrder.catalog

import com.itmo.microservices.createOrder.product.Product

class Catalog {
    var listProduct: Collection<Product>? = null

    constructor()

    constructor(listProduct: Collection<Product>?) {
        this.listProduct = listProduct
    }
}