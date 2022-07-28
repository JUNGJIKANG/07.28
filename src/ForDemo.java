
public class ForDemo {
	public static void main(String[] args) {
		for(int su=1; su<=10; su++) {
			System.out.print(su+"\t"); //\t은 tap으로 반복한다는 의미
		}
		System.out.println("\n");
		for(int su=10; su>0; su--) {
			System.out.print(su+"\t");
		}
		System.out.println("\n");
		for(int i=1; i<=20; i++) { //i를 반복변수로 사용함
			if(i%3==0) { //3배수이기 때문에 3을 나눠서 0이 나오도록 계산해야함.
				System.out.print(i+"\t");
			}
		}
		System.out.println("\n");
		int count=0; //한 줄에 표시할 숫자에 대한 변수를 주기 위한 선언
		for(int i=20; i<=180; i++) { //배수를 선언하기 위해
			if(i%7==0) { //7의 배수 설정
				System.out.print(i+"\t"); //7의 배수를 한 줄에 표시
				count++; //한 줄 표시 더하기
				if(count%5==0) { //한 줄에 5개 될 때 까지 나누기
					System.out.println(); //5개 되면 줄 바꿈 출력
				}
		}
	}
}
}