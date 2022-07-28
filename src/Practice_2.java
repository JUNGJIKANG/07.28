import java.util.Scanner;
public class Practice_2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("당신의 출생년도를 입력해 주십시오 : ");
	int year=sc.nextInt();
	
	if(year==1997) { //2월이라면
		if((year%12==0)||(year%4==0&&year%100!=0)) { //윤년이라면
			System.out.println("당신은 소띠 입니다.");
	
	System.out.println("당신의 띠는"+zodiac+"이며,"+"당신의 나이는"+year+"입니다.");
	}
}
// 출생년도를 통하여 띠와 나이를 구하는 문제.