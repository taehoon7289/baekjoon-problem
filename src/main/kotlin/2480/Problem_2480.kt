import java.util.*

class Problem_2480 {


    // 1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
    //
    //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
    //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
    //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
    //예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
    //
    //3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
    fun execute() {

        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()

        val set = mutableSetOf(a, b, c)

        if (set.size == 1) {
            println(a.times(1000).plus(10000))
        } else if (set.size == 2) {
            val list = mutableListOf(a, b, c)
            list.sortDescending()
            val value = list.get(1)
            println(value.times(100).plus(1000))
        } else {
            println(
                set.stream().max(Comparator.comparing { x -> x }).get()
                    .times(100)
            )
        }

    }

    fun execute2() {

        val sc = Scanner(System.`in`)
        val a = sc.nextInt()
        val b = sc.nextInt()
        val c = sc.nextInt()

        val inputs = listOf(a, b, c)
        val map = mutableMapOf<Int, Int>()
        for (input in inputs) {
            map[input] = (map[input] ?: 0) + 1
        }

        val entries = map.entries

        when (entries.size) {
            1 -> {
                println(entries.first().key.times(1000).plus(10000))
            }

            2 -> {
                val value = entries.stream()
                    .max(Comparator.comparing { (_, value) -> value }).get().key
                println(value.times(100).plus(1000))
            }

            else -> {
                val value = entries.stream()
                    .max(Comparator.comparing { (key, _) -> key }).get().key
                println(
                    value.times(100)
                )
            }
        }

    }


}