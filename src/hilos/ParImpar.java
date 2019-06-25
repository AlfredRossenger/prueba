package hilos;

import java.util.*;

/**
 *
 * @author carlos
 */
public class ParImpar extends Thread {

    boolean par;
    static int numeros[] = new int[100];

    public ParImpar() {

    }

    public ParImpar(boolean par) {
        this.par = par;
    }

    public static void main(String[] args) {

        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = i;

        }

        // verdadeero para par , falso para impar 
        ParImpar h = new ParImpar(true);
        h.start();
    }

    public void llenar() {
        Scanner sc = new Scanner(System.in);

    }

    @Override
    public void run() {
        if (par) {
            for (int i = 1; i < numeros.length; i++) {

                try {
                    if (numeros[i] % 2 == 0) {
                        sleep(500);
                        System.out.print(numeros[i] + "->");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        } else {
            for (int i = 1; i < numeros.length; i++) {

                if (numeros[i] % 2 == 1) {
                    try {
                        if (numeros[i] % 2 == 1) {
                            sleep(500);
                            System.out.print(numeros[i] + "->");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                }
            }
        }
    }
}
