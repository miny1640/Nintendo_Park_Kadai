package mondai_3_C;

import java.util.ArrayList;
import java.util.Scanner;

public class AtumareOtakaraTizu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int dsNum; //Number Of DataSets
		int hNum; //Number Of Heirs
		
		String[] ds;
		String[] answer;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of sets.");
		dsNum = sc.nextInt();
		
		answer = new String[dsNum];
		
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.println("Please enter the number of heir. (1 <= N <= 50)");
			hNum = sc.nextInt();
			
			while(hNum < 1 || hNum > 50) { //1 <= hNum <= 50
				System.out.println("Please enter the number of heir again. (1 <= N <= 50)");
				hNum = sc.nextInt();
			}
			
			ds = new String[hNum];
			sc.nextLine();
			
			for(int j = 0 ; j < hNum ; j++) {
				System.out.println("Please enter a schedule for the heir.");
				ds[j] = sc.nextLine();
			}
			
			//Start
		}
		sc.close();

		//output
		System.out.println("<answer>");
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.printf("SET[%d] : " + answer[i] + "\n", i + 1);
		}

	}

}
