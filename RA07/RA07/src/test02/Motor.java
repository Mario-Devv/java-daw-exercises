package test02;

public class Motor {
    private boolean encendido;

    public Motor(){
        this.encendido = false; //Apagado
    }

    public String Encender(){
        if(this.encendido){
            return "El motor ya está encendido.";
        }else{
            this.encendido = true;
            return "Motor encendido.";
        }
    }

    public String Apagar(){
        if(!this.encendido){
            return "El motor ya está apagado.";
        } else{
            this.encendido = false;
            return "Motor apagado.";
        }
    }

    public String estaEncendido () {
        return "El motor está " + this.encendido;
    }
}
