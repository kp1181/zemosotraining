package assignment2.solution3;

public class ObjectReferenceExample {

    ObjectReferenceExample(String s)
    {
        System.out.println(s);
    }

    public static void main(String args[])
    {
        ObjectReferenceExample arr[] = new ObjectReferenceExample[6];
        //Messages won't be displayed as the constructor is never called
    }
}
