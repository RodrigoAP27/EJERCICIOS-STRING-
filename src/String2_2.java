import java.util.Scanner;
public class String2_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = sc.nextLine();

        int[] frecuencia = new int[256];

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);


        }

        for (int i = 0; i < frecuencia.length; i++) {
            if (frecuencia[i] > 0) {
                System.out.println((char)i + ": " + frecuencia[i]);
            }
        }
    }
}


