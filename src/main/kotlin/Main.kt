package kr.co.soundplatform

import kr.co.soundplatform.sort.Sort

fun main() {
    val arr = intArrayOf(55, 13, 42, 63, 89, 12, 11)
    println("정렬되기 전 배열: ${arr.joinToString()}")

    Sort().bubbleSort(arr)
    Sort().selectionSort(arr)
    Sort().insertionSort(arr)
    Sort().mergeSort(arr)
    Sort().quickSort(arr, 0, arr.size - 1)

    println("선택 정렬 후 배열: ${arr.joinToString()}")
}