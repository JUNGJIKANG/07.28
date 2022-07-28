import java.util.Scanner; //ctrl+shift+o

public class SwitchDemo_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("어떤 계절을 좋아하십니까?(spring/summer/fall/winter) : ");
		String season=sc.nextLine();
		
//		System.out.println("삼항연산자");
		String flower=(season.equals("spring"))?"진달래, 개나리":
			(season.equals("summer"))?"장미, 아카시아":
				(season.equals("fall"))?"코스모스, 백합":
					(season.equals("winter"))?"동백, 매화":"잘못 된 입력입니다.";
		System.out.println(flower);
				
		
//		System.out.println("if, if_else문");		
		if(season.equals("spring")) {  //season이 알고있는 번지의 값이 spring과 일치합니까?
		System.out.println("진달래, 개나리");}
		 
		else if(season.equals("summer")){  //season이 알고있는 번지의 값이 summer과 일치합니까?
		System.out.println("장미, 아카시아");}
		
		else if(season.equals("fall")){
		System.out.println("코스모스, 백합");	}
		
		else if(season.equals("winter")){
		System.out.println("동백, 매화");	} //문자열은 ==으로 표시하면 안됨. 문자열을 비교하려면
		
		else {
			System.out.println("잘못된 입력입니다.");	}
		
//		System.out.println("switch문");
		switch(season){
		case "spring":
			System.out.println("진달래, 개나리"); break;
		case "summer":
			System.out.println("장미, 아카시아"); break;
		case "fall":
			System.out.println("코스모스, 백합"); break;
		case "winter":
			System.out.println("동백, 매화"); break;
			default:
			System.out.println("잘못된 값"); break;
		}
	}
}
