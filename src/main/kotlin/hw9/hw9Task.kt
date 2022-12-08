package hw9

fun main() {
    val p1 = Point()
    val p2 = Point(1.0, 1.0)

    println(p2.getX())
    println(p2.getY())

    println(p2.toString())

    p2.setLocation(8.0,8.0)
    println(p2.toString())

}


