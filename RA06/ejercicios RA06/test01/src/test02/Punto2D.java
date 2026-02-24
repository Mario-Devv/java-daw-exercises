package test02;

public class Punto2D {
        int x;
        int y;

        public Punto2D(String miPuntico){
            String[] separar = miPuntico.split(",");
            String numIZQlimpio = separar[0].replace("(", "");
            String numDERlimpio = separar[1].replace(")", "");
            int parseNumIZQ = Integer.parseInt(numIZQlimpio);
            int parseNumDER = Integer.parseInt(numDERlimpio);

            x = parseNumIZQ;
            y = parseNumDER;
        }

    public String toString () {
        return "Punto2D{"+"x="+x+", "+"y="+y+"}";
    }
}
