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
			
			if(result.size() == 1) {
				answer[i] = result.get(0);
			}else {
				answer[i] = "None";
			}
		}
		sc.close();

		System.out.println("<answer>");
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.printf("SET[%d] : " + answer[i] + "\n", i + 1);
		}

	}
	
	static ArrayList<String> bullsAndCows(ArrayList<String> result, String[] ds, int qNum) {
		
		String[] question = ds[qNum - 1].split(" ");
		//int bull = 0; //Integer.parseInt(question[1])
		//int cow = 0; //Integer.parseInt(question[2])

		if(qNum > 1) {
			result = bullsAndCows(result, ds, qNum - 1);
		}else {
			for(int i = 0 ; i < 10 ; i++) {
				String tmp1 = String.valueOf(i);
				for(int j = 0 ; j < 10 ; j++) {
					String tmp2 = tmp1;
					if(tmp2.contains(String.valueOf(j))) {
						continue;
					}else {
						tmp2 += String.valueOf(j);
					}
					for(int k = 0 ; k < 10 ; k++) {
						String tmp3 = tmp2;
						if(tmp3.contains(String.valueOf(k))) {
							continue;
						}else {
							tmp3 += String.valueOf(k);
						}
						for(int l = 0 ; l < 10 ; l++) {
							String tmp4 = tmp3;
							if(tmp4.contains(String.valueOf(l))) {
								continue;
							}else {
								tmp4 += String.valueOf(l);
								result.add(tmp4);
							}
						}
					}
				}
			}
		}
		
		//data check
		System.out.println("BEFORE");
		System.out.println("question[0] : " + question[0]);
		System.out.println("result.size : " + result.size());
		System.out.println(qNum);
		
		if(result.size() >= 1) { //If 'result' has data, filter the data.
			for(int i = 0 ; i < result.size() ; i++) { //check
				
				int bull = 0; //Integer.parseInt(question[1])
				int cow = 0; //Integer.parseInt(question[2])
				
				for(int j = 0 ; j < 4 ; j++) {
					if(result.get(i).contains(String.valueOf(question[0].charAt(j)))) { //cow? bull?
						if(result.get(i).charAt(j) == question[0].charAt(j)) { //bull
							bull++;
						}else { //cow
							cow++;
						}
					}
				}
				if(!(bull == Integer.parseInt(question[1]) && cow == Integer.parseInt(question[2]))) { //filtering
					result.remove(i);
					i--;
				}else {
					System.out.println(result.get(i) + " : " + question[0] + " bull = " + bull + " cow = " + cow);
				}
			}
		}
		
		//data check
		System.out.println("AFTER");
		System.out.println("question[0] : " + question[0]);
		System.out.println("result.size : " + result.size());
		System.out.println(qNum);
		
		return result;
	}

}
