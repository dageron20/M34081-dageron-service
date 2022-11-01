package com.itmo.microservices.payment.impl.entity.api

import ru.quipy.core.annotations.DomainEvent
import ru.quipy.domain.Event
import java.math.BigDecimal
import java.util.*

const val SUCCESSFUL_PAYMENT = "SUCCESSFUL_PAYMENT_EVENT"
const val NOT_SUCCESSFUL_PAYMENT = "NOT_SUCCESSFUL_PAYMENT_EVENT"
const val PAYMENT_REORDER = "PAYMENT_REORDER_EVENT"
const val CHANGE_EXTERNAL_SYS_ACC = "CHANGE_EXTERNAL_SYS_ACC_EVENT"

@DomainEvent(name = SUCCESSFUL_PAYMENT)
class SuccessfulPaymentEvent(
    val paymentId: UUID,
) : Event<PaymentAggregate>(
    name = SUCCESSFUL_PAYMENT,
    createdAt = System.currentTimeMillis(),
)
@DomainEvent(name = NOT_SUCCESSFUL_PAYMENT)
class NotSuccessfulPaymentEvent(
    val paymentId: UUID,
) : Event<PaymentAggregate>(
    name = NOT_SUCCESSFUL_PAYMENT,
    createdAt = System.currentTimeMillis(),
)

@DomainEvent(name = PAYMENT_REORDER)
class PaymentReorder(
    val paymentId: UUID,
) : Event<PaymentAggregate>(
    name = PAYMENT_REORDER,
    createdAt = System.currentTimeMillis(),
)

@DomainEvent(name = CHANGE_EXTERNAL_SYS_ACC)
class ChangeExternalSysAcc(
    val paymentId: UUID,
) : Event<PaymentAggregate>(
    name = CHANGE_EXTERNAL_SYS_ACC,
    createdAt = System.currentTimeMillis(),
)