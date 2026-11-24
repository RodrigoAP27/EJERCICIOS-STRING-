import java.util.Scanner;

public class String2_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String palabras=sc.nextLine();
        int numero=palabras.length();
        if (palabras.length()>=2){
            System.out.println(""+palabras.charAt(0)+palabras.charAt(1)+palabras.charAt(numero-2)+
                    palabras.charAt(numero-1));

        }else {
            System.out.println("cadena buida");
        }
    }
}