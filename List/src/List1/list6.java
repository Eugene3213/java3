package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//문자와 숫자 배열사용
		Scanner sc=new Scanner(System.in);
		ArrayList list =new ArrayList();	
		
			int w =0;
			while(w<5) {
				System.out.println("데이터를 입력해쥇요");
				String user=sc.next();
				list.add(user);
				w++;
			}
			Object a= list.get(1);
			System.out.println(list.size());
			
			//숫자 입력사항만 모두 더함 (실무 코드. Object사용)
			int ww=0;
			int total=0;
			do {
				try {
					Object k =list.get(ww);		//배열자료가 숫자+문자 형태로 구성이 되어 있을 경우는 Object 매개타입으로 설정 합니다.
					int numbers=Integer.parseInt(k.toString());	//해당 매개타입을 문자화하여 parseInt로 다시 재검증함.
					total+=numbers;
				}
				catch(Exception aa){ 			//배열에 매개타입이 숫자가 아닐 경우 ( 예외상황 발생)
					
				}
				ww++;
			}while(ww<list.size());
			
			
			System.out.println("입력한 모든 배열의 합은: " + total + "입니다");
	}

}
