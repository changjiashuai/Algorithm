import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FizzBuzzTest {

    @Test
    fun test() {
        assertEquals(listOf("1", "2", "Fizz"), fizzBuzz(3))
        assertEquals(listOf("1", "2", "Fizz", "4", "Buzz"), fizzBuzz(5))
        assertEquals(
            listOf(
                "1",
                "2",
                "Fizz",
                "4",
                "Buzz",
                "Fizz",
                "7",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "13",
                "14",
                "FizzBuzz"
            ), fizzBuzz(15)
        )
    }
}