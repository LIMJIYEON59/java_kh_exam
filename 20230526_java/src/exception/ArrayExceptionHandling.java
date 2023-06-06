package exception;	

public class ArrayExceptionHandling {
	public static void main(String[] args) {
		int[] arr = new int[5];
		//try-catch문 
		try {	//예외가 발생할 수 있는 코드 부분
			for(int i=0; i <=5; i++) {
				arr[i] =i;
				System.out.println(i);
			}
		}catch(ArrayIndexOutOfBoundsException e) {	//(예외를 처리할 예외 타입)
			System.out.println(e);					//try 블록 안에서 예외가 발생했을 때 예외처리 부분
			System.out.println("예외 처리 부분");
		}
		System.out.println("프로그램 종료");
		
	}
}
/* <try-catch문 코드>
  	try{
  		예외가 발생할 수 있는 코드 부분
  	}catch(처리할 예외 타입e)
  		try 블록 안에서 예외가 발생했을 떄 예외를 처리하는 부분
  	}
 */

/*즉 예외가 발생할 수 있으므로 try 블록에 작성한다.
 그리고 예외가 발생하면 catch 블록이 수행된다. 
 catch문의 괄호()안에 쓰는 예외 타입은 상황에 따라 달라진다.*/

/*예외처리를 하는 이유: 프로그래머가 직접 예외처리를 하지않으면 예외가 잡히지 않아서 프로그램이 갑자기 멈춘다.
그래서 비정상적으로 프로그램이 멈추지 않도록 예외처리를 해주어야한다 */