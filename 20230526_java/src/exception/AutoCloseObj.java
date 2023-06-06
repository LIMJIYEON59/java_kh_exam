package exception;

public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {			//close() 메서드 구현
		System.out.println("리소스가 close() 되었습니다");
		
	}
	
}
//AutoCloseable 인터페이스는 반드시 'close()' 메서드를 구현해야 한다.
