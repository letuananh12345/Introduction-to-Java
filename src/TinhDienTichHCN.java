import java.util.Scanner;

public class TinhDienTichHCN {
    public static void main(String[] args) {
        float weight;
        float height;
        System.out.println("enter  Weight: ");
        Scanner wei=new Scanner(System.in);
        weight=wei.nextFloat();
        System.out.println("enter Height");
        Scanner hei=new Scanner(System.in);
        height=hei.nextFloat();
        float area = weight *height;
        System.out.println("area = " + area);
    }
}
