import java.util.Arrays;

public class Method9 {

	public static void main(String[] args) {
		/*
		 class aaa{
		 int a;
		 String b;					---> field
		 
		 	public aaa(){			---> constructor
		 	
		 	}	
		 	public void
		 	public static void
		 	public string abc		---> method				*/
		
		
		
		
		/*HW.
		 �����ڿ��� �޴��� Ȱ��ȭ�ϴ� ���μ����Դϴ�. �ش� �޴� Ȱ��ȭ�� 2�� �迭�̸�, �޴���, Ȱ��ȭ�ϴ� (Y,N)���� ����.
		 �ش簪�� �����Ͽ� "Y"�� ����Ǵ� �ε��� ��ȣ�� �´� �޴����� 1�� �迭�� �籸�� �� ���ο��� ��� �ǵ��� �մϴ�.
		 ��� : [���Ϲ��,����������,���ڽ�,�̺�Ʈ,�߼�]		 
		 ��, private �� return�� Ȱ���Ͽ� ���α׷��� �ۼ��մϴ�.
		 */
		menus mn=new menus();
		System.out.println(Arrays.toString(mn.get()));
	}

}

class menus{
	private String arrays[][];
	private String yn[];
	
	public menus() {
		String ms[][]= {
				{"���Ϲ��","����������","���κ���","���ڽ�","�̺�Ʈ","����","�߼�"},
				{"Y","Y","N","Y","Y","N","Y"}
		};
		this.arrays=ms;
			//System.out.println(arrays.toString(this.arrays[0]));
		sub();
	}
	public void sub() {
		
		int w=0;
		int e=this.arrays[0].length;
		String result[] =new String[5];
		
		
		while(w<e) {
			if(this.arrays[1][w].equals("Y")) {
				
				 result[w]=this.arrays[0][w];
			}
		
			w++;
		}
		this.yn=result;
		//System.out.println(Arrays.toString(result));
	}
	public String[] get() {
		return this.yn;
	}
	
	
}	
		
	
	