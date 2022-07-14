package quizGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		//File file = new File("questions.txt");
		File file = new File("src/quizGame/questions.txt");
		 try {
			Scanner fileInput = new Scanner(file);
			while(fileInput.hasNextLine()) {
				
				String[] qA = fileInput.nextLine().split(",");
				String question = qA[0];
				String answer = qA[1].strip();
				System.out.println(question);
				System.out.print("Enter answer: ");
				String userAnswer = input.nextLine();
				if(userAnswer.equalsIgnoreCase(answer)) {
					System.out.println("Great Job");
				}
				else {
					System.out.println("Sorry the correct answer was: "+ answer);
				}
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
