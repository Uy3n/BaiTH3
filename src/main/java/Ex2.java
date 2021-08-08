import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date, month, year;
        System.out.println("Nhap ngay: ");
        date = sc.nextInt();
        System.out.println("Nhap thang: ");
        month = sc.nextInt();
        System.out.println("Nhap nam: ");
        year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
                if (date >= 0 && date <= 31) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date >= 0 && date <= 30) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 2) {
                if (date >= 0 && date <= 29) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            }
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (date >= 0 && date <= 31) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date >= 0 && date <= 30) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 2) {
                if (date >= 0 && date <= 28) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            }
        }
    }
}