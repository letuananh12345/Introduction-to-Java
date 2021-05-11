import java.util.Scanner;

public class TestNamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isNamNhuan = false;

        System.out.println("Nhập vào năm cần kiểm tra: ");
        year = scanner.nextInt();

        boolean isNamChiaHetCho4= year % 4 == 0;
        if(isNamChiaHetCho4){
            boolean isDivisibleBy100 = year % 100 == 0;
            if(isDivisibleBy100){
                boolean isDivisibleBy400 = year % 400 == 0;
                if(isDivisibleBy400){
                    isNamNhuan = true;
                }
            } else {
                isNamNhuan = true;
            }
        }

        if(isNamNhuan){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
