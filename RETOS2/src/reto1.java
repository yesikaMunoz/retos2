import java.util.Arrays;
import java.util.Scanner;

public class reto1 {
  public static void main(String[] args) {

    String palabra;
    Scanner lectura = new Scanner(System.in);
    System.out.print("Ingresa una palabra: ");
    palabra = lectura.nextLine();
    //se convertimos la palabra en un array de caracteres
    char[] letra = palabra.toCharArray();
    char[] caracteresInvertidos = new char[letra.length];

    // Invertimos los caracteres y los almacenamos en el array de caracteres invertidos
    for (int i = 0; i < letra.length; i++) {
      caracteresInvertidos[i] = letra[letra.length - 1 - i];
    }

    // Comparamos los arrays de caracteres y caracteres invertidos
    boolean equals = Arrays.equals(letra, caracteresInvertidos);
    if (equals) {
      System.out.println("La palabra "+palabra+" es un palíndromo.");
    } else {
      System.out.println("La palabra "+palabra+" no es un palíndromo.");
    }
    lectura.close();
  }
}
