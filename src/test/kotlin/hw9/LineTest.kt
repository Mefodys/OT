package hw9.hw9

import hw9.Line
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class LineTest {

    @Test
    fun len() {
        val line = Line(-10.0, 0.0, 11.0, 0.0)
        Assertions.assertTrue(line.len() == 21.0)
    }

//    @Test
//    fun rotate() {
//        val line = Line(0.0, 0.0, 5.0, 0.0)
//        Assertions.assertTrue(line.rotate(90.0) == Line(0.0, 0.0, 0.0, 5.0))
//    }

}