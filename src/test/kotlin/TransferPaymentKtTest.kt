import org.junit.Assert.assertEquals
import org.junit.Test

class TransferPaymentKtTest {

    @Test
    fun transferPaymentVkPay() {
        // arrange
        val card = "vkPay"
        val previous = 1000
        val transferNew = 1000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(0, result)

    }

    @Test
    fun transferPaymentMir3500() {
        // arrange
        val card = "mir"
        val previous = 1000
        val transferNew = 1000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(3500, result)

    }

    @Test
    fun transferPaymentMir() {
        // arrange
        val card = "mir"
        val previous = 1000
        val transferNew = 5000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(3750, result)

    }

    @Test
    fun transferPaymentVisa3500() {
        // arrange
        val card = "visa"
        val previous = 1000
        val transferNew = 1000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(3500, result)

    }

    @Test
    fun transferPaymentVisa() {
        // arrange
        val card = "visa"
        val previous = 1000
        val transferNew = 5000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(3750, result)

    }

    @Test
    fun transferPaymentMasterCard0() {
        // arrange
        val card = "mastercard"
        val previous = 5000
        val transferNew = 5000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(0, result)

    }

    @Test
    fun transferPaymentMasterCard() {
        // arrange
        val card = "mastercard"
        val previous = 5000
        val transferNew = 75000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(47000, result)

    }

    @Test
    fun transferPaymentMaestro0() {
        // arrange
        val card = "maestro"
        val previous = 5000
        val transferNew = 5000

        // act
        val result = transferPayment(
            cardType = card,
            previousTransfers = previous,
            transfer = transferNew
        )
        // assert
        assertEquals(0, result)
    }

        @Test
        fun transferPaymentMaestro() {
            // arrange
            val card = "maestro"
            val previous = 5000
            val transferNew = 75000

            // act
            val result = transferPayment(
                cardType = card,
                previousTransfers = previous,
                transfer = transferNew
            )
            // assert
            assertEquals(47000, result)

        }



}