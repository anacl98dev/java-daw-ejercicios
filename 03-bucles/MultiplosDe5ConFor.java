package bucles;

//Mismo ejercicio, pero empleando el FOR
//Muestra los números múltiplos de 5 del 0 al 100

public class MultiplosDe5ConFor {
    public static void main(String[] args) {
        //0-5-10-15...-100
        //for (Declarar e iniciar una variable; condicion de true; incremento/decremento)
        for (int acumulador = 0; acumulador <= 100; acumulador += 5) {
            if (acumulador == 100) {
                System.out.print(acumulador);
            } else {
                System.out.print(acumulador + "-");
            }
        }//Ruptura-False: acumulador > 100
    }
}
