import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class DetectLoopInLinkedList {
    Node startNode;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static DetectLoopInLinkedList insertAtEnd(DetectLoopInLinkedList list, int d) {
        Node node = new Node(d);
		if (list.startNode == null) {
			list.startNode = node;
		}
		else {
            Node temp = list.startNode;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;            
		}
		return list;
    }

    public static void detectLoop(DetectLoopInLinkedList temp) {

        //Make a loop
        Node start = temp.startNode;
        if (start == null) {
            System.out.println("No Data, Can Not Create The Loop");
            return;
        }
        Node firstNode = start;
        while (start.next != null) {
            start = start.next;
        }
        start.next = firstNode; //Loop Created

        Node slowPointer = temp.startNode, fastPointer = temp.startNode;
        int flag = 0;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
		System.out.println("Loop is found");
		else
		System.out.println("Loop is not found");
    }

    public static void main(String[] args) throws IOException {
        
        DetectLoopInLinkedList mySinglyLinkedList = new DetectLoopInLinkedList();
        
        System.out.println("Enter Size of The Linked List");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Data");
            int input = Integer.parseInt(reader.readLine());
            mySinglyLinkedList = insertAtEnd(mySinglyLinkedList,input);
        }

        detectLoop(mySinglyLinkedList);
    }
}
