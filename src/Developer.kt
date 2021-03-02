fun main() {
//   1. string concatenation
    val z = "my name is"
    val y = "Mary"
    println(z + y)

// 2.kotlin String Indexing
    val type = "Banana"
    println(type[0])
    println(type[1])

//   3.Kotlin String Interpolation
    val full = "My name is  Shaitai"
    val year = "2000"
    val sentence = "$full was born in $year"
    print(sentence)

// 4. String Comparison
    val message = "PAD000DhUE.confirmed"
    val message2 = "PA586DTQ.confirmed"
    if (message == message2) {
        println(true)
    }


//   5. String Case
    val x ="AFRICANA INVENTOR"
    println (x.toUpperCase())
    println(x.toLowerCase())
    println(x.capitalize())
    println(x.decapitalize())

//  6.  Kotlin Empty, Blank Strings
        val emptyString=""
        val  blankString=" "
        println(emptyString.isBlank())
        println(emptyString.isEmpty())
        println(blankString.isBlank())
        println(blankString.isEmpty())

//    7.Trimming White Space from the strings
        val name="Emma Musemi"
        println(name.trimStart())
        println(name.trimEnd())
        println(name.trim())

//   8. String Starts with(), ends with()

        val location ="Nairobi"
        println(location.startsWith("N"))
        println(location.endsWith("i"))

//    9. Kotlin Replace

        val text ="she is smart"+"she is Intelligence"
        println(text.replace("is" ,"was"))

//    10.Kotlin Split

        val word ="eagle, falcon"
        val birds =word.split(",")
        println(birds)
        println(birds[1])

//    11. Kotlin toString
    val weight=54.5
    println("My weight is"+ weight .toString())










}

