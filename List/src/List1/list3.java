package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/* �ѹ�������1  3,6,9,12,15
		 * �ѹ�������2  2,4
		 * 
		 * ��� 3,6,9,12,15,2,4		 */
		
		
		//Arrays.sort : �迭���� ���¿��� ����
		Integer a[]= {3,6,9,12,15};
		Integer b[]= {2,4};
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(b));
		ArrayList<Integer> ar2=new ArrayList<Integer>(Arrays.asList(a));
		int ea=ar.size();
		int w=0;
		
		while(w<ea) {
			
			ar2.add(ar.get(w));
			
			w++;
		}
		System.out.println(ar2);
		
		Collections.sort(ar2);		//ArrayList, LinkedList sort �������� ����
		System.out.println(ar2);
		
		int ea2=ar2.size();
		System.out.println(ea2);
	}

}
