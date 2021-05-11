import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị (USD):");
        int usd = sc.nextInt();
        int vnd = usd * rate / 1000;
        System.out.println("giá trị chuyển đổi thành: "+vnd+ "000 VND");
    }
}
