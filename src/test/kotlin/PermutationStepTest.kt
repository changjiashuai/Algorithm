import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PermutationStepTest {

    @Test
    fun test() {
        assertEquals(132, permutationStep(123))
        assertEquals(12534, permutationStep(12453))
        assertEquals(-1, permutationStep(999))
    }
}