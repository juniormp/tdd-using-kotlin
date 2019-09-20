package refactoring

// Bad smells
// - Inappropriate names
// - negative boolean expressions
// - comments
// - To many ifs
// - Variable discount appearing to many times (duplicated code)
class CustomerOld(var age: Boolean, var sub: Boolean, var notFtime: Boolean) {

    fun calculateDiscount(): Int {

        var discount = 0

        discount = if (!age) { // not average limit
            if (!sub) { // not average subsidized
                if (!notFtime) { // not part time
                    500; // part time
                } else {
                    250
                }
            } else {
                250 // already subsidized
            }
        } else {
            0 // overage limit
        }

        return discount
    }
}

class Customer(
    private val isSenior: Boolean,
    private val isAlreadySubsidized: Boolean,
    private val isPartTime: Boolean
) {

    fun calculateDiscount(): Int {

        if (isSenior)
            return 0
        if (isAlreadySubsidized)
            return 250
        if (isPartTime)
            return 250

        return 500
    }
}