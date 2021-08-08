import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args){
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap nam: ");
        year = sc.nextInt();
        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Nam nhuan");

        } else {
            System.out.println("Nam khong nhuan");
        }
    }
}
