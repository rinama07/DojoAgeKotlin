package test.kotlin

import main.kotlin.FindTheNumber
import org.junit.Test
import kotlin.test.assertTrue

class FindTheNumberTest {

    private var expectedNumber = String()
    private var inputValue = String()
    private var returnedNumber = String()

    @Test
    fun should_print_1_4663_79338_4663_when_inputs_1_home_sweet_home() {
        this.expectedNumber = "1-4663-79338-4663"
        this.inputValue = "1-HOME-SWEET-HOME"
        this.returnedNumber = FindTheNumber().getTelephoneNumber(this.inputValue)

        assertTrue(this.returnedNumber == this.expectedNumber)
    }

    @Test
    fun should_print_69_647372253_562_when_inputs_my_miserable_job() {
        this.expectedNumber = "69-647372253-562"
        this.inputValue = "MY-MISERABLE-JOB"
        this.returnedNumber = FindTheNumber().getTelephoneNumber(this.inputValue)

        assertTrue(this.returnedNumber == this.expectedNumber)
    }

    @Test
    fun should_print_hifen_when_inputs_hifen() {
        this.expectedNumber = "-"
        this.inputValue = "-"
        this.returnedNumber = FindTheNumber().getTelephoneNumber(this.inputValue)

        assertTrue(this.returnedNumber == this.expectedNumber)
    }

    @Test
    fun should_print_number_zero_when_inputs_number_zero() {
        this.expectedNumber = "0"
        this.inputValue = "0"
        this.returnedNumber = FindTheNumber().getTelephoneNumber(this.inputValue)

        assertTrue(this.returnedNumber == this.expectedNumber)
    }

    @Test
    fun should_print_number_one_when_inputs_number_one() {
        this.expectedNumber = "1"
        this.inputValue = "1"
        this.returnedNumber = FindTheNumber().getTelephoneNumber(this.inputValue)

        assertTrue(this.returnedNumber == this.expectedNumber)
    }

    @Test
    fun should_print_number_two() {
        this.expectedNumber = "2"
        this.inputValue = "ABC"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_three() {
        this.expectedNumber = "3"
        this.inputValue = "DEF"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_four() {
        this.expectedNumber = "4"
        this.inputValue = "GHI"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_five() {
        this.expectedNumber = "5"
        this.inputValue = "JKL"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_six() {
        this.expectedNumber = "6"
        this.inputValue = "MNO"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_seven() {
        this.expectedNumber = "7"
        this.inputValue = "PQRS"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_eight() {
        this.expectedNumber = "8"
        this.inputValue = "TUV"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }

    @Test
    fun should_print_number_nine() {
        this.expectedNumber = "9"
        this.inputValue = "WXYZ"

        this.inputValue.forEach {
            this.returnedNumber = FindTheNumber().getTelephoneNumber(it.toString())

            assertTrue(this.returnedNumber == this.expectedNumber)
        }
    }
}