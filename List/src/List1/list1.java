package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list1 {

	public static void main(String[] args) {

		//add(�߰�), get(�����ͷε�), remove(����), size(index ����) : ArrayList��� util �޼ҵ忡�� ���
		//Arrays.asList :  �ε��� �迭 ������ ����
		//�߿�: add�� �Ϲ������� ������ �� �ڿ� �����Ͱ� �߰���. ��, index��ȣ�� ���� �� ���� �����ϸ� �ش� index�κп� �߰���.
		String member[]= {"�̼���","ȫ�浿","������","������"};
		ArrayList<String> mb =new ArrayList<>(Arrays.asList(member));
			//System.out.println(mb);

			int ea=mb.size();
			//System.out.println(ea);
			
			mb.add("������");
			//System.out.println(mb);
			
			mb.remove(1);
			//System.out.println(mb);
	
			mb.add(3,"�������");
			//System.out.println(mb);
		
			String checks=mb.get(2);
			System.out.println(checks);
			
			//ArrayList���� int�� ������� ���� (Integer) ����
			/* ������ �Դϴ�. �ش� �����͸� Ŀ�����Ͽ� ���� ���ó�� �x���Ͻÿ�. 
			 * [7,15,22,8,11,39,41]				*/
			Integer numbers[]= {15,22,37,8,11,19,41};
			
			ArrayList<Integer> it = new ArrayList<Integer>(Arrays.asList(numbers));
			
			it.add(0,7);
			it.remove(3);
			it.remove(5);
			it.add(5,39);
			System.out.println(it);
			
			
			
			
	}

}
