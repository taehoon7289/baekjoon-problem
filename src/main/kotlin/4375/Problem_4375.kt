import java.util.*

class Problem_4375 {


    // 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
    fun execute() {

        val scanner = Scanner(System.`in`)
        val numbers = mutableListOf<Long>()
        while (scanner.hasNextLong()) {
            val str = scanner.nextLine()

            println("str $str")

            val tempNumber =
                str.split(" ").toMutableList().filter { it -> it.trim().length > 0 }
                    .map { it ->
//                    println("sss ${it.trim().toLong()}")
                        it.trim().toLong()
                    }
            numbers.addAll(tempNumber)
        }


        var temp = StringBuilder("1")

        for (i in numbers) {
            while (temp.toString().toLong() % i != 0L) {
                temp.append("1")
            }
            println(temp.length)
            temp = StringBuilder("1")
        }

    }
}