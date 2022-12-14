package hw9

fun main() {
//    val p1 = Point()
//    val p2 = Point(1.0, 1.0)
//
//    println(p2.getX())
//    println(p2.getY())
//
//    println(p2.toString())
//
//    p2.setLocation(8.0, 8.0)
//    println(p2.toString())
//
//    val p3 = Point(4.0, 5.0)
//    val p4 = Point(6.0, 7.0)
//
//    val l1 = Line(p3, p4)
//    val l2 = Line(1.1, 2.2, 3.3, 4.4)
//    val l3 = Line(l1)
//    println(l3)
//
//    val l4 = Line(0.0, 0.0, 10.0, 0.0)
//    println(l4.firstPointX)
//    println(l4.firstPointY)
//    println(l4.secondPointX)
//    println(l4.secondPointY)
//    val angle = l4.angle()
//    println("angle is $angle")
//
//    println(l4.len())
//    println()
//
//    val l5 = Line(0.0, 0.0, 4.0, 0.0)
//    println(l5)
//    //val rotatedLine1 = l5.rotate(89.9)
//    val rotatedLine2 = l5.rotate(90.0)
//    // val rotatedLine3 = l5.rotate(90.1)
//    // val rotatedLine4 = l5.rotate(179.9)
//    val rotatedLine5 = l5.rotate(180.0)
//    //val rotatedLine6 = l5.rotate(180.1)
//    //val rotatedLine7 = l5.rotate(269.9)
//    val rotatedLine8 = l5.rotate(270.0)
//    //val rotatedLine9 = l5.rotate(270.1)
//    //val rotatedLine10 = l5.rotate(359.9)
//    val rotatedLine11 = l5.rotate(360.0)
//    //val rotatedLine12 = l5.rotate(360.1)
//    //println("89.9 $rotatedLine1")
//    val rotatedLine2Len = rotatedLine2.len()
////    println("90.0 $rotatedLine2 , $rotatedLine2Len")
//    println("90.0 \t $rotatedLine2")
//    //println("90.1 $rotatedLine3")
//    //println("179.9 $rotatedLine4")
//    println("180.0 \t $rotatedLine5")
//    //println("180.1 $rotatedLine6")
//    //println("269.9 $rotatedLine7")
//    println("270.0 \t $rotatedLine8")
//    //println("270.1 $rotatedLine9")
//    //println("359.9 $rotatedLine10")
//    println("360.0 \t $rotatedLine11")
//    //println("360.1 $rotatedLine12")
//
////    val l6 = Line(0.0,0.0,1.0,0.0)
////    val rotatedLine12 = l6.rotate90(0)
////    val rotatedLine13 = l6.rotate90(1)
////    val rotatedLine14 = l6.rotate90(-1)
////    println(rotatedLine12)
////    println(rotatedLine13)
////    println(rotatedLine14)
//
//    val l7 = Line(-3.0, 1.0, 3.0, -1.0)
//    println(l7.isOnLine(Point(0.0, 0.0)))
//
//    val p10 = Point(1.0, 0.0)
//    val p11 = Point(5.0, 0.0)
//    println(p10.distance(p11))
//    println(Point.distance(p10, p11))
//
//    val l8 = Line(0.0, 0.0, 1.0, 3.0)
//    println(l8.angle())

    val p1 = Point(0.0, 0.0)
    val p2 = Point(3.0, 0.0)
    val l1 = Line(p1, p2)
    println(l1)

    val l2 = Line(-10.0, 0.0, 11.0, 0.0)
    println(l2)

    val l3 = Line(l2)
    println(l3)

    val l4 = Line(0.0, 0.0, 2.0, 4.0)
    println(l4.rotate(90.0))
    println(l4.rotate90(1))
    println(l4.rotate90(-1))

    println(l4.isOnLine(p1))
    println(l4.isOnLine(1.0,2.0))

    println(p10.distanceSq(p11))

}


