/*
 Seu desafio é fazer um programa que leia nomes (que podem estar em qualquer tipo de letra)
 e imprima a versão formatada no estilo exemplificado acima.

 As seguintes regras devem ser seguidas nesta formatação:
 [OK] o sobrenome será igual a última parte do nome e deve ser apresentado em letras maiúsculas;

 [OK] se houver apenas uma parte no nome, ela deve ser apresentada em letras maiúsculas
 (sem vírgula): se a entrada for “ Guimaraes” , a saída deve ser “ GUIMARAES”;

 > se a última parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO",
 "SOBRINHA" ou "JUNIOR" e houver duas ou mais partes antes, a penúltima parte fará parte do
 sobrenome. Assim: se a entrada for "Joao Silva Neto", a saída deve ser "SILVA NETO, Joao" ;

 [OK] se a entrada for "Joao Neto" , a saída deve ser "NETO, Joao";

 > as partes do nome que não fazem parte do sobrenome devem ser impressas com a inicial
 maiúscula e com as demais letras minúsculas;

 [OK] "da", "de", "do", "das", "dos" não fazem parte do sobrenome e não iniciam por letra maiúscula.
 */

package main.kotlin

val exceptionNames = listOf("FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA", "JUNIOR")
val exceptionWords = listOf("da", "de", "do", "das", "dos")

fun getSplittedName(name: String): List<String> {
    return name.split(Regex(" "))
}

fun isLastNameAnException(names: List<String>): Boolean {
    val lastName = names[names.size - 1]

    return exceptionNames.contains(lastName.toUpperCase())
}

fun isNameBeforeLastNameAnException(names: List<String>): Boolean {
    val nameBeforeLast = names[names.size - 2]

    return exceptionWords.contains(nameBeforeLast.toLowerCase())
}

fun getSizeOfTheName(name: String): Int {
    return getSplittedName(name).size
}

fun formatNameWithOneWord(name: String): String {
    return formatName(name)
}

fun formatNameWithTwoWords(name: String): String {
    val names = getSplittedName(name)
    val firstName = names[0].capitalize()
    val lastName = formatName(names[1])

    return String.format("%s, %s", lastName, firstName)
}

fun getFirstPartOfTheName(names: List<String>): String {
    var lastIndexToConsider = names.size - 1
    var firstName = ""

    if ( isLastNameAnException(names) || isNameBeforeLastNameAnException(names) ) {
        lastIndexToConsider -= 1
    }

    var index = 0
    while (index < lastIndexToConsider) {
        if (index != 0) {
            firstName += " "
        }

        firstName += names[index]

        index++
    }

    return firstName
}

fun formatName(name: String): String {
    var nameFormatted = name

    if ( !exceptionWords.contains(name) ) {
        nameFormatted = name.toUpperCase()
    }

    return nameFormatted
}

fun formatNameWithMoreThanTwoWords(name: String): String {
    val names = getSplittedName(name)
    val nameSize = getSizeOfTheName(name)

    val firstName = getFirstPartOfTheName(names)
    val lastName = formatName(names[nameSize-1])
    val nameBeforeLastName = formatName(names[nameSize-2])
    var nameFormatted = String.format("%s, %s", lastName, firstName)

    if ( isLastNameAnException(names) ) {
        nameFormatted = String.format("%s %s, %s", nameBeforeLastName, lastName, firstName)
    }

    return nameFormatted
}

fun getFormattedName(name: String): String {
    val nameSize = getSizeOfTheName(name)

    when (nameSize)  {
        0 -> return ""
        1 -> return formatNameWithOneWord(name)
        2 -> return formatNameWithTwoWords(name)
        else -> {
            return formatNameWithMoreThanTwoWords(name)
        }
    }
}