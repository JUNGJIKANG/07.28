import java.util.Scanner;
public class OpDemo {
	public static void main(String[] args) {
		//나머지 연산자
//		System.out.println(5/2); //정수 계산이기 때문에 답도 정수 즉, 답은 2
//		System.out.println(5%2); //5를2로 나누고 남은 나머지를 계산
		
		//이동연산자
//		System.out.println(32767<<5); 답은 1048544, 32767*2의5승, 곱하기의 개념
//		System.out.println(32767>>5); 답은 1023, 32767/2의5승, 나누기의 개념
//		System.out.println(-32767>>5); 답은 -1024, -32767/2의5승, 나누기의 개념
//		System.out.println(-32767>>>5); 답은 134216704, unsignde형
		
		//관계연산자(참과 거짓을 표현)
		//&연산은 둘 다 참일 때만 참(직렬), |연산은 참만 있으면 참(병렬), ^연산은 같으면 거짓, 다르면 참
//		System.out.println(true&&false);
//		int a=5; int b=10; int x=15;
//		if(a>x&&++b<x);{ 
//		//&& 앞이 거짓인데 왜 오른쪽을 계산하나요?, &는 오른쪽도 계산할까요?
//		//|이랑 ||도 같은 내용.
//			System.out.println("참");
//		} else { 
//			System.out.println("거짓");
//		}
//		System.out.println("b="+b);
//		if(4>5);{
//			System.out.println("참");
//		}else {
//			System.out.println("거짓");
//		}
		//삼항연산자
//		System.out.println((4>5)?"참":"거짓" );
		
		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 한개를 입력하세요 :");
//		int su=sc.nextInt();
//		if(su% 2==0) System.out.println("짝수이군요.");
//		else System.out.println("홀수이군요.");
//		
//		System.out.println((su%2==0)?"짝수이군요":"홀수이군요");
		
//		System.out.println("연도를 입력하세요 : ");
//		int year=sc.nextInt();
//		if((year%400==0)||(year%4==00 && year%100!=0)){ //400으로 나누면 0이 되는지 입력
//		System.out.println("당신이 입력하신"+year+"는 윤년입니다.");
//	} else {
//		System.out.println("당신이 입력하신"+year+"는 윤년이 아닙니다.");
//		System.out.println((su%100==0)?"윤년입니다.":"윤년이 아닙니다."); 내가 여기까지 했음.
//		}
		
//	System.out.println("당신이 입력하신"+year+"는");
//	System.out.println((year%400==0)||(year%4==0&&year&&year%100!=0)?"윤년입니다.":"윤년이 아닙니다.");	
		
	
	//할당연산자(오른쪽에서 왼쪽으로)
//	int age=26;
//	age++; //1씩 증가할 때, age=age+1 더해서 다시 대입하라는 의미.
//	age=age+5;
//	//복합연산자
//	age+=5; //5씩 증가하는 계산

//	int a=5, b=10, x=15;
	
	double year =(true)?2022:3.14;
	}
}
