package Ab2;

public interface app_data1 {
	String a=null; 			//�ʵ� �ڷ����� ����ִ� �� ����� ��� ���� �ȵ�.(�� �����ؾ���)
	int b=0;
	
	public void user_join();	//���� ������ �޼ҵ�� this ������.
	default void aaa() {		//default���� this����� ������.(���� �����Ǿ� �ִ� ���)
		System.out.println(this.a);
	}
}
