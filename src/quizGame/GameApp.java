package quizGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameApp {

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
				System.out.println(count+ ": " + question);
				System.out.print("Enter answer: ");
				String userAnswer = input.nextLine();
				if(userAnswer.equalsIgnoreCase(answer)) {
					report += "✅ " + count + ": " + question + "\n";
					correctCount++;
				}
				else {
					report += "❌ " + count + ": " + question 
							+ " expected: "+ answer + " actual: "
							+ userAnswer +  "\n";
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
