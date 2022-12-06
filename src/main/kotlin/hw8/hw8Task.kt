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

class Employee(override val name:String, override val surname: String, private val position: String) : Man(){
    private val pastPosition: Set<PastPosition> = setOf()
    private val department: Department
        get() {
            TODO()
        }

    private val room:Set<Room> = setOf()
    private val idCard: IdCard = TODO()
    private fun deletePastPosition(pastPos:PastPosition){}
    private fun deleteRoom(room:Room) {}

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Employee

        if (name != other.name) return false
        if (surname != other.surname) return false
        if (position != other.position) return false
        if (pastPosition != other.pastPosition) return false
        if (room != other.room) return false
        if (idCard != other.idCard) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + surname.hashCode()
        result = 31 * result + position.hashCode()
        result = 31 * result + pastPosition.hashCode()
        result = 31 * result + room.hashCode()
        result = 31 * result + idCard.hashCode()
        return result
    }

    override fun toString(): String {
        return "Employee(name='$name', surname='$surname', position='$position', pastPosition=$pastPosition, room=$room, idCard=$idCard)"
    }

}

open class Department(override var personsCount: Int) : Unit {
    private val name:String =""
    val employees: Set<Employee> = setOf()
    fun addEmployee(empl:Employee) {}
    fun removeEmployee(empl: Employee) {}

}

data class PastPosition (override var personsCount: Int): Department(personsCount) {
    val name: String = ""
    val department:Department = TODO()
}

class IdCard (val number: Int){
    val dateExpire: Date = Date()
}

data class Room(val number: Int)

fun main() {

}