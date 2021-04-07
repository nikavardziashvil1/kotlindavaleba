fun main () {
    val A = Point()
    A.x = 10
    A.y = 15

    println(A)

    val B = Point()
    B.x = 10
    B.y = 15

    println(A.equals(B))
    println(A.y)
    A.changingY(y = -15)
    println(A.y)
    println(A)



}

class Point {

    var x: Int = 1
    var y: Int = 2

    override fun toString(): String {

        return ("($x;$y)")
    }

    override fun equals(other: Any?): Boolean {
        if (other is Point) {
            if (x == other.x)
                if(y == other.y)
                    return true
        }
        return false


    }

    fun changingY(y: Int) {
        this.y = y
        println("Changing y")
    }


}