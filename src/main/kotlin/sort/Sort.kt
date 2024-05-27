package kr.co.soundplatform.sort

class Sort {

    // Bubble Sort
    fun bubbleSort(arr: IntArray) {
        for (i in 0 until arr.size - 1) {
            for (j in 0 until arr.size - 1 - i) {
                if (arr[j] > arr[j + 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j + 1]
                    arr[j + 1] = temp
                }
            }
        }
    }


    // Selection Sort
    fun selectionSort(arr: IntArray) {
        for (i in 0 until arr.size - 1) {
            var minIndex = i
            for (j in i+1 until arr.size) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j
                }
            }

            val temp = arr[minIndex]
            arr[minIndex] = arr[i]
            arr[i] = temp
        }
    }


    // Insertion Sort
    fun insertionSort(arr: IntArray) {
        for (i in 1 until arr.size) {
            var key = arr[i]
            var j = i - 1

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j]
                j--
            }

            arr[j+1] = key
        }
    }

    // Merge Sort
    fun merge(arr:IntArray, left: IntArray, right: IntArray) {
        var i = 0
        var j = 0
        var k = 0

        while (i < left.size && j < right.size) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]
            } else {
                arr[k++] = right[j++]
            }
        }

        while (i < left.size) {
            arr[k++] = left[i++]
        }

        while (j < right.size) {
            arr[k++] = right[j++]
        }
    }

    fun mergeSort(arr: IntArray) {
        if (arr.size <= 1) return

        val mid = arr.size / 2
        val left = arr.copyOfRange(0, mid)
        val right = arr.copyOfRange(mid, arr.size)

        mergeSort(left)
        mergeSort(right)

        merge(arr, left, right)
    }



    // Quick Sort
    fun swap(arr: IntArray, i:Int, j:Int) {
        val temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp
    }

    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1

        for (j in low until high) {
            if (arr[j] <= pivot) {
                i++
                swap(arr, i, j)
            }
        }

        swap(arr, i + 1, high)
        return i + 1
    }

    fun quickSort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val pivotIndex = partition(arr, low, high)
            quickSort(arr, low, pivotIndex - 1)
            quickSort(arr, pivotIndex + 1, high)
        }
    }

}