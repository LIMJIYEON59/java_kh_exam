package exception;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {	//사용할 리소스 선언
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
/*<try-with-resources> 
  
   try(A a = new A(); B b = new B()); {		//try문의 괄호 ()안에 리소스를 선언한다.
  		---									  여러개의 리소스 사용 시 ; 으로 구분한다.
   }catch(Exception) {
  		---
   }
 */
