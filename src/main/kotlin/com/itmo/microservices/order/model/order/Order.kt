package com.itmo.microservices.order.model.order
import com.itmo.microservices.order.model.catalog.ProductEntity
import com.itmo.microservices.order.model.user.impl.entity.UserAggregate
import ru.quipy.core.annotations.AggregateType
import ru.quipy.core.annotations.DomainEvent
import ru.quipy.domain.Aggregate
import ru.quipy.domain.AggregateState
import ru.quipy.domain.Event
import java.util.*

@AggregateType(aggregateEventsTableName = "aggregate-order")
class OrderAggregate : Aggregate

class OrderAggregateState: AggregateState<String, OrderAggregate> {
    private lateinit var orderId: String
    private var createdAt: Long = System.currentTimeMillis()
    private var updatedAt: Long = System.currentTimeMillis()

    private var userId = mutableMapOf<UUID, UserAggregate>()

    private lateinit var orderItem: Dictionary<ProductEntity, Number>
    private lateinit var deliveryTime: Date

    private var discardedOrder: Boolean = false

    override fun getId() = orderId

}

//fun OrderAggregate.createOrderCommand(
//    orderId: UUID = UUID.randomUUID(),
//    name: String,
//    password: String,
//    login: String
//): OrderCreatedEvent {
//    if (name.length < 3) {
//        throw IllegalArgumentException("Name is too small aggregate id: $aggregateId")
//    }
//    if (password.isBlank()) {
//        throw IllegalArgumentException("Can't change password: empty provided. Aggregate id: $aggregateId")
//    }
//    if (password.length < 8) {
//        throw IllegalArgumentException("Password is too weak aggregate id: $aggregateId")
//    }
//
//    return OrderCreatedEvent(
//        userId = userId,
//        userLogin = login,
//        userPassword = password,
//        userName = name
//    )
//}
//
//fun OrderCreatedEvent{
//
//}

@DomainEvent(name = "USER_SET_TIME_DELIVERY")
class UserSetTimeDelivery(
    val orderId: String,
    val deliveryTime: Date,
    createdAt: Long = System.currentTimeMillis(),
) : Event<OrderAggregate>(
    name = "USER_SET_TIME_DELIVERY",
    createdAt = createdAt
)

@DomainEvent(name = "USER_CHANGE_ORDER_ITEM")
class UserChangeOrderItem(
    val orderId: String,
    val orderItem: Dictionary<ProductEntity, Number>,
    createdAt: Long = System.currentTimeMillis(),
) : Event<OrderAggregate>(
    name = "USER_CHANGE_ORDER_ITEM",
    createdAt = createdAt
)

@DomainEvent(name = "USER_BOOKING_ORDER")
class UserBookingOrder(
    val orderId: String,
    val bookingRequest: String,
    createdAt: Long = System.currentTimeMillis(),
) : Event<OrderAggregate>(
    name = "USER_BOOKING_ORDER",
    createdAt = createdAt
)

@DomainEvent(name = "USER_DISCARDED_ORDER")
class UserDiscardedOrder(
    val orderId: String,
    val discarded: String,
    createdAt: Long = System.currentTimeMillis(),
) : Event<OrderAggregate>(
    name = "USER_DISCARDED_ORDER",
    createdAt = createdAt
)

