package hw8

/*
https://github.com/otuskotlin/202209-okb-homework/blob/main/HW-8/Task.md/
 */
import java.util.Date

interface Unit{
    var personsCount: Int
}

abstract class Man{
    protected abstract val name: String
    protected abstract val surname: String
}

class Employee(override val name:String, override val surname: String, val position: String) : Man(){
    val pastPosition: Set<PastPosition> = setOf()
    val department: Department
        get() {
            TODO()
        }

    val room:Set<Room> = setOf()
    val idCard: IdCard = TODO()
    fun deletePastPosition(pastPos:PastPosition){}
    fun deleteRoom(room:Room) {}

}

open class Department(override var personsCount: Int) : Unit {
    private val name:String =""
    val employees: Set<Employee> = setOf()
    fun addEmployee(empl:Employee) {}
    fun removeEmployee(empl: Employee) {}

}

class PastPosition (personsCount: Int): Department(personsCount) {
    val name: String = ""
    val department:Department = TODO()
}

class IdCard (val number: Int){
    val dateExpire: Date = Date()
}

class Room(val number: Int)

fun main() {

}