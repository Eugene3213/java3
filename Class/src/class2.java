
public class class2 {

	public static void main(String[] args) {
		/*
		 ���� Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�.
		 ��Ŭ������ �ΰ����� �ֽ��ϴ�
		 �θ� Ŭ������ : mother
		 �ڽ� Ŭ������ : child
		 ���� Ŭ�������� mother Ŭ������ ���� ���� ����
		 30 50
		 child���� ���� Ŭ�������� �ִ� ���� �޾� �ΰ��� ���ڸ� ���� ������� ����Ͻÿ�.		 */
		

		mother m=new mother();
			m.m_th(30,50);
		mother.child  z= m.new  child();
		z.c_th();
	
	}

}
class mother{
	int aa,bb;
	
	public void m_th(int a, int b){
			this.aa=a;
			this.bb=b;
	}
	class child{
		int aa=mother.this.aa;
		int bb= mother.this.bb;
		public void c_th() {
			int cc=aa*bb;
			System.out.println(cc);
		}
			
			
		
	}
}