package hw7
import java.time.LocalDate
import java.util.*

fun main() {
    println("hello hw7 task2")

    val customer1 = Customer("Mr.Smith")

    val orderItem1= OrderItem("Item1", 10.0, 100)
    val orderItem2= OrderItem("Item2", 5.0, 10)
    val listOfOrders = listOf<OrderItem>(orderItem1,orderItem2)

    val orderDetails1 = OrderDetails(listOfOrders)

    val payment1 = OnlinePayment(1, Currency.DOLLAR )

    val order1 = Order(customer1, orderDetails1, payment1)

    println(order1)

}

// https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-7/Task-1-2%20EDIT.md

// Необходимо перенести предложенное текстовое описание структуры класса в код, сохраняя
// все требовании и назавние полей или методов.
// Методы можно не реализовывать, достаточно сделать их компилируемыми.

enum class OrderStatus{
    SEND, //отправлен,
    WAITING_FOR_PAYMENT, // ждет оплаты,
    ALREADY_PAID, //оплачен
    IN_PROCESS, //обрабатывается,
    DELIVERED //получен
}

//class Date {
//    val date = { LocalDate.now() }
//}

class Order(val customer: Customer, val details:OrderDetails, val payment: Payment){
    //val customer: Customer //покупатель
    //val details: OrderDetails //детали заказа
    //val payment: Payment? //опциональная оплата

    val date = LocalDate.now() //дата оформления

    var status: OrderStatus = OrderStatus.WAITING_FOR_PAYMENT//текущий статус, где OrderStatus - enum из: отправлен, ждет оплаты, оплачен, обрабатывается, получен

    fun calcPrice(): Int { return 1}
    fun calcWeight(): Int { return 1}
    fun pay(payment: Payment): Unit {}
}

class OrderDetails (var items: List<OrderItem>){
    val location: String = "" //локация в виде строки

    fun calcPrice(): Int { return 1 }
    fun calcWeight(): Int { return 1 }
    fun addItem(item: OrderItem): Unit {}
}

class OrderItem (
    val name: String, //название
    val weight: Double, //  вес
    val price: Int, // цена
) {

    init {
        println("$name, $weight, $price")
    }

}



class Customer(val name: String){
    val address: String? = "default address" // опциональный адрес в виде строки
    val orders: List<Order> //список заказов
        get() {
            TODO()
        }

    //constructor(name:String, address:String?): this(name)

    fun calcPrice(): Int { return 1 }
    fun calcWeight(): Int {return 1 }
    fun addItem(item: OrderItem): Unit {}
}

enum class Currency(val value:String) {
    RUB("rub"),
    DOLLAR("dollar"),
    EURO("euro")
}

enum class PaymentStatus{
    PAID,
    NOT_PAID,
    IN_PROCESS
}


abstract class Payment(val amount: Int, val currency: Currency ){
    //кол-во
    //тип валюты , где Currency - enum как минимум из: рубли, доллары, евро. такой enum должен содержать в качестве значения текстовый код валюты, например, для рублей - это "rub"
    var status: PaymentStatus  = PaymentStatus.NOT_PAID//статус платежа где PaymentStatus - enum из: не оплачен, в обработке, оплачен

    open fun performPayment(): Unit {}
}

class CashPayment(amount:Int, currency:Currency, total: Int): Payment(amount, currency) {
    //val amount: Int //необходимое кол-во для оплаты
    //val total: Int  //кол-во, которое было передано
    var  change: Int? = null
        set(value) {
            field = value ?: 0//сдача, если нет, то 0
        }

    override fun performPayment():Unit {}
}

class OnlinePayment(amount:Int, currency:Currency):Payment(amount, currency){
    val bankId: String = ""
    val bankName: String =""

    fun checkIfSucceed(): PaymentStatus {
        return PaymentStatus.PAID
    }

    override fun performPayment() {}
}

class DelayedPayment (amount:Int, currency:Currency):Payment (amount, currency){
    val endDate: Date = TODO()
    val partAmount: String
    fun performPartialPayment(amount: Int): Unit {}

    override fun performPayment() {}
}