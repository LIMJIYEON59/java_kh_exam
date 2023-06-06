package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	//아이디에 대한 제약 조건[setUserID()가 구현] 이 제약조건이 지켜지지 않으면 예외발생! 예외 클래스를 직접 생성해야함
	public void setUserID(String userID) throws IDFormatException { //IDF 예외를 set 메서드가 호출될 때 처리하도록 미룸
		if(userID == null) {										
			throw new IDFormatException("아이디는 null일 수 없습니다");		//throw---- 강제로 예외를 발생시킴
		}
		else if(userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요");	//throw---- 강제로 예외를 발생시킴 
		}
		this.userID = userID;
	}
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		//ID값이 null인 경우
		String userID = null;					//예외 상황을 만들기 위해 아이디 값에 null을 대입함 
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {			//미룬 예외가 여기 catch에서 실행된다
			System.out.println(e.getMessage());
		}
		//아이디 값이 8자 이하인 경우
		userID = "1234567";						//아이디가 8자 이하인 예외를 확인하기 위해 아이디에 7자리를 대입함
		try {
			test.setUserID(userID);
		}catch (IDFormatException e) {			//미룬 예외가 여기서 처리됨
			System.out.println(e.getMessage());
		}
	}
}
/*
 <결과>
 아이디는 null일 수 없습니다
 아이디는 8자 이상 20자 이하로 쓰세요 
*/










