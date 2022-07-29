import java.util.Scanner;
public class 연습문제_2_답안 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Client jikang=new Client();
		System.out.print("당신의 이름을 입력하세요 : ");
		jikang.name=sc.nextLine();
		System.out.print("당신의 나이를 입력하세요 : ");
		jikang.age=sc.nextInt();
		sc.nextLine(); //숫자 뒤 글자를 받을 경우 오류가 나기 때문에 작성해줘야함. int는 enter을 받지 못하기 때문.
		System.out.print("당신의 성별을 입력하세요(남성:m / 여성:f) : ");
		String gender=sc.nextLine(); //char은 Scanner하지않음.
		jikang.gender=gender.charAt(0); //0번째 글자를 받아주세요 라는 의미입니다.
		System.out.print("당신의 몸무게를 입력하세요 : ");
		jikang.weight=sc.nextDouble();
		System.out.print("당신의 신장을 입력하세요 : ");
		jikang.height=sc.nextDouble();		
		
		double bmi=jikang.weight/((jikang.height*0.01)*(jikang.height*0.01));

		jikang.bmi=bmi; //고객의 bmi를 할당.
		if(bmi >=35)jikang.result="고도비만";
		else if(bmi>=30&&bmi<35)jikang.result="중도비만(2단계 비만)";
		else if(bmi>=25&&bmi<30)jikang.result="경도비만(1단계 비만)";
		else if(bmi>=23&&bmi<25)jikang.result="과체중";
		else if(bmi>=18.5&&bmi<23)jikang.result="정상";
		else if(bmi<18.5)jikang.result="저체중";
		
		System.out.println("<<검진결과>>");
		System.out.println("이름 : "+jikang.name);
		System.out.println("나이 : "+jikang.age);
		System.out.println((jikang.gender=='m')?"남성":"여성");
		System.out.println("BMI 지수는 : "+jikang.bmi);
		System.out.println("BMI : "+jikang.result);
		System.out.println("Good Bye");
		
//		double bmi=(jikang.weihgt/(jikang.height*jikang.height))/100; //백분율화 해야해서 이 방법은 잘못됐음.
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