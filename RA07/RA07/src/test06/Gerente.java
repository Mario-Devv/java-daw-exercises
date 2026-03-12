package test06;

public class Gerente extends Empleado {
    protected String departamento;

    public Gerente(String nombre, double salario, String departamento){
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + ", Departamento: "+this.departamento;
    }
}
