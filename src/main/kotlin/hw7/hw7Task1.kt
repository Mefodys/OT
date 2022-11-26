package hw7

// https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-7/Task-1-2%20EDIT.md

// Необходимо описать класс, описываемый дробные числа (например, 1/2, 3/5).
// Также реализовать методы сложения и вычитания объектов.

fun main() {
    val newFractionalNumber1 = FractionalNumber(1,2)
    val newFractionalNumber2 = FractionalNumber(3,8)

    println("\nequals test:")
    println(newFractionalNumber1.equals(newFractionalNumber1))
    println(newFractionalNumber1.equals(newFractionalNumber2))

    println("\ntoString test:")
    println(newFractionalNumber1.toString())

    println("\nhashCode test:")
    println(newFractionalNumber1.hashCode())

    println("\naddition test:")
    newFractionalNumber1.addition(newFractionalNumber2)

    println("\nsubstruction test:")
    newFractionalNumber1.substruction(newFractionalNumber2)
}

class FractionalNumber(val numerator:Long, val denumerator:Long){
    init {
        println("FractionalNumber is created: $numerator/$denumerator")
    }

    fun addition (digit2:FractionalNumber): FractionalNumber{
        val num = this.numerator * digit2.denumerator + digit2.numerator * this.denumerator
        val denum = digit2.denumerator * this.denumerator
        return FractionalNumber (num, denum)
    }

    fun substruction (digit2:FractionalNumber): FractionalNumber{
        val num = this.numerator * digit2.denumerator - digit2.numerator * this.denumerator
        val denum = digit2.denumerator * this.denumerator
        return FractionalNumber (num, denum)
    }


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