import java.util.Scanner;
public class 연습문제_1 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	
//	int munja=sc.nextInt();
//	char ch=munja.charAt();
	
	int count=0;
	
	for(int munja=65; munja<=90; munja++) {
		int a = count / 5;
		if(a%2==0) {
			System.out.printf("%c\t", munja);
			}
		else {
			System.out.printf("%c\t", munja+32);
			}
		count++;
		if(count%5==0) {
			System.out.println();
		}
	}
	}
}
//대문자 A(65), 소문자a(97), 
//  tip_대,소문자의 차이는?, 32를 더해야함. 짝수줄은 그냥 찍고 홀수줄은 더하기 32
//아스키코드 변환값을 확인