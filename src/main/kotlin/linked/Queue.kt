package kr.co.soundplatform.linked

class LinkedQueue<T> {
    private val list = LinkedList<T>()

    fun isEmpty(): Boolean = list.isEmpty()

    fun enqueue(data: T) {
        list.addLast(data)
    }

    fun dequeue(): T? {
        return list.removeFirst()
    }

    fun peek(): T? {
        return list.peekFirst()
    }
}
