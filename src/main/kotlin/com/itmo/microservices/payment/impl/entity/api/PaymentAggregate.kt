package com.itmo.microservices.payment.impl.entity.api;

import ru.quipy.core.annotations.AggregateType;
import ru.quipy.domain.Aggregate

@AggregateType(aggregateEventsTableName = "aggregate-payment")
    public class PaymentAggregate : Aggregate