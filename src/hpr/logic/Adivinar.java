package hpr.logic;

import java.util.Scanner;

/**
 *
 * @author Humberto Pinelo Rivera
 */
public class Adivinar {

    public void adivinarNumero() {
        Boolean jugar = Boolean.TRUE;
        String desJugar;
        Scanner in = new Scanner(System.in);
        int opcionJugador;

        while (jugar) {
            //Generamos el numero aleatorio!
            int numAdivinar = (int) (Math.random() * (1 - 1000 + 1) + 1000);
            System.out.println("****************************************\n"
                    + "*         Adivina el Numero!!!         *\n"
                    + "****************************************\n");

            //Tendras 10 oportunidades
            for (int i = 0; i <= 10; i++) {
                if (i == 10) {
                    System.out.println("Perdite!!! \n");
                    break;
                }

                System.out.print("Escribe tu opción: ");
                opcionJugador = in.nextInt();

                if (numAdivinar == opcionJugador) {
                    System.out.println("Felicidades Ganaste!!! \n");
                    break;
                } else {
                    if (numAdivinar > opcionJugador) {
                        System.out.println("Mas alto!");
                    } else {
                        System.out.println("Mas bajo!");
                    }
                }
            }

            //Preguntamos si desea seguir jugando
            System.out.println("¿Desea seguir jugando? (s/n)");
            desJugar = in.next();
            if (desJugar.equals("n") || desJugar.equals("no") || desJugar.equals("NO")) {
                jugar = Boolean.FALSE;
            }

        }
    }

}
