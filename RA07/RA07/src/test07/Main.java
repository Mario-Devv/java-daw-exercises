package test07;

public class Main {
    public static void main(String[] args)
    {
        Estudiante estudiantePorDefecto = new Estudiante();
        Estudiante estudianteConParametros = new Estudiante("Ana", 20, "Desarrollo de Aplicaciones Web");
        Estudiante estudianteCopia = new Estudiante(estudianteConParametros);

        System.out.println(estudiantePorDefecto);
        System.out.println(estudianteConParametros);
        System.out.println(estudianteCopia);
    }
}
