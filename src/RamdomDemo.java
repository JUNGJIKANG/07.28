//random은 범위안에서의 무작위 숫자가 필요함.
public class RamdomDemo {
	public static void main(String[] args) {
		int rand=(int)(Math.random()*6+1);
		System.out.println(rand); // rand의 min값과 max값을 구해서 정수로 형변환 후 출력, 즉 범위를 주어야함.
		
	}
}
