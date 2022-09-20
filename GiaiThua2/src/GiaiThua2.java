import java.util.Scanner;

public class GiaiThua2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        int giaithua = 1;
        for (int i=1; i<=num;i++) {
            giaithua=giaithua*i;
        }
        System.out.println("Giai thua cua so "+num+"la :"+giaithua);
    }
}
//  4!= 4.3.2.1 i =1 => 4! = i.(i+1).(i+2).(i+3)
