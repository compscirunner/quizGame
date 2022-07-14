package quizGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameApp {

	public static void main(String[] args) {
		 
		
		//File file = new File("questions.txt");
		File file = new File("src/quizGame/questions.txt");
		 try {
			Scanner fileInput = new Scanner(file);
			System.out.println(fileInput.nextLine());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
