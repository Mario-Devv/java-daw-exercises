package test01;

import java.util.ArrayList;

public class Biblioteca {
    Libro[] l;

    public Biblioteca(Libro[] libros) {
        this.l = libros;
    }

    public Libro[] getLibros() {
        return l;
    }
}
