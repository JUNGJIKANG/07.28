import java.util.Scanner;
public class IfDemo {
	public static void main(String[] args) {
//		int score=59;
//		if(score>=60) { //조건이 "참"일 경우
//			System.out.println("축하합니다. 최종합격입니다.");
//		}else { //조건이 "거짓"일 경우  
//			System.out.println("불합격입니다.");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("어떤 계절을 좋아하십니까?(spring/summer/fall/winter) : ");
		String seaeon=sc.nextLine();
		
		if(seaeon.equals("spring")) {  //season이 알고있는 번지의 값이 spring과 일치합니까?
		System.out.println("진달래, 개나리");}
		 
		else if(seaeon.equals("summer")){  //season이 알고있는 번지의 값이 summer과 일치합니까?
		System.out.println("장미, 아카시아");}
		
		else if(seaeon.equals("fall")){
		System.out.println("코스모스, 백합");	}
		
		else if(seaeon.equals("winter ")){
		System.out.println("동백, 매화");	} //문자열은 ==으로 표시하면 안됨. 문자열을 비교하려면
		
		else {
			System.out.println("잘못된 입력입니다.");	}
}
}
