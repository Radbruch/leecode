/**
 * @ClassName Main
 * @Description TODO
 * @Author msjoy
 * @Date 2024/9/1 13:06
 * @Version 1.0
 **/
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(4);
        list.get(1);
        list.addAtHead(1);
        list.addAtHead(5);
        list.deleteAtIndex(3);
        list.addAtHead(7);
        list.get(3);
        list.get(3);
        list.get(3);
        list.addAtHead(1);
        list.deleteAtIndex(4);


    }
}
