package EstruturaSequencial_Exercicio_13;
import java.util.Scanner;

public class PesoHomemMulher {
    public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Me diga sua altura:");
		String answerOneInput = userInput.nextLine();
		System.out.println("Você é homem ou mulher?");
		String answerTwoInput = userInput.nextLine();
		if(answerTwoInput.toLowerCase().contains("h")) {
			System.out.println(((int)(72.7*Double.parseDouble(answerOneInput)) - 58)+"kg");
		} else if(answerTwoInput.toLowerCase().contains("m")) {
			System.out.println(((int)(62.1*Double.parseDouble(answerOneInput)) - 44.7)+"kg");
		} 
		userInput.close();
		System.exit(0);
	}	
}
