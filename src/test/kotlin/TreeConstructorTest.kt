import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TreeConstructorTest {

    @Test
    fun test1(){
        assertEquals(true, treeConstructor(arrayOf("(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)")))
        assertEquals(false, treeConstructor(arrayOf("(1,2)", "(3,2)", "(2,12)", "(5,2)")))
    }
}