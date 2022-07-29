import java.util.Scanner;
public class 연습문제_2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("당신의 체중을 입력해 주십시오 :");
		double weight=sc.nextInt();
		System.out.println("당신의 신장을 입력해 주십시오 :");
		double height=sc.nextInt();		
		System.out.println("체중은 : "+weight+"kg입니다."+"신장은:"+(height*height)+"cm 입니다.");
		height *= 0.01;
		
		
//		if()
//		
//		
//		switch(bmi) {
//		case 1 : System.out.println("고도비만"); break;
//		case 2 : System.out.println("중도비만"); break;
//		case 3 : System.out.println("경도비만"); break;
//		case 4 : System.out.println("과체중"); break;
//		case 5 : System.out.println("정상"); break;
//		default : System.out.println("저체중"); break;
//		}
//		System.out.println("당신의 BMI지수는"+bmi+"입니다.");
	}
}
//체중과 신장을 입력받아 BMI지수를 구하는 프로그램을 만드시오
//BMI=체중/신장제곱
//신장은 m단위임 *10해야할 듯
//고도비만 35이상
//중도비만(2단계 비만) 30 -34.9
//경도비만(1단계 비만) 25-29.9
//과체중 23 -24.9
//정상 18.5-22.9
//저체중 18.5미만