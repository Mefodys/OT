package hw9

import kotlin.math.sqrt

class Point(private var x: Double = 0.0, private var y: Double = 0.0) {

    @JvmName("getX11")
    fun getX(): Double {
        return this.x
    }

    @JvmName("getY11")
    fun getY(): Double {
        return this.y
    }

    override fun toString(): String {
        return "\"Point[\" + $x + \", \" + $y + \"]\""
    }

    //double distanceSq(Point pt)
    //Возвращает квадрат расстояния от этой Point до указанной точки.
    fun distanceSq(pt:Point):Double{
        return (this.getX() - pt.getX()) * (this.getX() - pt.getX()) + (this.getY() - pt.getY()) * (this.getY() - pt.getY())
    }

    fun distance(a:Point): Double {
        return sqrt((this.getX() - a.getX()) * (this.getX() - a.getX()) + (this.getY() - a.getY()) * (this.getY() - a.getY()))
    }

    //void setLocation(double x, double y)
    //Устанавливает местоположение этого Point в переданные координаты x,y.
    fun setLocation(x:Double,y:Double){
        this.x = x
        this.y = y
    }

}


//static int compareX(Point a, Point b)
// Сравнивает два указанных двойных значения по X.
// значение 0, если a численно равно b;
// значение -1, если a численно меньше b;
// и значение 1, если a численно больше, чем b.
fun compareX(a: Point, b: Point): Int {
    return when {
        a.getX() == b.getX() -> 0
        a.getX() < b.getX() -> -1
        else -> 1
    }
}

fun compareY(a: Point, b: Point): Int {
    return when {
        a.getY() == b.getY() -> 0
        a.getY() < b.getY() -> -1
        else -> 1
    }
}

// static double distanceSq(Point a, Point b)
// Возвращает квадрат расстояния между двумя точками.
fun distanceSq(a:Point,  b:Point): Double {
    return (b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY())
}

// static double distance(Point a, Point b)
// Возвращает расстояние между двумя точками.
fun distance(a:Point,  b:Point): Double {
    return sqrt((b.getX() - a.getX()) * (b.getX() - a.getX()) + (b.getY() - a.getY()) * (b.getY() - a.getY()))
}