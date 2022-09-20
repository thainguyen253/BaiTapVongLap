import java.util.Scanner;

public class InSoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        for (int i =0;i<=num;i++){
            if (i%2==0) {
                System.out.println("Cac so chan la "+i);
            }
        }
    }
}