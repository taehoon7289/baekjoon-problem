import java.util.*

class Problem_4344 {


    // 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
    //
    //둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
    fun execute() {

        val sc = Scanner(System.`in`)
        val cases = sc.nextLine().toInt()
        for (i in 0 until cases) {
            val cnt = sc.nextInt()
            val scores = mutableListOf<Int>()
            for (j in 0 until cnt) {
                scores.add(sc.nextInt())
            }
            val sum = scores.sum()
            val average = sum.toDouble().div(cnt)
            var overCnt = 0
            for (score in scores) {
                if (score > average) {
                    overCnt++
                }
            }
            val result =
                Math.round(overCnt.toDouble().div(scores.size).times(100).times(1000)).toDouble()
                    .div(1000)
            println("${String.format("%.3f", result)}%")
        }
    }
}