fun main() {
   // useArray()
//    val result = findMax(intArrayOf(1,2,3,4,5))
//    println(result)
//    val arr = intArrayOf(1,2,3,4,5)
//    val inv = invert(arr)
//    for(n in inv) {
//        println(n)
//    }




//    fizBuzz()
    val chunked = betterChunk(intArrayOf(1,2,3,4,5,6,7), 3)
    for (arr in chunked) {
        for (n in arr) {
            println(n)
        }
        println()
    }
}

fun useArray() {
    val nums = intArrayOf(1,2,3,4,5)
    for(n in nums) {
        println(n)
    }
    val otherNums = IntArray(5)
    for(n in otherNums) {
        println(n)
    }
    for(i in 0 until otherNums.size) {
        otherNums[i] = i
    }

    for(n in otherNums) {
        println(n)
    }
}

fun findMax(arr : IntArray) : Int {
    if(arr.size == 0) {
    //if(arr.isEmpty()) {
       // throw IllegalArgumentException("array must not be empty")
        return Int.MIN_VALUE;

    }
    var max  = arr[0]
    for(n in arr) {
        if(n > max ) {
            max = n
        }
    }
    return max
}

fun invert(arr: IntArray) : IntArray{
    val inverted = IntArray(arr.size)
    for(i in 0..arr.size-1) {
        inverted[i] = arr[arr.size - 1 - i]
    }
    return inverted
}


fun fizBuzz() {
    for(n in 1..100) {
        if (n % 15 == 0) { // if( (n % 3 == 0) && (n % 5 == 0))
            println("fizzbuzz!")
        } else if(n % 3 == 0) {
            println("fizz!");
        } else if(n % 5 == 0) {
            println("buzz")
        } else {
            println(n)
        }
    }
}

fun chunk(arr: IntArray, size : Int) : Array<IntArray>{
    var numChunks = arr.size / size
    if(arr.size % size != 0) {
        ++numChunks
    }
    val chunked = Array<IntArray>(numChunks) { i -> IntArray(size) }

    for((i, n)  in arr.withIndex()) {
       val chunkPos = i / size
       val pos =  i % size
       chunked[chunkPos][pos] = n
    }
    return chunked
}

fun betterChunk(arr: IntArray, size : Int) : Array<IntArray>{
    var numChunks = arr.size / size
    if(arr.size % size != 0) {
        ++numChunks
    }
    val chunked = Array<IntArray>(numChunks) { i -> IntArray(size) }
    var pos = 0
    for(i in 0 .. arr.size-size step size) {
        chunked[pos++] = arr.sliceArray(i until (i+size))
    }
    return chunked
}