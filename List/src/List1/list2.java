package List1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/* �ش� ������ �� �� �޸�� �����ʹ� ��� �����ؾ� �մϴ�.
		 * �� ������
		 * ���
		 * �����,������	 */
		
		String user[]={"�����","������","��â��","�ڵ���","�̰���","�����","������"};
		ArrayList<String> ar= new ArrayList<String>(Arrays.asList(user));
		
		int ea=ar.size();
			//System.out.println(ea);
		int w=0;
		while(w<ea) {
			
			int ww=0;
			while(ww<0){
				if(!ar.get(ww).equals("�����") && !ar.get(ww).equals("������")) {
					ar.remove(0);
					//System.out.println(ar);
				}
				ww++;
			}
			w++;
		}
		
		/* ¦���� ���ڸ� ��� �����մϴ�. 
		 ���: 7,1,11,37,41
		 */
		Integer number[]={10,7,6,1,11,37,41,22};
		ArrayList<Integer> ar2 =new ArrayList<Integer>(Arrays.asList(number));
		
		int no =ar2.size();
		int z=0;
		do {
			int no2=ar2.size();
			int zz=0;
			
			do {
				if(ar2.get(zz)%2==0){
					ar2.remove(zz);		
					break;
				}
				zz++;	
			}while(zz<no2);
			z++;
		}while(z<no);
		System.out.println(ar2);
		
		
		
		
		
		
		
		
	}
			
			
	
		

}
