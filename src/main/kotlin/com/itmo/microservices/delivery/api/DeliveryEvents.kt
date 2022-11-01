package com.itmo.microservices.delivery.api

import ru.quipy.core.annotations.DomainEvent
import ru.quipy.domain.Event
import java.util.*


@DomainEvent(name = "ADD_TO_QUEUE")
class AddToQueue(
    val deliveryId: UUID,
    val AccountId: UUID,
    createdAt: Long = System.currentTimeMillis(),
) : Event<DeliveryAggregate>(
    name = "ADD_TO_QUEUE",
    createdAt = createdAt,
)

@DomainEvent(name = "REMOVE_FROM_QUEUE")
class RemoveFromQueue(
    val deliveryId: UUID,
    val AccountId: UUID,
    createdAt: Long = System.currentTimeMillis(),
) : Event<DeliveryAggregate>(
    name = "REMOVE_FROM_QUEUE",
    createdAt = createdAt,
)