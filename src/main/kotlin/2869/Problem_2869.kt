import java.util.*

class Problem_2869 {


    // 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
    //
    //달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 또, 정상에 올라간 후에는 미끄러지지 않는다.
    //
    //달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
    fun execute() {

        val sc = Scanner(System.`in`)
        val a = sc.nextLong()
        val b = sc.nextLong()
        val v = sc.nextLong()
// 주석방법은 시간초과됨
//        var days = 0
//        var distance = 0L
//        do {
//            days++
//            distance += a
//            if (v <= distance) {
//                break
//            }
//            distance -= b
//        } while (v > distance)
//        println(days)
        // v - a >= day(a - b)
        val minDay = Math.ceil(v.minus(a).toDouble().div(a.minus(b))).toLong()
        println(minDay.plus(1))
    }
}