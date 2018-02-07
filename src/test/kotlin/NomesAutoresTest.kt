package test.kotlin

import main.kotlin.NomesAutores
import org.junit.Test
import org.junit.experimental.theories.suppliers.TestedOn
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class NomesAutoresTest {

    @Test
    fun should_print_VIEGAS_surname(){
        var inputName = "Viegas"
        var expectedName = "VIEGAS"
        var returnedName = NomesAutores().convertSingleSurname(inputName)

        assertTrue(expectedName == returnedName)
    }

    @Test
    fun should_print_VELOSO_henrique_surname(){
         var inputName = "Henrique Veloso"
         var expectedName = "VELOSO, Henrique"
         var returnedName = NomesAutores().convertCompleteSurname(inputName)

        assertEquals(expectedName,  returnedName)
    }

    @Test
    fun should_print_SILVA_NETO_surname(){
        var inputName = "João Silva Neto"
        var expectedName = "SILVA NETO, João"
        var returnedName = NomesAutores().getFirstName(inputName)

        assertEquals(expectedName, returnedName)
    }

    @Test
    fun should_print_SILVA_JOAO_surname(){
        var inputName = "João da Silva"
        var expectedName = "João da"
        var returnedName = NomesAutores().getFirstName(inputName)

        assertEquals(expectedName, returnedName)
    }
    }





}