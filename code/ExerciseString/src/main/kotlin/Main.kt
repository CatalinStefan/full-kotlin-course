fun main(args: Array<String>) {

    //EXERCISE1
    val str: String = "Programming is fun"
    val str2: String = """Our string is $str, 
with the length of the string is ${str.length}, 
and the third character is ${str[2]}."""

    //EXERCISE2
    val firstName: String = "John"
    val lastName: String = "Doe"

    val task1 = "$firstName $lastName"
    val task2 = task1.uppercase()
    val task3 = "Hello, $task2!"

    //EXERCISE3
    val sentence = "Kotlin is a powerful programming language"

    val contains = sentence.contains("powerful")
    val extracted = sentence.subSequence(12,41)
    val replace = sentence.replace("programming", "development")

    println(replace)


}