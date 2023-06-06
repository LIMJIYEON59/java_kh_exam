package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;

	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			e.printStackTrace();	// e.prin---추가
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {		//Exception 클래스로 그 외 예외 상황 처리(모든 예외 상황을 처리하고자)
			e.printStackTrace();	//Exception 클래스를 기본(default) 예외 처리라고도 한다.
		}
	}

}
/*
   위에 loadClass() 메서드는 FileInputStream을 열고 Class를 동적으로 로딩하여 반환한다. 
   파일을 열 때 FileNotFoundException 발생할 수 있고
   클래스를 로딩 할 떄 ClassNotFoundException 발생할 수 있다.
   그러나 7행을 보면 throws 때문에 이 예외처리를 미루게된다. 
   15행 메인 함수를 보면 loadClass() 메서드를 호출하는 부분이 있다.
 */

/*
   <오류 해결 방법> 
   -Add throws declaration = main 부분에 FNFE와 CNFE를 추가하고 예외처리를 미룬다. 
   -Surround with try/multi-catch =여러 예외를 한번에 처리하기 
   -Surround with try/catch = 예외 상황마다 각각 처리하기
 */


/* Exception을 활용한 catch 블록을 사용할 경우!! 맨 밑에서 사용해야한다.
   왜냐하면  예외는 catch문을 선언한 순서대로 검사한다.
   그래서 Exception을 맨 위에 쓰면 모든 예외들은 Exception 상위클래스로 자동 형 변환이 되어서 오류가 발생된다.
*/


