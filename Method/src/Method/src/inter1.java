//extends ; �ڽ� Ŭ�������� �ϳ��� �θ� �ε���.
//implements; �ڽ� Ŭ�������� ���� �θ� �ε� ������.( �������̼� @ ������ ���)
public class inter1 implements ime1,ime2{
	@Override
	public void c1() {
		System.out.println(names);
		System.out.println("interface1");
	}
	@Override
	public void c2(){
		System.out.println("interface2");
	}
	public static void main(String[] args) {

		inter1 it =new inter1();
		it.c1();
		it.c2();
	}

}
