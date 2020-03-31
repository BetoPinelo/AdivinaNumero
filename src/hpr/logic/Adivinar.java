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
            System.out.println("Tengo un número entre el 1 y 1000 \n¿Puedes adivinar el número? \nEscribe tu opción:");

            //Tendras 10 oportunidades
            for (int i = 0; i <= 10; i++) {
                if (i == 10) {
                    System.out.println("Perdite!!! \n");
                    jugar = Boolean.FALSE;
                    break;
                }

                opcionJugador = in.nextInt();

                if (numAdivinar == opcionJugador) {
                    System.out.println("¡Excelente! ¡Adivinaste el número! \n¿Quieres jugar de nuevo?(s/n)");
                    desJugar = in.next();
                    if (desJugar.equals("n") || desJugar.equals("no") || desJugar.equals("NO")) {
                        jugar = Boolean.FALSE;
                    }
                    break;
                } else {
                    if (numAdivinar > opcionJugador) {
                        System.out.println("Mas alto!");
                    } else {
                        System.out.println("Mas bajo!");
                    }
                }
            }
        }
    }

}
