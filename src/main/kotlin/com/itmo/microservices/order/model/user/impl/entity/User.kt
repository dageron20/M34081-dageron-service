package com.itmo.microservices.order.model.user.impl.entity
import com.itmo.microservices.order.model.order.OrderAggregate
import ru.quipy.core.annotations.AggregateType
import ru.quipy.domain.Aggregate
import ru.quipy.domain.AggregateState
import java.util.*

@AggregateType(aggregateEventsTableName = "aggregate-customer")
class UserAggregate : Aggregate

class UserAggregateState: AggregateState<String, UserAggregate> {
    private lateinit var userId: String
    private lateinit var name: String
    private lateinit var surname: String
    private lateinit var email: String
    private lateinit var password: String
    private lateinit var numberPhone: Number
    private var createdAt: Long = System.currentTimeMillis()
    private var updatedAt: Long = System.currentTimeMillis()

    private var ordersId = mutableMapOf<UUID, OrderAggregate>()


    override fun getId() = userId
}