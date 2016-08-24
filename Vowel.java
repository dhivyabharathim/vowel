import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		String a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value:");
		a=s.nextLine();
		switch(a){
		case "a":
			System.out.println("vowel");
			break;
		case "e":
			System.out.println("vowel");
			break;
		case "i":
			System.out.println("vowel");
			break;
		case "o":
			System.out.println("vowel");
			break;
		case "u":
			System.out.println("vowel");
			break;
		case "s":
			System.out.println("consonant");
			break;
			default:
				System.out.println("neither vowel or consonant");
		}
		

	}

}
