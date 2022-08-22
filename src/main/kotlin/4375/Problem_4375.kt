import java.math.BigInteger
import java.util.*

class Problem_4375 {


    // 2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.
    fun execute() {

        val scanner = Scanner(System.`in`)
        val str = StringBuilder("")
        while (scanner.hasNext()) {
            str.append("${scanner.next()} ")
        }

        str.split(" ").filter { it.isNotEmpty() }.map {
            it.toBigInteger()
        }.forEach {
            var i = BigInteger("1")
            val solution = BigInteger("0")
            val timesValue = BigInteger("10")
            val plusValue = BigInteger("1")
            while (true) {
                val result = i.mod(it)
                if (result == solution) {
                    println("${i.toString().length}")
                    break
                } else {
                    i = i.times(timesValue).plus(plusValue)
                }
            }
        }
    }
}