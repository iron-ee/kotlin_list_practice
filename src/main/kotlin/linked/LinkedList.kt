package kr.co.soundplatform.linked

data class Node<T>(var data: T, var prev: Node<T>? = null, var next: Node<T>? = null)

class LinkedList<T> {
    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun isEmpty(): Boolean = head == null

    fun addFirst(data: T) {
        val newNode = Node(data)
        if (isEmpty()) {
            head = newNode
            tail = newNode
        } else {
            newNode.next = head
            head?.prev = newNode
            head = newNode
        }
    }

    fun addLast(data: T) {
        val newNode = Node(data)
        if (isEmpty()) {
            head = newNode
            tail = newNode
        } else {
            newNode.prev = tail
            tail?.next = newNode
            tail = newNode
        }
    }


    fun removeFirst(): T? {
        if (isEmpty()) {
            return null
        }
        val removedData = head?.data
        head = head?.next
        if (head == null) {
            tail = null
        } else {
            head?.prev = null
        }
        return removedData
    }

    fun removeLast(): T? {
        if (isEmpty()) {
            return null
        }
        val removedData = tail?.data
        tail = tail?.prev
        if (tail == null) {
            head = null
        } else {
            tail?.next = null
        }
        return removedData
    }

    fun showForward() {
        var current = head
        while (current != null) {
            println("${current.data} ")
            current = current.next
        }
    }

    fun showBackward() {
        var current = tail
        while (current != null) {
            println("${current.data} ")
            current = current.prev
        }
    }

    fun peekFirst(): T? {
        return head?.data
    }

    fun peekLast(): T? {
        return tail?.data
    }
}
