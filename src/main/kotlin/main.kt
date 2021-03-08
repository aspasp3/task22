fun main(){
    val likes = 99991

    var result = when {
        (((likes - 11) % 100) == 0) && (likes > 10) -> "ludam"
        else -> {
            var num = likes % 100
            if (num > 19) {
                num = num % 10
            }
            when(num) {
                1 -> "cheloveku"
                else -> "ludam"
            }
        }
    }

    println("ponravilos: $likes $result")

}