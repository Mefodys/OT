package hw9

import kotlin.math.*

class Line(val pointOne: Point, val pointTwo: Point) {

    var firstPointX = pointOne.getX()
    var firstPointY = pointOne.getY()
    var secondPointX = pointTwo.getX()
    var secondPointY = pointTwo.getY()

    constructor(firstPointX: Double, firstPointY: Double, secondPointX: Double, secondPointY: Double) :
            this(pointOne = Point(x = 0.0, y = 0.0), pointTwo = Point(x = 0.0, y = 0.0)) {
        this.firstPointX = firstPointX
        this.firstPointY = firstPointY
        this.secondPointX = secondPointX
        this.secondPointY = secondPointY
    }

    constructor(anotherLine: Line) : this(pointOne = Point(x = 0.0, y = 0.0), pointTwo = Point(x = 0.0, y = 0.0)) {
        this.firstPointX = anotherLine.firstPointX
        this.firstPointY = anotherLine.firstPointY
        this.secondPointX = anotherLine.secondPointX
        this.secondPointY = anotherLine.secondPointY

    }

    override fun toString(): String {
        return "Line[Point[$firstPointX, $firstPointY], Point[$secondPointX, $secondPointY]]"
    }

    fun angle(): Double {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        val deltaX = (x2 - x1)
        val deltaY = (y2 - y1)

        val theta = (atan2(deltaY, deltaX)) / (PI / 180)

        if (theta < 0) return theta + 360
        return theta
    }

    //    Евклидова длина
    fun len(): Double {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        return sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1))
    }

    //Line rotate(double degrees)
    //Поворачивает Line на заданный угол против часовой стрелки, предполагая, что ось y направлена вверх.

    //Xnew = Xold x cosθ – Yold x sinθ
    //Ynew = Xold x sinθ + Yold x cosθ


    fun rotate(degrees: Double): Line {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        //Angle in Degrees* PI = Angle in Radians × 180°/π
        val rad = degrees * PI / 180

//        val shiftToZeroX1 =
//        val shiftToZeroY1 =

        val cos_angle = cos(rad);
        val sin_angle = sin(rad);

//        val new_bx = a(:)+[cos_angle -sin_angle;
//        val new_by = sin_angle cos_angle]*(b-a).';

        //если одна из точек не находится в 0.0, то сместить всю линию к 0.0

        val Px2 = (x2) * cos(rad) + (y2) * sin(rad)
        val Py2 = (x2) * sin(rad) - (y2) * cos(rad)

        var roundedPx2: Double = String.format("%.2f", Px2).toDouble()
        var roundedPy2: Double = String.format("%.2f", Py2).toDouble()

        if (roundedPx2 == -0.0) roundedPx2 = 0.0
        if (roundedPy2 == -0.0) roundedPy2 = 0.0

        return Line(x1, y1, roundedPx2, roundedPy2)

    }

    fun rotate90(dir: Int): Line {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        val rad: Double
        when {
            dir >= 0 -> {
                rad = 90 * PI / 180
            }

            else -> {
                rad = -90 * PI / 180
            }
        }

        val Px = (x2 * cos(rad) + y2 * sin(rad)) + x1
        val Py = (x2 * sin(rad) - y2 * cos(rad)) + y2

        val rounded1: Double = String.format("%.2f", Px).toDouble()
        val rounded2: Double = String.format("%.2f", Py).toDouble()

        return Line(x1, y1, rounded1, rounded2)

    }

    //  Проверяет лежит ли точка на линии
    fun isOnLine(a: Point): Boolean {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        val x = a.getX()
        val y = a.getY()

        return when ((x - x1) / (x2 - x1) == (y - y1) / (y2 - y1)) {
            true -> true
            false -> false
        }
    }

    //    Проверяет лежит ли точка на линии
    fun isOnLine(x: Double, y: Double): Boolean {
        val x1 = this.firstPointX
        val y1 = this.firstPointY
        val x2 = this.secondPointX
        val y2 = this.secondPointY

        val x = x
        val y = x

        return when ((x - x1) / (x2 - x1) == (y - y1) / (y2 - y1)) {
            true -> true
            false -> false
        }
    }

}