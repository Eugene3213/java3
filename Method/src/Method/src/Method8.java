
public class Method8 {

	public static void main(String[] args) {
		

		/*q.���� ���α׷��Ӱ� �ش� DB�� �� �� Ȧ������ ���� �� ������ �ް��� �մϴ�.
		 �ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.		 */
	
	odbc db =new odbc();
		System.out.println(db.nb2());
	
	
	}

}
class odbc{
	private int number[];			//�迭���� ������� �ʵ��� ���
	private int ct=0;				//Ȧ���� ��� +1�� �����ϱ� ���� �ʵ� ������
	
	public odbc() {
		int odata[]= {15,22,17,14,32,35,19,33};
		this.number=odata;
	}
	
	public int nb2(){
		int w=0;
		int e=this.number.length;
		//int ct=0;
		
		while(w<e) {
			if(this.number[w]%2==1) {
				this.ct++;			//Ȧ���̸� +1�� ����
			}
		w++;	
		}
		return this.ct;			//�������� return��Ŵ
		
	}
		
		
	
}
