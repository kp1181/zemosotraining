package krishnaprasad.assignment.singleton;

public class Test2 {
    String ns;

    public static Test2 ini(String a)
    {
        Test2 obj = new Test2();
        obj.ns = a;
        return obj;
    }

    public void print()
    {
        System.out.println(this.ns);
    }
}
