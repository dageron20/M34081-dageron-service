package com.itmo.microservices.delivery.deliveryService.impl.entity
import com.itmo.microservices.delivery.order.impl.entity.Order
import java.util.Date

import javax.persistence.*

@Entity
class DeliveryService {
    @Id
    var orderProcessingTime: Int? = null
    var MTOProcessing : Int? = null
    @ElementCollection
    var queueOnDelivery = listOf<Order>()
    var slotsDelivery = listOf<Date>()


    constructor()

    constructor(orderProcessingTime: Int?, MTOProcessing: Int?, queueOnDelivery : List<Order>?) {
        this.orderProcessingTime = orderProcessingTime
        this.MTOProcessing = MTOProcessing
        if (queueOnDelivery != null) {
            this.queueOnDelivery = queueOnDelivery
        }
    }
}