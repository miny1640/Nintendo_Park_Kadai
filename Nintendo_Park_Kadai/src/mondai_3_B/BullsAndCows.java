package mondai_3_B;

import java.util.Scanner;
import java.util.*;

public class BullsAndCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int dsNum; //Number Of DataSets
		int qNum; //Number Of Questions
		
		String[] ds;
		String[] answer;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of sets. (1 <= N <= 100)");
		dsNum = sc.nextInt();
		
		while(dsNum < 1 || dsNum > 100) { //1 <= dsNum <= 100
			System.out.println("Please enter the number of sets again. (1 <= N <= 100)");
			dsNum = sc.nextInt();
		}
		
		answer = new String[dsNum];
		
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.println("Please enter the number of questions. (1 <= N <= 10)");
			qNum = sc.nextInt();
			
			while(qNum < 1 || qNum > 10) { //1 <= qNum <= 10
				System.out.println("Please enter the number of questions again. (1 <= N <= 10)");
				qNum = sc.nextInt();
			}
			
			ds = new String[qNum];
			sc.nextLine();
			
			for(int j = 0 ; j < qNum ; j++) {
				System.out.println("Please enter the <Question>,<Bulls>,<Cows>.");
				//sc.nextLine();
				ds[j] = sc.nextLine();
			}
			
			//Bulls & Cows Start
			ArrayList<String> result = new ArrayList<String>();
			result = bullsAndCows(result, ds, qNum);
			
			answer[i] = String.valueOf(i);
		}
		sc.close();

		System.out.println("<answer>");
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.printf("SET[%d] : " + answer[i] + "\n", i + 1);
		}

	}
	
	static ArrayList<String> bullsAndCows(ArrayList<String> result, String[] ds, int qNum) {
		if(qNum > 1) {
			result = bullsAndCows(result, ds, qNum - 1);
		}
		
		String[] question = ds[qNum - 1].split(" ");
		int bull = 0; //Integer.parseInt(question[1])
		int cow = 0; //Integer.parseInt(question[2])
		
		if(result.size() > 1) {
			for(int i = 0 ; i < result.size() ; i++) {
				result.get(i);
			}
		}else {
			
		}
		
		//data check
		System.out.println("question[0] : " + question[0]);
		System.out.println("result.size : " + result.size());
		System.out.println(qNum);
		
		return result;
	}

}
