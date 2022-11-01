package com.itmo.microservices.order.model.catalog

import ru.quipy.core.annotations.AggregateType
import ru.quipy.domain.Aggregate
import ru.quipy.domain.AggregateState
import java.util.*

@AggregateType(aggregateEventsTableName = "aggregate-catalog")
class CatalogAggregate : Aggregate

class UserAggregateState: AggregateState<String, CatalogAggregate> {
    private lateinit var catalogId: String
    private var createdAt: Long = System.currentTimeMillis()
    private var updatedAt: Long = System.currentTimeMillis()

    private var productsId = mutableMapOf<UUID, ProductEntity>()


    override fun getId() = catalogId
}

data class ProductEntity(
    val id: UUID = UUID.randomUUID(),
    val name: String,
    var discription: String,
    var price: Number,
)