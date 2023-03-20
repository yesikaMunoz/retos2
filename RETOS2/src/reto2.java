import java.util.Scanner;

public class reto2 {
    public static void main(String[] args) {
        double apuesta = 100000;
        int partidasGanadas = 0;
        int partidasPerdidas = 0;
        int intentosRestantes = 10;
        char letraIngresada;
        char[] palabraAdivinada;
        String nombreUsuario;
        Scanner lectura = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
         nombreUsuario = lectura.nextLine();

        boolean seguirJugando = true;

        while (seguirJugando) {
            boolean letraEncontrada = false;
            String[] palabras = {"Aguacate", "maracuya", "policia", "celular", "pantalla", "reloj"};
            String palabraSeleccionada = palabras[(int) (Math.random() * palabras.length)];
            palabraAdivinada = new char[palabraSeleccionada.length()];

            for (int i = 0; i < palabraAdivinada.length; i++) {
                palabraAdivinada[i] = '_';
            }

            while (intentosRestantes > 0 && !palabraSeleccionada.equals(new String(palabraAdivinada))) {
                System.out.print("Palabra a adivinar: ");
                for (char letra : palabraAdivinada) {
                    System.out.print(letra + " ");
                }
                System.out.println();
                System.out.println("Intentos restantes: " + intentosRestantes);
                System.out.print("Ingresa una letra: ");
                letraIngresada = lectura.next().charAt(0);

                letraEncontrada = false;
                for (int i = 0; i < palabraSeleccionada.length(); i++) {
                    if (palabraSeleccionada.charAt(i) == letraIngresada) {
                        palabraAdivinada[i] = letraIngresada;
                        letraEncontrada = true;
                    }
                }
                if (!letraEncontrada) {
                    intentosRestantes--;
                }
            }
            if (intentosRestantes == 0) {
                System.out.println("Lo siento, " + nombreUsuario + ", perdiste. La palabra era: " + palabraSeleccionada);
                apuesta = apuesta -10000;
                partidasPerdidas++;
            } else {
                System.out.println("¡Felicidades, " + nombreUsuario + "! Adivinaste la palabra: " + palabraSeleccionada);
                apuesta = apuesta +5000;
                partidasGanadas++;
            }

            System.out.println("Tu apuesta actual es de: $" + apuesta);
            System.out.println("Llevas " + partidasGanadas + " partidas ganadas y " + partidasPerdidas + " partidas perdidas.");

            System.out.print("¿Quieres seguir jugando? (s/n): ");
            String respuesta = lectura.next();
            seguirJugando = respuesta.equalsIgnoreCase("s");
        }

        System.out.println("Gracias por jugar, " + nombreUsuario + ". Tu saldo final es de: $" + apuesta);
        lectura.close();
    }
}
