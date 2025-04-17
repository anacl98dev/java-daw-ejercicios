package bucles;

/* Ejercicio de la lotería
Sorteo diario. Compro dos boletos al día con dos numeros de boleto fijos y juego contra el estado.
Quiero saber en cuántos años me tocará y el dinero invertido.
Precio: 2€ cada boleto - 00000:99.999 (posibilidades)
Premio de 35k
*/

public class ProbabilidadLoteria {
    public static void main(String[] args) {

        //Entrada de datos
        int boletoDiario = 29595;
        int boletoDiario2 = 91898;
        int boletoEstado = (int) (Math.floor(Math.random() * 100000));
        int acumulador = 4;
        int contadorDias = 1;
        //¿Cuándo acabo de jugar?

        while (boletoDiario != boletoEstado && boletoDiario2 != boletoEstado) {
            boletoEstado = (int) (Math.floor(Math.random() * 100000));
            acumulador += 4;
            contadorDias++;
        }//boletoDiario == boletoEstado; || //boletoDiario2 == boletoEstado;
        System.out.println("El siguiente boleto ha sido premiado " + boletoEstado);
        System.out.println("Dinero gastado: " + acumulador);
        int balance = 35000 - acumulador;
        System.out.println("Balance: " + balance);
        System.out.println(contadorDias / 365 + " años " + contadorDias % 365 + " dias");
    }
}
