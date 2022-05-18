fun main() {

/*    println(transferPayment("vkPay", 1000, 1000))
    println(transferPayment("mir", 1000, 1000))
    println(transferPayment("mir", 1000, 5000))
    println(transferPayment("visa", 1000, 1000))
    println(transferPayment("visa", 1000, 5000))
    println(transferPayment("mastercard", 5000, 5000))
    println(transferPayment("mastercard", 5000, 75000))
    println(transferPayment("maestro", 5000, 5000))
    println(transferPayment("maestro", 5000, 75000))*/

}

fun transferPayment(cardType: String, previousTransfers: Int, transfer: Int): Int {
    val commissionVkPay = 0
    val commissionMirVisa3500 = 3500
    val commissionMaestroMastercard0 = 0

    if (cardType == "vkPay") {
        return commissionVkPay

    } else if (cardType == "mir" || cardType == "visa") {
        val commissionMirVisa = ((transfer * 100 * 0.0075) * 100).toInt() / 100
        return if (commissionMirVisa >= 3500) commissionMirVisa else commissionMirVisa3500

    } else if (cardType == "mastercard" || cardType == "maestro") {
        val transferInMonth = ((previousTransfers + transfer) * 100)
        val commissionMaestroMastercard = (((transfer * 100 * 0.006) * 100).toInt() / 100) + 2000
        return if (transferInMonth <= 7_500_000) commissionMaestroMastercard0 else commissionMaestroMastercard

    } else {
        return -1
    }
}


