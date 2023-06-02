package com.kh.practice.snack.comtroller;

import com.kh.practice.snack.model.vo.snack;

public class SnackController {
	private snack s = new snack();	//필드 끝나고 닫지 않는다
			
		public SnackController() {} //중괄호 바로 열고 닫아도됨 별로 하는 일이 없어서
		
		public String saveData(String kind, String name, String flavor, int numOf,int price) {
			//This method must return a result of type String =>return을 String으로 해줘야 하는데 안해줘(오류)
			String result = null;
			//TODO
			return result;
		}
		
		public String confirmData() {
			String result = null;
			//TODO
			return result;
		}
			

}
