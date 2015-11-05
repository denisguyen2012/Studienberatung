import java.util.*;
public class Studienberatung{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String antwort = scanner.next();
		if (antwort.equals("n")){
			System.out.println("Hast du Fachabitur?");
			String answerFachabitur = scanner.next();
			String answer = scanner.next();
		}
		if (antwort.equals("j")){
			System.out.println("Bist du wissbegierig?");
			String answerWissbegierig = scanner.next();
		}
	}
}