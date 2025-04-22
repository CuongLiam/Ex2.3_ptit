import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập tháng: ");
        int months = scanner.nextInt();

        if(months < 0 || months > 13){
            System.out.println("Tháng không hợp lệ");
            return;
        }

        if (months == 2){
            System.out.printf("Tháng %d có 28 ngày", months);
        }

        if(months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12){
            System.out.printf("tháng %d có 31 ngày", months);
        }

        if(months == 4 || months == 6 || months == 9 || months == 11){
            System.out.printf("tháng %d có 30 ngày", months);
        }
    }
}