package mondai_3_A;

public class KuniwoMamoreMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input
		int dsNum = 2;
		String[][] ds = {{"3", "3 2 4 6 2 4 1 5 3 5"}, 
						 {"5", "7 4 3 4 6 4 12 3 9 9 2 4 3 7 9 10 2 1 4 12"}};
		
		int numECD = 5; //the number of enemies that can be defeated
		
		String[][] answer = new String[dsNum][2];
		int numFE = 0; //the number of fallen enemies
		
		//Start Battle
		for(int i = 0 ; i < dsNum ; i++) {
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
			
			System.out.println(flgVD + " " + numFE);
		}

	}

}
