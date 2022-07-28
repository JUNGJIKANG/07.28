import java.util.Scanner;
public class RandomPractice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rand=(int)(Math.random()*10+1);
//				
//				if(rand==1) { 
//					System.out.println("1:Bananas");
//				}else if(rand==2){
//					System.out.print("Oranges");
//				}
				switch(rand) {
				case 1 : System.out.println("Bananas"); break;
				case 2 : System.out.println("Orages"); break;
				case 3 : System.out.println("Peach"); 
				case 4 : System.out.println("Apples"); 
				case 5 : System.out.println("Plums"); break;
				case 6 : System.out.println("Pineapples"); break;
				case 7 : break;
				default : System.out.println("Nuts"); break;}
				System.out.println("rand="+rand);
//				case 8 :
//					System.out.println("Nuts"); break;
//				case 9 :
//					System.out.println("Nuts"); break;
//				case 10 :
//					System.out.println("Nuts"); break;
				}
				
	}


