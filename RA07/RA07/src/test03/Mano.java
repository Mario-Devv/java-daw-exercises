package test03;

public class Mano {
    Dedo[] dedos;

    public Mano (){
        this.dedos = new Dedo[5];
        this.dedos[0] = new Dedo("Pulgar");
        this.dedos[1] = new Dedo("Índice");
        this.dedos[2] = new Dedo("Medio");
        this.dedos[3] = new Dedo("Anular");
        this.dedos[4] = new Dedo("Meñique");
    }

        public void mostrarDedos(){
            for(int i = 0; i < dedos.length; i++){
                System.out.println(dedos[i].getNombreDedo());
            }
        }
    }

