package com.itmo.microservices.delivery.api

import ru.quipy.core.annotations.AggregateType
import ru.quipy.domain.Aggregate

@AggregateType(aggregateEventsTableName = "aggregate-delivery")
class DeliveryAggregate : Aggregate