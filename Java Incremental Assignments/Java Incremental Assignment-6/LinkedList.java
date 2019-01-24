package assignment6;

class Node<T>
{
    T data;
    Node<T> next;

    Node(T d)
    {
        this.next = null;
        this.data = d;
    }

    public String toString()
    {
        if(this.data==null)
            return "No data";
        else{
            return data.toString();
        }
    }
}





class SinglyLinkedList<T>
{
    Node<T> head = new Node<>(null);
    SinglyLinkedListIterator<T> iterator()
    {
        return new SinglyLinkedListIterator<T>(head);
    }

    public String toString()
    {

        if(head.next==null)
        {
            return "Empty list";
        }


        SinglyLinkedListIterator<T> iter = iterator();
        String str="";
        while(iter.hasNext())
        {
            str += iter.next()+" -->  ";
        }
        return str;

    }
}






class SinglyLinkedListIterator<T>
{
    Node<T> head;
    Node<T> current;

    SinglyLinkedListIterator(Node<T> head)
    {
        this.head = head;
        this.current = head;
    }

    public void insert(T n)
    {
        current.next = new Node<T>(n);
        current = current.next;
        System.out.println("Inserted data : "+n);
    }

    public void remove()
    {
        Node<T> tmp = head;
        if(tmp.next==null)
        {
            System.out.println("No data in list");
            return;
        }


        while(tmp.next.next!=null)
        {
            tmp = tmp.next;
        }

        System.out.println("Removing data : "+tmp.next.data);
        current = tmp;
        tmp.next = null;

    }

    public boolean hasNext()
    {
        if(current.next!= null)
            return true;

        else
            return false;
    }

    public Node<T> next()
    {
        current = current.next;
        return current;
    }
}


public class LinkedList {
    public static void main(String args[])
    {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
        SinglyLinkedListIterator singlyLinkedListIterator = singlyLinkedList.iterator();

        //prints empty list
        System.out.println(singlyLinkedList);

        //inserts 4 elements
        singlyLinkedListIterator.insert(6);
        singlyLinkedListIterator.insert(4);
        singlyLinkedListIterator.insert(1);
        singlyLinkedListIterator.insert(0);

        //displays all 4elements
        System.out.println(singlyLinkedList);



        //removes 4 elements and tries to remove another element from empty list which fails
        singlyLinkedListIterator.remove();
        singlyLinkedListIterator.remove();
        singlyLinkedListIterator.remove();
        singlyLinkedListIterator.remove();
        singlyLinkedListIterator.remove();

        //prints empty list
        System.out.println(singlyLinkedList);


    }
}
