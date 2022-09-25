import java.util.*

fun smooth(index:Int, arr: Array<Float>):Float {
    return if (index > 0 && index < arr.size - 1) {
        (arr[index-1]+arr[index]+arr[index+1]) / 3
    }
    else {
        arr[index]
    }
}

fun main() {

    val n = readLine()!!.split(" ")[0].toInt()
    val line = readLine()!!.split(" ")
    val arr = Array(n){i -> line[i].toFloat()}

    val smooth_arr = Array(arr.size){num -> smooth(num, arr)}
    for (i in smooth_arr) {
        print(i)
        print(" ")
    }

}
