class Solution {
    companion object {
        const val LOGIN = "login"
        const val WRONG_PASSWORD = "wrong pw"
        const val FAIL = "fail"
    }

    fun solution(id_pw: Array<String>, db: Array<Array<String>>): String {
        db.forEach { user ->
            if(id_pw[0] == user[0]){
                return if(id_pw[1]== user[1]) LOGIN
                else WRONG_PASSWORD
            }
        }
        return FAIL
    }
}

fun main() {
    val a = Solution()
    a.solution(
        arrayOf("meosseugi", "1234"),
        arrayOf(
            arrayOf("rardss", "123"),
            arrayOf("yyoom", "1234"),
            arrayOf("meosseugi", "1234")
        )
    )//login

    a.solution(
        arrayOf("programmer01", "15789"),
        arrayOf(
            arrayOf("programmer02", "111111"),
            arrayOf("programmer00", "134"),
            arrayOf("programmer01", "1145")
        )

    )//wrong pw

    a.solution(
        arrayOf("rabbit04", "98761"),
        arrayOf(
            arrayOf("jaja11", "98761"),
            arrayOf("krong0313", "29440"),
            arrayOf("rabbit00", "111333")
        )
    )
}