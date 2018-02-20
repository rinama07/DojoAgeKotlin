package test.kotlin

import main.kotlin.*
import org.junit.Test
import kotlin.test.assertEquals

class AuthorNameFormatTest {

    @Test
    fun should_return_name_splitted() {
        val name = "João da Silva"
        val expectedSplittedName = listOf("João", "da", "Silva")
        var returnedSplittedName = getSplittedName(name)

        assertEquals(expectedSplittedName, returnedSplittedName)
    }

    @Test
    fun should_have_the_last_name_as_an_exception_name() {
        val names = listOf("João", "Silva", "Neto")
        val actualReturn = isLastNameAnException(names)

        assertEquals(true, actualReturn)
    }

    @Test
    fun should_not_have_the_last_name_as_an_exception_name() {
        val names = listOf("João", "Neto", "Silva")
        val actualReturn = isLastNameAnException(names)

        assertEquals(false, actualReturn)
    }

    @Test
    fun should_return_name_with_one_word_formatted() {
        val name = "João"
        val expectedName = "JOÃO"
        val formattedName = formatNameWithOneWord(name)

        assertEquals(expectedName, formattedName)
    }

    @Test
    fun should_return_name_with_two_words_formatted() {
        val name = "João Souza"
        val expectedName = "SOUZA, João"
        val formattedName = formatNameWithTwoWords(name)

        assertEquals(expectedName, formattedName)
    }

    @Test
    fun should_return_empty_when_input_empty_name() {
        val name = ""
        val expectedName = ""
        val formattedName = getFormattedName(name)

        assertEquals(expectedName, formattedName)
    }

    @Test
    fun should_format_name_with_last_word_exception() {
        val name = "João de Santana Filho"
        val nameExpected = "SANTANA FILHO, João de"
        val nameFormatted = formatNameWithMoreThanTwoWords(name)

        assertEquals(nameFormatted, nameExpected)
    }

    @Test
    fun should_format_name_with_last_word_exception_and_the_word_before_exception() {
        val name = "João de Filho"
        val nameExpected = "de FILHO, João"
        val nameFormatted = formatNameWithMoreThanTwoWords(name)

        assertEquals(nameFormatted, nameExpected)
    }

    @Test
    fun should_format_name_withou_exception() {
        val name = "João Souza Santana"
        val nameExpected = "SANTANA, João Souza"
        val nameFormatted = formatNameWithMoreThanTwoWords(name)

        assertEquals(nameFormatted, nameExpected)
    }

    @Test
    fun should_have_exception_word_before_the_last_name() {
        val names = listOf("João", "Neto", "da", "Silva")
        val actualReturn = isNameBeforeLastNameAnException(names)

        assertEquals(true, actualReturn)
    }

    @Test
    fun should_not_have_exception_word_before_the_last_name() {
        val names = listOf("João", "Neto", "Silva")
        val actualReturn = isNameBeforeLastNameAnException(names)

        assertEquals(false, actualReturn)
    }

    @Test
    fun should_have_one_word_in_name() {
        val name = "Maria"
        val actualReturn = getSizeOfTheName(name)

        assertEquals(1, actualReturn)
    }

    @Test
    fun should_have_two_words_in_name() {
        val name = "Maria Silva"
        val actualReturn = getSizeOfTheName(name)

        assertEquals(2, actualReturn)
    }

    @Test
    fun should_have_three_words_in_name() {
        val name = "Maria da Silva"
        val actualReturn = getSizeOfTheName(name)

        assertEquals(3, actualReturn)
    }
}