package Assignment10;

public class SListIterator<T> {

    public Node<T> curr_node;
    public  SListIterator(Node<T> node){
        curr_node = node;
    }
    public boolean hasNext(){
        return curr_node.next != null;
    }
    public Node<T> next() {
        curr_node = curr_node.next;
        return curr_node;
    }
    public void add(T data) {
        curr_node.next = new Node<T>(data, curr_node.next);
        curr_node = curr_node.next;
    }
    public void remove(T data) {
        Node temp;
        while(curr_node.next!=null){
            temp=curr_node;
            curr_node=curr_node.next;
            if(curr_node.data==data){
                temp.next=curr_node.next;
                break;
            }
        }
    }
}
