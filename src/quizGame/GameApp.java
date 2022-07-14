package quizGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class GameApp {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	//TODO Add Test user name
	//TODO add date to report
	
	public static void main(String[] args) {
		int count = 1;
		int correctCount = 0;
		String report = ""; 
		Scanner input = new Scanner(System.in);
		//File file = new File("questions.txt");
		File file = new File("src/quizGame/questions.txt");
		 try {
			Scanner fileInput = new Scanner(file);
			while(fileInput.hasNextLine()) {
			
				String[] qA = fileInput.nextLine().split(",");
				String question = qA[0];
				String answer = qA[1].strip();
				String[] answers = Arrays.copyOfRange(qA, 1, qA.length);
				System.out.println(Arrays.toString(answers));
				
			
				System.out.println(count+ ": " + question);
				System.out.print("Enter answer: ");
				String userAnswer = input.nextLine();
				//if((userAnswer.equalsIgnoreCase(answer))) {
				if(Arrays.asList(answers).contains(userAnswer)) {
					report +=  "✅ " + count + ": " + question + "\n" ;
					correctCount++;
				}
				else {
					report +=   "❌ " + count + ": " + question 
							+ " expected: "+ answer + " actual: "
							+ userAnswer +   "\n";
				}
				count++;
			}
			System.out.println("\nResult " + correctCount + "/" + (count - 1) + "   ************");
			System.out.println(report);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
