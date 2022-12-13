package hw9

import kotlin.math.sqrt

class Point(private var x: Double = 0.0, private var y: Double = 0.0) {

    fun getX(): Double {
        return this.x
    }

    fun getY(): Double {
        return this.y
    }

    override fun toString(): String {
        return "Point[$x, $y]"
    }

    //double distanceSq(Point pt)
    //Возвращает квадрат расстояния от этой Point до указанной точки.
    fun distanceSq(pt: Point): Double {
        return (this.x - pt.x) * (this.x - pt.x) + (this.y - pt.y) * (this.y - pt.y)
    }

    fun distance(a: Point): Double {
        return sqrt(distanceSq(a))
    }

    //void setLocation(double x, double y)
    //Устанавливает местоположение этого Point в переданные координаты x,y.
    fun setLocation(x: Double, y: Double) {
        this.x = x
        this.y = y
    }

    //static int compareX(Point a, Point b)
    // Сравнивает два указанных двойных значения по X.
    // значение 0, если a численно равно b;
    // значение -1, если a численно меньше b;
    // и значение 1, если a численно больше, чем b.

    companion object {
        fun compareX(a: Point, b: Point): Int {
            return when {
                a.x == b.x -> 0
                a.x < b.x -> -1
                else -> 1
            }
        }

        fun compareY(a: Point, b: Point): Int {
            return when {
                a.y == b.y -> 0
                a.y < b.y -> -1
                else -> 1
            }
        }

        // static double distanceSq(Point a, Point b)
        // Возвращает квадрат расстояния между двумя точками.
        fun distanceSq(a: Point, b: Point): Double {
            return (b.x - a.x) * (b.x - a.x) + (b.y - a.y) * (b.y - a.y)
        }

        // static double distance(Point a, Point b)
        // Возвращает расстояние между двумя точками.
        fun distance(a: Point, b: Point): Double {
            return sqrt(distanceSq(a, b))
        }

    }

}




