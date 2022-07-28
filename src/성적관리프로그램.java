import java.util.Scanner;
public class 성적관리프로그램 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student jikang=new Student();
		jikang.hakbun="2022001";
		jikang.name="jikang";
		jikang.kor=100;
		jikang.eng=89;
		jikang.mat=78;
		jikang.tot=jikang.kor+jikang.eng+jikang.mat;
		jikang.avg=jikang.tot/3.;
		jikang.grade=(jikang.avg>=90&&jikang.avg<=100)?'A':
			(jikang.avg>=80)?'B':
				(jikang.avg>=70)?'C':
					(jikang.avg>=60)?'D':'F';
		int grade=(int)(jikang.avg/10);
		
//		if(jikang.avg>=90&&jikang.avg<=100) {
//			jikang.grade='A';
//		}else if(jikang.grade>=80) {jikang.grade='B';
//		}else if(jikang.grade>=70) {jikang.grade='C';
//		}else if(jikang.grade>=60) {jikang.grade='D';
//		}else {jikang.grade='F';
//		System.out.println("성적은"+jikang.grade+"입니다.");
		
		switch((int)(jikang.grade/10)) {
		case 10 :
		case 9 : jikang.grade='A'; break;
		case 8 : jikang.grade='B'; break;
		case 7 : jikang.grade='C'; break;
		case 6 : jikang.grade='D'; break;
		default : jikang.grade='F'; break;
		}
		System.out.println("성적은"+jikang.grade+"입니다.");
	}
}

//학생의 성적을 구하라., 총점, 평균
//switch에서는 double을 쓸수는 없다.