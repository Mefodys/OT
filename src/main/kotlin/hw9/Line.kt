package hw9

import kotlin.math.*

class Line(private val pointOne: Point, private val pointTwo: Point) {

//    private val x1 = pointOne.x
//    private val y1 = pointOne.y
//    private val x2 = pointTwo.x
//    private val y2 = pointTwo.y

    constructor(
        firstPointX: Double,
        firstPointY: Double,
        secondPointX: Double,
        secondPointY: Double
    ) :
            this(Point(0.0, 0.0), Point(0.0, 0.0))

    constructor(
        anotherLine: Line
    ) :
            this(Point(0.0, 0.0), Point(0.0, 0.0))

    override fun toString(): String {
        return "Line[Point[${pointOne.getX()}, ${pointOne.getY()}], Point[${pointTwo.getX()}, ${pointTwo.getY()}]]"
    }

    fun angle(): Double {

        val deltaX = (pointTwo.getX() - pointOne.getX())
        val deltaY = (pointTwo.getY() - pointOne.getY())
        val theta = (atan2(deltaY, deltaX)) / (PI / 180)

        if (theta < 0) return theta + 360
        return theta
    }

    //    Евклидова длина
    fun len(): Double {

        return sqrt((pointTwo.getX() - pointOne.getX()) * (pointTwo.getX() - pointOne.getX()) + (pointTwo.getY() - pointOne.getY()) * (pointOne.getY() - pointOne.getY()))
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

        val Px2 = (pointTwo.getX()) * cos(rad) + (pointTwo.getY()) * sin(rad)
        val Py2 = (pointTwo.getX()) * sin(rad) - (pointTwo.getY()) * cos(rad)

        var roundedPx2: Double = String.format("%.2f", Px2).toDouble()
        var roundedPy2: Double = String.format("%.2f", Py2).toDouble()

        if (roundedPx2 == -0.0) roundedPx2 = 0.0
        if (roundedPy2 == -0.0) roundedPy2 = 0.0

        return Line(pointOne.getX(), pointOne.getY(), roundedPx2, roundedPy2)

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

        return when ((x - pointOne.getX()) / (pointTwo.getX() - pointOne.getX()) == (y - pointOne.getY()) / (pointTwo.getY() - pointOne.getY())) {
            true -> true
            false -> false
        }
    }

    //    Проверяет лежит ли точка на линии
    fun isOnLine(x: Double, y: Double): Boolean {
        return isOnLine(Point(x, y))
    }
}
