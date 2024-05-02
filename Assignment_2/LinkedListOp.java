package Assignment_2;
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LinkedListOp {
    Node head=null;

    //Inserting node at the end of the list
    public void insert(int val)
    {
        Node temp=new Node(val);
        if(head==null)
        {
            head=temp;
        }
        else
        {
            Node p =head;
            while(p.next!=null)
            {
                p=p.next;
            }
            p.next=temp;
        }
    }

    ///Deleting the node
    public void delete(int val)
    {
        if(head==null)
        {
            System.out.println("Linked list is empty");
            return;
        }
        if(head.data==val)
        {
            head=head.next;
            return;
        }

        Node p=head;
        while(p.next!=null && p.next.data!=val)
        {
            p=p.next;
        }
        if(p.next!=null)
        {
            p.next=p.next.next;
        }
    }

    //Search an element in linked list
    public boolean search(int val)
    {
        Node p=head;
        while (p!=null) {
            if(p.data==val)
            {
                return true;
            }
            p=p.next;
        }
        return false;
    }

    //Reversing Linked list using sliding pointers
    public void reverse()
    {
        Node p, q,r;
        p=head;
        q=null;
        r=null;
        while(p!=null)
        {
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        head=q;
    }

    //finding middle element in the linked list
    Node findMid()
    {
        if(head==null)
            return null;
        Node p=head;
        Node q=null;
        while (q!=null && q.next!=null) {
            p=p.next;
            q=q.next.next;
        }
        return p;
    } 

    //Merging the two linked list 
    public void merge(LinkedListOp ll2)
    {
        Node temp = new Node(-1);
        Node current = temp;
        Node p=this.head;
        Node q=ll2.head;
        while(p!=null && q!=null)
        {
            if(p.data < q.data)
            {
                current.next=p;
                p=p.next;
            }
            else
            {
                current.next=q;
                q=q.next;
            }
            current=current.next;
        }
        if(p!=null)
        {
            current.next=p;
        }
        else
        {
            current.next=q;
        }
        this.head=temp.next;
        System.out.print("Lists merged: ");
        display();
    }

    //Display the linked list
    public void display()
    {
        Node p=head;
        while(p!=null)
        {
            System.out.print(p.data + " ");
            p=p.next;
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        LinkedListOp ll=new LinkedListOp();
        int ch;
        do {
            System.out.println("****************** Linked List ******************");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Reverse");
            System.out.println("5. Find Middle Element");
            System.out.println("6. Merge sorted lists");
            System.out.println("7. Display");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                 case 1:
                    System.out.print("Enter value to insert: ");
                    int insertNum = sc.nextInt();
                    ll.insert(insertNum);
                    ll.display();
                    break;
                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteNum = sc.nextInt();
                    ll.delete(deleteNum);
                    System.out.println(deleteNum + " is deleted");
                    ll.display();
                    break;
                case 3:
                    System.out.print("Enter value to search: ");
                    int searchNum = sc.nextInt();
                    boolean isPresent = ll.search(searchNum);
                    if (isPresent) {
                        System.out.println(searchNum + " is present in the list.");
                    } else {
                        System.out.println(searchNum + " is not present in the list.");
                    }
                    break;
                case 4:
                    System.out.println("Reversed linked list: ");
                    ll.reverse();
                    ll.display();
                    break;
                case 5:
                    Node middle = ll.findMid();
                    if (middle != null) {
                        System.out.println("Middle element: " + middle.data);
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;
                case 6:
                    LinkedListOp ll2 =new LinkedListOp();
                    System.out.println("Enter elements of the second sorted list (enter -1 to stop): ");
                    int val;
                    while((val=sc.nextInt())!=-1)
                    {
                        ll2.insert(val);
                    }
                    ll.merge(ll2);
                    break;
                case 7:
                    System.out.println("Linked List:");
                    ll.display();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }while(ch!=8); 
    }
}
