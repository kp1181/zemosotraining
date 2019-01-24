package assignment2.solution4;

public class ObjectReferenceAndCreationExample {

    ObjectReferenceAndCreationExample(String s)
    {

        System.out.println(s);
    }

    public static void main(String args[])
    {
        ObjectReferenceAndCreationExample arr[] = new ObjectReferenceAndCreationExample[6];

        for(int i=0;i<arr.length;i++)
            arr[1] = new ObjectReferenceAndCreationExample(String.valueOf(i));
        //6 messages will be displayed here as the length of array is 6

    }
}
