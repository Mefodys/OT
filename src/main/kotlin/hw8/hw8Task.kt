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
    val pastPosition: Set<PastPosition> = setOf()
    val department: Department = TODO()

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

class Department(override var personsCount: Int) : Unit {
    private val name:String =""
    private val employees: Set<Employee> = setOf()
    fun addEmployee(employee:Employee) {}
    fun removeEmployee(employee: Employee) {}

}
//Класс class PastPosition (personsCount: Int): Department(personsCount) не наследуется от Department,
// они составляют композицию. Department является частью PastPosition
//open class Department соответственно open надо убрать
//Тоже все еще на месте
data class PastPosition(val name: String, val department:Department) {
}

class IdCard (val number: Int){
    val dateExpire: Date = Date()
}

data class Room(val number: Int)

fun main() {

}