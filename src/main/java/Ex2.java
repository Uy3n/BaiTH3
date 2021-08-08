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
        //a
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (date > 0 && date <= 31) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date > 0 && date <= 30) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 2) {
                if (date > 0 && date <= 29) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            }
        } else {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (date > 0 && date <= 31) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (date > 0 && date <= 30) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            } else if (month == 2) {
                if (date > 0 && date <= 28) {
                    System.out.println("Hop le");
                } else {
                    System.out.println("Khong hop le");
                }
            }
        }
        //b
        int dayafter = 0, monthafter = 0, yearafter = 0;
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
            if (date > 0 && date < 31) {
                dayafter = date + 1;
                monthafter = month;
                yearafter = year;
            } else if (date == 31) {
                dayafter = 1;
                monthafter = month + 1;
                yearafter = year;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date > 0 && date < 30) {
                dayafter = date + 1;
                monthafter = month;
                yearafter = year;
            } else if (date == 30) {
                dayafter = 1;
                monthafter = month + 1;
                yearafter = year;
            }
        } else if (month == 12) {
            if (date > 0 && date < 31) {
                dayafter = date + 1;
                monthafter = month;
                yearafter = year;
            } else if (date == 31) {
                dayafter = 1;
                monthafter = month + 1;
                monthafter = year + 1;
            }
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (date > 0 && date < 29) {
                    dayafter = date + 1;
                    monthafter = month;
                    yearafter = year;
                } else if (date == 29) {
                    dayafter = 1;
                    monthafter = month + 1;
                    yearafter = year;
                }
            } else {
                if (date > 0 && date < 28) {
                    dayafter = date + 1;
                    monthafter = month;
                    yearafter = year;
                } else if (date == 28) {
                    dayafter = 1;
                    monthafter = month + 1;
                    yearafter = year;
                }
            }

        }
        //c
        int daybefore = 0, monthbefore = 0, yearbefore = 0;
        if (month == 1) {
            if (date > 1 && date <= 31) {
                daybefore = date - 1;
                monthbefore = month;
                yearbefore = year;
            } else if (date == 1) {
                daybefore = 31;
                monthbefore = 12;
                yearbefore = year - 1;
            }
        } else if (month == 2) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (date > 1 && date <= 29) {
                    daybefore = date - 1;
                    monthbefore = month;
                    yearbefore = year;
                } else if (date == 1) {
                    daybefore = 1;
                    monthbefore = month - 1;
                    yearbefore = year;
                }
            } else {
                if (date > 0 && date < 28) {
                    daybefore = date - 1;
                    monthbefore = month;
                    yearbefore = year;
                } else if (date == 1) {
                    daybefore = 1;
                    monthbefore = month - 1;
                    yearbefore = year;
                }
            }
        } else if (month == 3) {
            if (date > 1 && date <= 31) {
                daybefore = date - 1;
                monthbefore = month;
                yearbefore = year;
            } else if (date == 1) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daybefore = 29;
                    monthbefore = month - 1;
                    yearbefore = year;
                } else {
                    daybefore = 28;
                    monthbefore = month - 1;
                    yearbefore = year;
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (date > 1 && date <= 30) {
                daybefore = date - 1;
                monthbefore = month;
                yearbefore = year;
            } else if (date == 1) {
                daybefore = 31;
                monthbefore = month - 1;
                yearbefore = year;
            }
        } else if (month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (date > 1 && date <= 31) {
                daybefore = date - 1;
                monthbefore = month;
                yearbefore = year;
            } else if (date == 1) {
                if (month == 8) {
                    daybefore = 31;
                    monthbefore = month - 1;
                    yearbefore = year;
                } else {
                    daybefore = 30;
                    monthbefore = month - 1;
                    yearbefore = year;
                }
            }
        }
    }
}