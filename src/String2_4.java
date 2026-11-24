import java.util.Scanner;
public class String2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chau = sc.nextLine();
        int longutud=chau.length();
        if (longutud>=3){
            if (chau.endsWith("ing")){
                System.out.println(chau.substring(0,longutud-3) + "ly ");
            }else {
                System.out.println(chau+"ing");
            }
        }else {
            System.out.println(chau);
        }
    }
}
