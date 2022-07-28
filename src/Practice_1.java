import java.util.Scanner;
import java.util.GregorianCalendar;
public class Practice_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year=sc.nextInt();

		System.out.print("월을 입력하세요 : ");
		int month=sc.nextInt();

		if (month==("1월")) {
			System.out.println("1월");
		}
			System.out.println("당신이 입력한 연도는"+year+"이며,"+"당신이 입력한 월은"+month+"입니다.");
	}
}
