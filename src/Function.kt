//Any code that performs a task
fun main() {
    //1. standard library/Build-In function(they already exist in the language)
    var output =kotlin.math.sqrt(144.0)
    println(output)

    var number = kotlin.math.max(23, 45 )
    println(number)

    add() //calling a function
    student( name = "jane",course="work")

}


    //2.user define function(the user creates and define the function)
    fun add() {
        println(10+5)
    }

   //Parameter/Variable and Argument/ Value
   fun student(name:String, course:String) {
       println(name+course)


}