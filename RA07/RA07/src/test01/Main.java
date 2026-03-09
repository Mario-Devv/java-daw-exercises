package test01;

public class Main {
    public static void main (String[] args){
        // Creando libros
        Libro libro1 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes");
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("El señor de los anillos", "J.R.R. Tolkien");

        // Creando un vector de libros
        Libro[] libros = new Libro[3];
        libros[0] = libro1;
        libros[1] = libro2;
        libros[2] = libro3;

        // Creando la biblioteca y asignándole libros
        Biblioteca biblioteca = new Biblioteca(libros);

        // Vector de libros en la biblioteca
        for(Libro libro : biblioteca.getLibros())
        {
            System.out.println(libro);
        }
    }
}
