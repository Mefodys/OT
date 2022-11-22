package hw7

// https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-7/Task-1-2%20EDIT.md

// Необходимо описать класс, описываемый дробные числа (например, 1/2, 3/5).
// Также реализовать методы сложения и вычитания объектов.

fun main() {
    val newDrobnoeChislo1 = DrobnieChisla(1,2)
    val newDrobnoeChislo2 = DrobnieChisla(3,5)

    println("----")
    slojenieUsingFunction(newDrobnoeChislo1,newDrobnoeChislo2)
    vichitanieUsingFunction(newDrobnoeChislo1,newDrobnoeChislo2)

    println("----")
    println(newDrobnoeChislo1.slojenie(newDrobnoeChislo2))
    println(newDrobnoeChislo1.vichitanie(newDrobnoeChislo2))

}

//class DrobnieChisla(val chislitel:Int, val znamenatel:Int){
//    init {
//        println("DrobnoeChislo is created: $chislitel/$znamenatel")
//    }
//
//}
//
fun slojenieUsingFunction (chislo1:DrobnieChisla,chislo2:DrobnieChisla){
    println("${chislo1.chislitel * chislo2.znamenatel}/${chislo1.znamenatel * chislo2.znamenatel} + " +
            "${chislo2.chislitel * chislo1.znamenatel}/${chislo2.znamenatel * chislo1.znamenatel} = " +
            "${chislo1.chislitel * chislo2.znamenatel + chislo2.chislitel * chislo1.znamenatel}/${chislo2.znamenatel * chislo1.znamenatel}")

}

fun vichitanieUsingFunction (chislo1:DrobnieChisla,chislo2:DrobnieChisla){
    println("${chislo1.chislitel * chislo2.znamenatel}/${chislo1.znamenatel * chislo2.znamenatel} - " +
            "${chislo2.chislitel * chislo1.znamenatel}/${chislo2.znamenatel * chislo1.znamenatel} = " +
            "${chislo1.chislitel * chislo2.znamenatel - chislo2.chislitel * chislo1.znamenatel}/${chislo2.znamenatel * chislo1.znamenatel}")

}

class DrobnieChisla(val chislitel:Int, val znamenatel:Int){
    init {
        println("DrobnoeChislo is created: $chislitel/$znamenatel")
    }

    fun slojenie (chislo2:DrobnieChisla): String{
        val result= "${this.chislitel * chislo2.znamenatel}/${this.znamenatel * chislo2.znamenatel} + " +
                "${chislo2.chislitel * this.znamenatel}/${chislo2.znamenatel * this.znamenatel} = " +
                "${this.chislitel * chislo2.znamenatel + chislo2.chislitel * this.znamenatel}/${chislo2.znamenatel * this.znamenatel}"
        return result
    }

    fun vichitanie (chislo2:DrobnieChisla): String{
        val result = ("${this.chislitel * chislo2.znamenatel}/${this.znamenatel * chislo2.znamenatel} - " +
                "${chislo2.chislitel * this.znamenatel}/${chislo2.znamenatel * this.znamenatel} = " +
                "${this.chislitel * chislo2.znamenatel - chislo2.chislitel * this.znamenatel}/${chislo2.znamenatel * this.znamenatel}")
        return result
    }
}

