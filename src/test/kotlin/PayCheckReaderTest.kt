package test.kotlin
import main.kotlin.PayCheckReader
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class PayCheckReaderTest {

    @Test
    fun should_return_the_part_before_the_thousand_part_of_number() {
        val number = "dois mil quinhentos e vinte e três reais e dezoito centavos"
        val valueReturned = PayCheckReader().getPartBeforeThousandPart(number)


        assertEquals("dois", valueReturned)
    }

    @Test
    fun should_return_the_part_after_the_thousand_part_of_number() {
        val number = "dois mil quinhentos e vinte e três reais e dezoito centavos"
        val valueReturned = PayCheckReader().getPartAfterThousandPart(number)


        assertEquals("quinhentos e vinte e três", valueReturned)
    }

    @Test
    fun should_return_the_cents_part(){
        val number = "dois mil quinhentos e vinte e três reais e dezoito centavos"
        val valueReturned = PayCheckReader().getCentsPart(number)

        assertEquals("dezoito", valueReturned)
    }
}