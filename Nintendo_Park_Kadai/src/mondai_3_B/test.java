package mondai_3_B;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
							System.out.println(tmp4);
						}
					}
				}
			}
		}

	}

}
