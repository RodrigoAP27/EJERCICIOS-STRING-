import java.util.Scanner;

public class String2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] palabras=new String[3];
        for (int i=0;i<palabras.length;i++){
            palabras[i]= sc.nextLine();
        }
        int mayor=0;
        String larga="";
        for (int i=0;i<palabras.length;i++){
            if (palabras[i].length()>mayor){
                mayor=palabras[i].length();
                larga=palabras[i];

            }
        }
        System.out.println(larga);
        System.out.println(mayor);


    }
}
