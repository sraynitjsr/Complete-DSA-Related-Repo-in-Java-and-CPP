import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SinglyLinkedList {
    Node startNode;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static SinglyLinkedList insertAtEnd(SinglyLinkedList list, int d) {
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

    public static SinglyLinkedList deleteAtEnd(SinglyLinkedList list) {
        Node temp = list.startNode;
        if (temp == null || temp.next == null) {
            return null;
        } else {
            Node tempNext = temp.next;
            while (tempNext.next != null) {
                tempNext = tempNext.next;
                temp = temp.next;
            }
            temp.next = null;
        }
        return list;
    }

    public static void display(SinglyLinkedList list) {
        Node temp = list.startNode;
        if (temp == null) {
            System.out.println("Empty List");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        
        SinglyLinkedList mySinglyLinkedList = new SinglyLinkedList();
        
        System.out.println("Enter Size of The Linked List");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < size; i++) {
            System.out.println("Enter Data");
            int input = Integer.parseInt(reader.readLine());
            mySinglyLinkedList = insertAtEnd(mySinglyLinkedList,input);
        }
        
        System.out.print("\nThe Created Singly Linked List is => ");
        display(mySinglyLinkedList);

        System.out.print("\nThe Created Linked List After Deleting Last Node => ");
        mySinglyLinkedList = deleteAtEnd(mySinglyLinkedList);
        display(mySinglyLinkedList);        
    }
}
