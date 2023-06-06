package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling3  {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("a.txt");

		} catch (FileNotFoundException e) { // 입력받은 파일이 없어 try-catch문을 사용해 FNFE에 예외처리함
			System.out.println(e);
			return; // return문과는 상관없이 finally "항상 수행됩니다"가 출력됨
		} finally { // 리소스를 닫는 코드를 구현
			if (fis != null) {
				try {
					fis.close(); // 예외가 발생할 수 있으므로 예외처리 해야함
				} catch (IOException e) {
					// TODO
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다");
		}
		System.out.println("여기도 수행됩니다.");
	}
}

/* <try-catch-finally문>
	
	try {
		예외가 발생할 수 있는 부분
	}catch(처리할 예외타입 e) {
		예외를 처리하는 부분
	}finally{
		항상 수행되는 부분
	}
*/
