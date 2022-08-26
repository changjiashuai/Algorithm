import org.junit.Assert
import org.junit.Test

class TreeConstructorTest {

    @Test
    fun test1(){
        Assert.assertEquals(true, treeConstructor(arrayOf("(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)")))
        Assert.assertEquals(false, treeConstructor(arrayOf("(1,2)", "(3,2)", "(2,12)", "(5,2)")))
    }
}