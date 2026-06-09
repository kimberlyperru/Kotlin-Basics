fun main() {

    //1. Arithmetic Operators
    var x = 30
    var y = 50

    println(x + y)
    println(x * y)
    println(y - x)
    println(y/x)


    //2. Comparison Operators
    println(x < y)
    println(x > y)
    println(y < x)
    println(x == y) //equal to
    println(y <= x)
    println(y != x)

    //3. Assignment Operators (performs arithmetic operation and assign back results to the variable)
     var score = 20
    score += 2 //(where the score changes{+=, -=, *=, /=})
    println("updated score is " + score)


    //4. Modulo (prints the reminder of a division)
    var dividend = 19
    var divisor = 3

    var remainder = dividend % divisor
    println("The remainder of $divisor is $remainder")

    //5. Logical Operators (evaluates two boolean conditions and returns true only if both conditions are true and vice versa)
    var ValidID = true
    var IsAdmin = false

    if (ValidID && IsAdmin) {
        println("Pass")
    }
    else{
        println("Denied")
    }




}