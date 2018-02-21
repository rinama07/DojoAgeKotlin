package main.kotlin

/*
Dado um cheque com o seu valor por extenso, desenvolva um programa que retorne o seu valor numérico.
Por exemplo se informarmos "dois mil quinhentos e vinte e três reais e dezoito centavos", o seu programa deve retornar "2523,18"
*/

class PayCheckReader {


    private var mapCharNumber = mapOf(
            "um" to 1,
            "dois" to 2,
            "três" to 3,
            "quatro" to 4,
            "cinco" to 5,
            "seis" to 6,
            "sete" to 7,
            "oito" to 8,
            "nove" to 9,
            "dez" to 10,
            "onze" to 11,
            "doze" to 12,
            "treze" to 13,
            "quatorze" to 14,
            "quinze" to 15,
            "dezesseis" to 16,
            "dezessete" to 17,
            "dezoito" to 18,
            "dezenove" to 19,
            "vinte" to 20,
            "trinta" to 30,
            "quarenta" to 40,
            "cinquenta" to 50,
            "sessenta" to 60,
            "setenta" to 70,
            "oitenta" to 80,
            "noventa" to 90,
            "cem" to 100,
            "cento" to 100
    )

    fun getPartBeforeThousandPart(number: String): String {
        return number.split("mil").get(0)
    }

    fun getPartAfterThousandPart(number: String): String {
        var entreMilEReais = ""

        if ( number.indexOf("mil") == -1 ) {
            entreMilEReais = number.split("mil|reais".toRegex()).get(0)
        } else {
            entreMilEReais = number.split("mil|reais".toRegex()).get(1)
        }

        return entreMilEReais
    }

    fun getCentsPart(number:String): String {
        return ""
    }
}