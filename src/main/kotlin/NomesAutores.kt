package main.kotlin

/**
 ** As seguintes regras devem ser seguidas nesta formatação:
o sobrenome será igual a última parte do nome e deve ser apresentado em letras maiúsculas;
se houver apenas uma parte no nome, ela deve ser apresentada em letras maiúsculas (sem vírgula): se a entrada for “ Guimaraes” , a saída deve ser “ GUIMARAES”;
se a última parte do nome for igual a "FILHO", "FILHA", "NETO", "NETA", "SOBRINHO", "SOBRINHA" ou "JUNIOR" e houver duas ou mais partes antes, a penúltima parte fará parte do sobrenome. Assim: se a entrada for "Joao Silva Neto", a saída deve ser "SILVA NETO, Joao" ; se a entrada for "Joao Neto" , a saída deve ser "NETO, Joao";
as partes do nome que não fazem parte do sobrenome devem ser impressas com a inicial maiúscula e com as demais letras minúsculas;
"da", "de", "do", "das", "dos" não fazem parte do sobrenome e não iniciam por letra maiúscula.
 */
class NomesAutores {
    var familySurnames = arrayOf("Neto", "Filho","Sobrinho","Sobrinha","Filha", "Neta", "Junior")

    var nameConnector = arrayOf("da", "de", "do", "das", "dos");

    fun convertSingleSurname(textInput: String): String {
        return textInput.toString().toUpperCase()
    }

    fun convertCompleteSurname(textInput: String): String {

        var namesList = textInput.split(" ")
        var lastName = namesList[namesList.size - 1]
        lastName = lastName.toUpperCase()
        var output = lastName + ", " + namesList[0]

        return output
    }

    fun getSurname(textInput: String): String {
        var surname = "";
        var namesList = textInput.split(" ")

        namesList.reversed()

    }

    fun getFirstName(nomeCompleto: String): String {
        var namesList = nomeCompleto.split(" ")
        var firstName = StringBuilder()

        namesList.forEach {

            if(nameConnector.contains(it)){
                firstName.append(namesList[namesList.size-1] + it)
            }


        }

        return  firstName.toString()


    }

}