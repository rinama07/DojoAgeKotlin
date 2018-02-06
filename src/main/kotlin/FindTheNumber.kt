/***
Em alguns lugares é comum lembrar um número do telefone associando seus
dígitos a letras. Dessa maneira a expressão MY LOVE significa 69 5683.
Claro que existem alguns problemas, uma vez que alguns números de telefone
não formam uma palavra ou uma frase e os dígitos 1 e 0 não estão associados
a nenhuma letra.

Sua tarefa é ler uma expressão e encontrar o número de telefone correspondente
baseado na tabela abaixo. Uma expressão é composta por letras maiúsculas (A-Z),
hifens (-) e os números 1 e 0.

Letras  ->  Número
ABC    ->  2
DEF    ->  3
GHI    ->  4
JKL    ->  5
MNO    ->  6
PQRS    ->  7
TUV    ->  8
WXYZ   ->  9
Entrada

A entrada consiste de um conjunto de expressões. Cada expressão está sozinha em
uma linha e possui C caracteres, onde 1 ≤ C ≤ 30. A entrada é terminada por fim
de arquivo (EOF).

Exemplo:

1-HOME-SWEET-HOME = 1-4663-79338-4663
MY-MISERABLE-JOB = 69-647372253-562
 */


package main.kotlin

class FindTheNumber {

    private var mapCharNumber = mapOf(
        '2' to "ABC",
        '3' to "DEF",
        '4' to "GHI",
        '5' to "JKL",
        '6' to "MNO",
        '7' to "PQRS",
        '8' to "TUV",
        '9' to "WXYZ"
    )

    fun getTelephoneNumber(text: String): String {

        var finalText = StringBuilder()

        text.forEach {
            finalText.append(convertCharToNumber(it))
        }

        return finalText.toString()
    }

    private fun convertCharToNumber(char: Char): Char {

        var finalChar = char

        mapCharNumber.entries.forEach {
            if ( it.value.contains(char) ) {
                finalChar = it.key
            }
        }

        return finalChar
    }

}