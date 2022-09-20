import java.util.Scanner;

public class GiaiThuaWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        int giaithua = 1;
        int i=1;
        while (i<=num) {
            giaithua=giaithua*i;
           i++;
        }
        System.out.println("Giai thua cua so "+num+"la :"+giaithua);
    }
}