package Ab2;
import Ab.method_1;	//pakage Ab���� main class�� �ε���

public class ab2_method {
	public static void main(String[] args) {
		//@Override
		Ab.method_1 at=new Ab.method_1();
		at.recall();	//public �޼ҵ� ����
		at.main(args);	//main �޼ҵ� ����
		at.name();		//protected �޼ҵ� ����
	}

}
