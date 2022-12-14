package hw9

import kotlin.math.*

class Line(val pointOne: Point, val pointTwo: Point) {

    private var x1 = pointOne.getX()
    private var y1 = pointOne.getY()
    private var x2 = pointTwo.getX()
    private var y2 = pointTwo.getY()

    constructor(firstPointX: Double, firstPointY: Double, secondPointX: Double, secondPointY: Double) :
            this(pointOne = Point(x = 0.0, y = 0.0), pointTwo = Point(x = 0.0, y = 0.0)) {
        x1 = firstPointX
        y1 = firstPointY
        x2 = secondPointX
        y2 = secondPointY
    }

    constructor(anotherLine: Line) : this(pointOne = Point(x = 0.0, y = 0.0), pointTwo = Point(x = 0.0, y = 0.0)) {
        x1 = anotherLine.x1
        y1 = anotherLine.y1
        x2 = anotherLine.x2
        y2 = anotherLine.y2
    }

    override fun toString(): String {
        return "Line[Point[$x1, $y1], Point[$x2, $y2]]"
    }

    fun angle(): Double {

        val deltaX = (x2 - x1)
        val deltaY = (y2 - y1)
        val theta = (atan2(deltaY, deltaX)) / (PI / 180)

        if (theta < 0) return theta + 360
        return theta
    }

    //    Евклидова длина
    fun len(): Double {

        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    }

    //Line rotate(double degrees)
    //Поворачивает Line на заданный угол против часовой стрелки, предполагая, что ось y направлена вверх.

    //Xnew = Xold x cosθ – Yold x sinθ
    //Ynew = Xold x sinθ + Yold x cosθ

    fun rotate(degrees: Double): Line {

        //Angle in Degrees* PI = Angle in Radians × 180°/π
        val rad = degrees * PI / 180

        // val cos_angle = cos(rad);
        // val sin_angle = sin(rad);
        // val new_bx = a(:)+[cos_angle -sin_angle;
        // val new_by = sin_angle cos_angle]*(b-a).';
        // ??? если одна из точек не находится в 0.0, то сместить всю линию к 0.0

        val Px2 = (x2) * cos(rad) + (y2) * sin(rad)
        val Py2 = (x2) * sin(rad) - (y2) * cos(rad)

        var roundedPx2: Double = String.format("%.2f", Px2).toDouble()
        var roundedPy2: Double = String.format("%.2f", Py2).toDouble()

        if (roundedPx2 == -0.0) roundedPx2 = 0.0
        if (roundedPy2 == -0.0) roundedPy2 = 0.0

        return Line(x1, y1, roundedPx2, roundedPy2)

//        val x2 = (x2 * cos(degrees) - y2 * sin(degrees))
//        val y2 = (y2 * cos(degrees) + x2 * sin(degrees))
//        return Line(x1, y1, x2, y2)
    }

    fun rotate90(dir: Int): Line {

        val rad: Double
        val deg: Double

        when {

            dir >= 0 -> {
                rad = 90 * PI / 180
                deg = 180 * rad / PI
            }

            else -> {
                rad = -90 * PI / 180
                deg = 180 * rad / PI
            }

        }

        return rotate(deg)

    }

    //  Проверяет лежит ли точка на линии
    fun isOnLine(a: Point): Boolean {

        val x = a.getX()
        val y = a.getY()

        return when ((x - x1) / (x2 - x1) == (y - y1) / (y2 - y1)) {
            true -> true
            false -> false
        }
    }

    //    Проверяет лежит ли точка на линии
    fun isOnLine(x: Double, y: Double): Boolean {
        return isOnLine(Point(x, y))
    }
}
