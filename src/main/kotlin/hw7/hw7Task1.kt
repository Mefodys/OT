package hw7

// https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-7/Task-1-2%20EDIT.md

// Необходимо описать класс, описываемый дробные числа (например, 1/2, 3/5).
// Также реализовать методы сложения и вычитания объектов.

fun main() {
    val newFractionalNumber1 = FractionalNumber(1,2)
    val newFractionalNumber2 = FractionalNumber(3,8)

    println("\naddition test:")

    val resulOfAddition = newFractionalNumber1 + newFractionalNumber2
    println(resulOfAddition)

    println("\nsubstruction test:")

    val resulOfSubstruction = newFractionalNumber1 + newFractionalNumber2
    println(resulOfSubstruction)

    println("\nequals test:")
    println(newFractionalNumber1.equals(newFractionalNumber1))
    println(newFractionalNumber1.equals(newFractionalNumber2))

    println("\ntoString test:")
    println(newFractionalNumber1.toString())

    println("\nhashCode test:")
    println(newFractionalNumber1.hashCode())

}

class FractionalNumber(val numerator:Long, val denumerator:Long){
    init {
        println("FractionalNumber is created: $numerator/$denumerator")
    }

    operator fun plus(p: FractionalNumber) = FractionalNumber(this.numerator * p.denumerator + p.numerator * this.denumerator, p.denumerator * this.denumerator)

    operator fun minus(p: FractionalNumber) = FractionalNumber(this.numerator * p.denumerator - p.numerator * this.denumerator, p.denumerator * this.denumerator)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FractionalNumber

        if (numerator != other.numerator) return false
        if (denumerator != other.denumerator) return false

        return true
    }

    override fun hashCode(): Int {
        var result = numerator.toInt()
        result = 31 * result + denumerator.toInt()
        return result
    }

    override fun toString(): String {
        return "FractionalNumber(numerator=$numerator, denumerator=$denumerator)"
    }
}
