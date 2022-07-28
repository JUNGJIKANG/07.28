import java.util.Scanner;
import java.util.GregorianCalendar;
public class Yoonyear {
	public static void main(String[] args, Object year) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 : ");
//		int year=sc.nextInt();
//		if((year%400==0)||(year%4==00 && year%100!=0)){ //400으로 나누면 0이 되는지 입력
//		System.out.println("당신이 입력하신"+year+"는 윤년입니다.");
//		} else {
//		System.out.println("당신이 입력하신"+year+"는 윤년이 아닙니다.");
//		}
		GregorianCalendar gc=new GregorianCalendar();
		boolean flag=gc.isLeapYear​(year);
		System.out.println("당신이 입력하신"+year+"년도는"+((flag)?"윤년입니다.":"윤년이 아닙니다."));
	}
}
// 15번 원인 알아내기