package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.txt");
		}catch (FileNotFoundException e) {
			System.out.println(e);
		}
		System.out.println("여기도 수행됩니다.");
	}

}
/* 예외 처리를 한다고 해서 프로그램의 예외 상황 자체를 막을 수는 없습니다. 
   하지만 예외처리를 하면 예외 상황을 알려 주는 메시지를 볼 수 있고,
   프로그램이 비정상 종료되지 않고 계속 수행되도록 만들 수 있습니다.*/
