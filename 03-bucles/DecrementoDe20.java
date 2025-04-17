package bucles;

//Muestra los números del 320 al 160 contando de 20 en 20 hacia atrás

public class DecrementoDe20 {
    public static void main(String[] args) {
        //for (Declarar e iniciar una variable; condicion de true; incremento/decremento)
        for (int i = 320; i >= 160; i -= 20) {
            if (i == 160) {
                System.out.print(i);
            } else {
                System.out.print(i + "-");
            }//Ruptura-False -- i sea menor que 160
        }
    }
}