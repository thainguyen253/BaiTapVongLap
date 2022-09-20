import java.util.Scanner;

public class InSoNguyenTo {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap mot so");
        int num = sc.nextInt();
        if (num<0) {
            System.out.println("So "+num+"la so am");
        }
        boolean laSoNguyenTo=true;
        if (num>-1){
            for (int i=2;i*i<num;i++)
            if (num%2==0){
                laSoNguyenTo=false;
            }
        }
        if (laSoNguyenTo){
            System.out.println("So "+num+"la so nguyen to");
        } else {
            System.out.println("So "+num+"khong phai la so nguyen to");
        }
    }
}
