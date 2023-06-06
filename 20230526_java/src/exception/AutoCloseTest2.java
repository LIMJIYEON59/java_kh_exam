package exception;

public class AutoCloseTest2 {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()) {
			throw new Exception();		//강제로 예외 발생(catch문 수행시키도록함)		
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}

}