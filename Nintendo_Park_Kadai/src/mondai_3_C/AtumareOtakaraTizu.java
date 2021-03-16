package mondai_3_C;

import java.util.Scanner;

public class AtumareOtakaraTizu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int dsNum; //Number Of DataSets
		int hNum; //Number Of Heirs
		
		String[] ds;
		String[] answer;
		
		String[] calender = new String[31];
		
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
			
			for(int j = 0 ; j < calender.length ; j++) {
				calender[j] = "";
				for(int k = 0 ; k < ds.length ; k++) {
					if(ds[k].contains(String.valueOf(j))) {
						calender[j] += String.valueOf(k) + " ";
					}
				}
			}
			
			//Start
			answer[i] = atumareOtakaraTizu("", ds, calender, 0);
			
		}
		sc.close();

		//output
		System.out.println("<answer>");
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.printf("SET[%d] : " + answer[i] + "\n", i + 1);
		}

	}
	
	static String atumareOtakaraTizu(String result, String[] ds, String[] calender, int count) {
		
		return result;
	}

}
