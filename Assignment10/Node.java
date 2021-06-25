package Assignment10;

class Node<T> {
    T data;
    Node<T> next;
    Node(T data) {
        this.data = data;
        this.next = null;
    }
    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
    public String toString() {
        if(data == null) return "Null";
        return data.toString();
    }
}

