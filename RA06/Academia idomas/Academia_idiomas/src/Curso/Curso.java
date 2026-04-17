package Curso;

import java.util.Objects;

public class Curso {
    private String codigoCurso;
    private String idioma;
    private String nivel;
    private int horasSemanales;
    private int precioPorHora;
    private boolean activo;

    public Curso() {
        this.codigoCurso = null;
        this.idioma = null;
        this.nivel = null;
        this.horasSemanales = 0;
        this.precioPorHora = 0;
        this.activo = false;
    }

    public Curso(String codigoCurso, String idioma, String nivel,  boolean activo ,int horasSemanales, int precioPorHora) {
        this.codigoCurso = codigoCurso;
        this.idioma = idioma;
        this.nivel = nivel;
        this.horasSemanales = horasSemanales;
        this.precioPorHora = precioPorHora;
        this.activo = activo;
    }

    public Curso(Curso curso) {
        this.codigoCurso = curso.codigoCurso;
        this.idioma = curso.idioma;
        this.nivel = curso.nivel;
        this.horasSemanales = curso.horasSemanales;
        this.precioPorHora = curso.precioPorHora;
        this.activo = curso.activo;
    }


    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public void setHorasSemanales(int horasSemanales) {
        this.horasSemanales = horasSemanales;
    }

    public int getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(int precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    //Metodos
    private String isActiva(){
        if(this.activo){
            return "SI";
        } else {
            return "NO";
        }
    }

    //HasCode && equals
    public boolean equals(Object obj){
        boolean iguales = false;

        if(obj instanceof Curso){
            Curso c = (Curso)obj;
            iguales = c.codigoCurso.equals(this.codigoCurso);
        }

        return iguales;
    }

    public int hashCode(){
        return Objects.hash(codigoCurso);
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigoCurso=" + codigoCurso +
                ", idioma='" + idioma + '\'' +
                ", nivel='" + nivel + '\'' +
                ", horasSemanales=" + horasSemanales +
                ", precioPorHora=" + precioPorHora +
                ", activo=" + isActiva() +
                '}';
    }
}
