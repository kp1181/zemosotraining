package assignment2.solution2;

public class Employee {
    String name;

    Employee()
    {
        this("Not mentioned");
    }

    Employee(String a)
    {
        this.name = a;
    }

    public static void main(String args[])
    {
        Employee employee1 = new Employee();
        System.out.println(employee1.name);
    }
}
