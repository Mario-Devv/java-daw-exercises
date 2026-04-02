package Asignaturas;

public class Asignaturas {

        protected String codigoASignatura;
        protected String nombre;
        protected int horas;
        protected String curso;
        protected double precio_hora;

        public Asignaturas(String codigoASignatura, String nombre, int horas, String curso, double precio_hora) {
            this.codigoASignatura = codigoASignatura;
            this.nombre = nombre;
            this.horas = horas;
            this.curso = curso;
            this.precio_hora = precio_hora;
        }

        public String getCodigoASignatura() {
            return codigoASignatura;
        }

        public void setCodigoASignatura(String codigoASignatura) {
            this.codigoASignatura = codigoASignatura;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }

        public String getCurso() {
            return curso;
        }

        public void setCurso(String curso) {
            this.curso = curso;
        }

        public double getPrecio_hora() {
            return precio_hora;
        }

        public void setPrecio_hora(double precio_hora) {
            this.precio_hora = precio_hora;
        }

        public double calculoPrecioHora () {
            double calculo = horas * precio_hora;

            return calculo;
        }

        @Override
        public String toString() {
            return "asignaturas " +
                    "codigo Asignatura='" + codigoASignatura + '\'' +
                    ", nombre='" + nombre +" "+ calculoPrecioHora()+ "€";
        }
    }

