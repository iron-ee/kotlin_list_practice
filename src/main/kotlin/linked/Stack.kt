package kr.co.soundplatform.linked

class LinkedStack<T> {
    private val list = LinkedList<T>()

    fun isEmpty(): Boolean = list.isEmpty()

    fun push(data: T) {
        list.addLast(data)
    }

    fun pop(): T? {
        return list.removeLast()
    }

    fun peek(): T? {
        return list.peekLast()
    }
}
