import java.util.Scanner;

public class InSoChanDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        int i = 0;
        do {
            if (i%2==0) {
                System.out.println("Cac so chan la "+i);
            }
            i++;
           } while (i!=num);
    }
}