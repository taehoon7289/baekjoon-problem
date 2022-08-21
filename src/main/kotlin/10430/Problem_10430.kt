import java.util.Scanner

class Problem_10430 {


    //    (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
//
//    (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
//
//    세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
    fun execute() {

        val a: Int
        val b: Int
        val c: Int

        val scanner = Scanner(System.`in`)

        a = scanner.nextInt()
        b = scanner.nextInt()
        c = scanner.nextInt()

        val value1 = (a + b) % c
        val value2 = ((a % c) + (b % c)) % c
        val value3 = (a * b) % c
        val value4 = ((a % c) * (b % c)) % c

        println(value1)
        println(value2)
        println(value3)
        println(value4)

    }
}