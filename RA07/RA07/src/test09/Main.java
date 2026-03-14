package test09;

public class Main {
    public static void main(String[] args)
    {
        Producto p;

        Perecedero p1 = new Perecedero("Bebida de soja", 1.99, "Bebida de soja con calcio y sin gluten", 20, "18/04/2024");
        NoPerecedero np1 = new NoPerecedero("Quinoa", 12, "Quinoa de los Andes - 200grs", 20, "18/04/2027");

        p = p1;
        System.out.println(p);

        p = np1;
        System.out.println(np1);

    }
}
