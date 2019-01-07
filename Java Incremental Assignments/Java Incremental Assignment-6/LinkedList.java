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





class SList<T>
{
    Node<T> head = new Node<>(null);

    SListIterator<T> iterator()
    {
        return new SListIterator<T>(head);
    }

    public String toString()
    {

        if(head.next==null)
        {
            return "Empty list";
        }


        SListIterator<T> i = iterator();
        String str="";
        while(i.hasNext())
        {
            str += i.next()+" -->  ";
        }
        return str;

    }
}






class SListIterator<T>
{
    Node<T> head;
    Node<T> cur;

    SListIterator(Node<T> head)
    {
        this.head = head;
        this.cur = head;
    }

    public void insert(T n)
    {
        cur.next = new Node<T>(n);
        cur = cur.next;
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
        cur = tmp;
        tmp.next = null;

    }

    public boolean hasNext()
    {
        if(cur.next!= null)
            return true;

        else
            return false;
    }

    public Node<T> next()
    {
        cur = cur.next;
        return cur;
    }
}


public class LinkedList {
    public static void main(String args[])
    {
        SList<Integer> sl = new SList<Integer>();
        SListIterator iter = sl.iterator();

        //prints empty list
        System.out.println(sl);

        //inserts 4 elements
        iter.insert(6);
        iter.insert(4);
        iter.insert(1);
        iter.insert(0);

        //displays all 4elements
        System.out.println(sl);



        //removes 4 elements and tries to remove another element from empty list which fails
        iter.remove();
        iter.remove();
        iter.remove();
        iter.remove();
        iter.remove();

        //prints empty list
        System.out.println(sl);


    }
}
