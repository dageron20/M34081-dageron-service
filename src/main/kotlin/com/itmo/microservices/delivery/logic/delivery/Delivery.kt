package com.itmo.microservices.delivery.logic.delivery
import com.itmo.microservices.delivery.api.DeliveryAggregate
import com.itmo.microservices.delivery.logic.order.Order
import ru.quipy.domain.AggregateState
import java.util.*

import javax.persistence.*

class Delivery : AggregateState<UUID, DeliveryAggregate> {
    @Id
    private lateinit var deliveryId: UUID
    private var createdAt: Long = System.currentTimeMillis()
    private var updatedAt: Long = System.currentTimeMillis()
    var orderProcessingTime: Int? = null
    var MTOProcessing : Int? = null
//    private var tasks = mutableMapOf<UUID, TaskEntity>()
//    private var deliveryTags = mutableMapOf<UUID, DeliveryTag>()

    @ElementCollection
    var queueOnDelivery = mutableListOf<Order>()
    var accountsList = listOf<Account>()
    override fun getId() = deliveryId
    constructor()

    constructor(orderProcessingTime: Int?, MTOProcessing: Int?, queueOnDelivery : MutableList<Order>?) {
    this.orderProcessingTime = orderProcessingTime
    this.MTOProcessing = MTOProcessing
    if (queueOnDelivery != null) {
            this.queueOnDelivery = queueOnDelivery
        }
    }

    fun DeliveryAggregate.addToQueueCommand(
        order: Order,
        deliveryId: UUID,

    ): DeliveryCreatedEvent {
        queueOnDelivery.add(queueOnDelivery.lastIndex, order)
        return DeliveryCreatedEvent(
            deliveryId = deliveryId,
            order = order
        )
    }


    fun DeliveryAggregate.removeFromQueueCommand(order: Order){
        queueOnDelivery.removeAt(queueOnDelivery.indexOf(order))
    }

    data class Account(
        val id : UUID = UUID.randomUUID()

    )

//    data class TaskEntity(
//        val id : UUID = UUID.randomUUID()
//    )

    data class DeliveryTag(
        val id : UUID = UUID.randomUUID()
    )
}