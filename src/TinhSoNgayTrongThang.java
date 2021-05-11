import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng cần đếm ngày ? ");
        int month = scanner.nextInt();

        String NgayTrongThang;
        switch (month) {
            case 2:
                NgayTrongThang = "28 or 29";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                NgayTrongThang = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                NgayTrongThang = "30";
                break;
            default:
               NgayTrongThang = "";
        }

        if (NgayTrongThang != "") {
            System.out.printf("The month '%d' has %s days!", month, NgayTrongThang);
        }
        else {
            System.out.print("Invalid input!");
        }

    }
}
