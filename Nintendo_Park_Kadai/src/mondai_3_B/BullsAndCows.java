package mondai_3_B;

import java.util.Scanner;

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
		}
		sc.close();


	}

}
