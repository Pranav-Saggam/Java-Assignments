package Assignment10;

public class SList<T> {
    private Node<T> head = new Node<T>(null);
    private T value;
    SListIterator<T> iterator() { return new SListIterator<T>(head); }
    public String toString() {
        if(head.next == null) return "SList: LinkedList is empty!";
        SListIterator<T> iterator = this.iterator();
        String result="";
        while(iterator.hasNext()) {
            result+=iterator.next();
            if(iterator.hasNext())
                result+="->";
        }
        return result;
    }

}
