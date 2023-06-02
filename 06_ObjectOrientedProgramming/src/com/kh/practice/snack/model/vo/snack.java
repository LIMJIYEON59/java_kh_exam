package com.kh.practice.snack.model.vo; // vo: value object의약자  //D To :Data transfor object 

public class snack {
	private String kind; //종류              *필드
	private String name; //이름
	private String flavor; //맛
	private int numOf; //개수
	private int price; //가격
	
	//필드 끝
	
	public snack() {   //마크 하나 당 하나의 생성자,아무것도 지정 안하고 만들기 가능/ +Snack
	}
	
	public snack(String kind, String name, String flavor, int numOf,int price) {
		this.kind = kind;  //아무것도 없어도 만들어준다,,,? 다 들고 오면?
		this.name = name;
		this.flavor = flavor;										//*생성자
		this.numOf = numOf;
		this.kind = kind;
		
	} //생성자 끝
	
/*	@Override					//Alt+Shift+s > to String > 생성자(위에)만 선택함 > 생성자 밑에 나올 수 있게 설정함 
	public String toString() {
		return "snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]"; 

	
	} 삭제!! to String 필요없음문제보면.
*/
/*	
	public String information() {	//String으로 return해라(위에 정보들을 예쁘게 정리해줌)
		return null;				//참조자료형은 null을 이용해서 넘겨주는걸 기본으로 한다. return " ";이것보단.
									//TODO	<리턴 밑에 꼭 적어줘야함 이대로 넘기면 안됨
	}
*/	
	public String information() {	//infor에 TODO를 없애고 예쁘게 정보들을 보여줌 그래도 TODO 적어주기
		//TODO
		return "snack [kind=" + kind + ", name=" + name + ", flavor=" + flavor + ", numOf=" + numOf + ", price=" + price
				+ "]"; 
	}
	
	//겟 셋 설정! 오른쪽 마우스>source>겟셋>이번에는 all 누름
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getNumOf() {
		return numOf;
	}

	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	//메소드 끝
	

	
	
	
 }
