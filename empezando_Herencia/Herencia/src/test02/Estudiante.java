package test02;

public class Estudiante extends Persona {
    private String curso;
    private double nota;

    public String getCurso() {
        return curso;
    }

    public double getNota() {
        return nota;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
