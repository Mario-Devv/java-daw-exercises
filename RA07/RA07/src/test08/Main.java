package test08;

public class Main {
    public static void main(String[] args)
    {
        Tablet t1 = new Tablet("iPad", "10", 10.9f);
        Laptop l1 = new Laptop("MacBook Pro", "M1", "Español");

        System.out.println(t1);
        System.out.println(l1);

        t1.encender();
        l1.encender();

        t1.apagar();
        l1.apagar();
    }
}
