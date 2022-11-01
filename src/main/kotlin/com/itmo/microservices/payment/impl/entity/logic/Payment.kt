import com.itmo.microservices.payment.impl.entity.api.ChangeExternalSysAcc
import com.itmo.microservices.payment.impl.entity.api.PaymentAggregate
import com.itmo.microservices.payment.impl.entity.api.PaymentReorder
import com.itmo.microservices.payment.impl.entity.api.SuccessfulPaymentEvent
import ru.quipy.domain.AggregateState
import java.lang.NumberFormatException
import java.util.*

class Payment : AggregateState<UUID, PaymentAggregate> {
    private lateinit var paymentId: UUID
    private var createdAt: Long = System.currentTimeMillis()
    private var updatedAt: Long = System.currentTimeMillis()

    private lateinit var timeAfterOrder: Date
    private lateinit var SLA: Date



    private var paymentsId = mutableMapOf<UUID, PaymentEntity>()
    override fun getId() = paymentId

    fun PaymentAggregate.orderPaymentCommand(
        userId: UUID,
        PaymentCardUser: Number
    ) : SuccessfulPaymentEvent {
        // send user data to external system account
        // check balance user

        return SuccessfulPaymentEvent(
            paymentId = paymentId
        )
    }

    fun PaymentAggregate.timeAfterOrderTimeOutCommand(
        userId: UUID,
    ) : PaymentReorder {
        // ?
        return PaymentReorder(
            paymentId = paymentId
        // id user?
        )
    }

    fun PaymentAggregate.notEnoughMoneyCommand(
        userId: UUID,
    ) : ChangeExternalSysAcc {
        // ?
        return ChangeExternalSysAcc(
            paymentId = paymentId,
            // ? id system
        )
    }

}

data class PaymentEntity (
    val id: UUID = UUID.randomUUID(),
    val orderId: Long,
    var paymentCardUserID: String,
    var price: Number,
)


