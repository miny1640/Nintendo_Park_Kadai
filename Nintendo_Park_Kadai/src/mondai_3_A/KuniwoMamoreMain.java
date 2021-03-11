package mondai_3_A;

import java.util.Scanner;

public class KuniwoMamoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int dsNum;
		String[][] ds;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of sets.");
		dsNum = sc.nextInt();
		
		ds = new String[dsNum][2];
		
		for(int i = 0 ; i < dsNum ; i++) {
			System.out.println("Please enter the number of times the skill can be used.");
			ds[i][0] = sc.next();
			System.out.println("Enter enemy groups and their number of people.");
			sc.nextLine();
			ds[i][1] = sc.nextLine();
		}
		sc.close();
		
		int numECD = 5; //the number of enemies that can be defeated
		
		String[][] answer = new String[dsNum][2];
		
		//Start Battle
		for(int i = 0 ; i < dsNum ; i++) {
			int numFE = 0; //the number of fallen enemies
			int numSkill = Integer.parseInt(ds[i][0]);
			String[] numEnemy = ds[i][1].split(" ");
			boolean flgVD = true; // Victory(=true) or Defeat(=false) FLG
			
			for(int j = 0 ; j < numEnemy.length ; j++) {
				int numEmy = Integer.parseInt(numEnemy[j]); //number of enemies
				
				if(numEmy <= numECD) {
					numFE += numEmy;
				}else {
					if(numSkill == 0) {
						flgVD = false;
						break;
					}
					numSkill -= 1;
					numFE += numEmy;
				}
			}
			answer[i][0] = String.valueOf(flgVD);
			answer[i][1] = String.valueOf(numFE);
			
			System.out.printf("Battle[%d] : " + answer[i][0] + " " + answer[i][1] + "\n", i + 1);
		}

	}

}
