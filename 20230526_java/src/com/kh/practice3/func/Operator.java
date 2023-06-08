package com.kh.practice3.func;

import java.util.Scanner;

public class Operator {
//	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
//	세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//	세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데
//	세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//
//	ex.
//	국어 : 60
//	영어 : 80
//	수학 : 40
//	합계 : 180
//	평균 : 60.0
//	합격
	
	public void method7() {
		Scanner sc1 = new Scanner(System.in);
		System.out.print("국어 : ");
		int kor = sc1.nextInt();
		System.out.print("영어 : ");
		int eng = sc1.nextInt();
		System.out.print("수학 : ");
		int math = sc1.nextInt();
		System.out.println("합계 :" + (kor + eng + math));
		
		int total = kor+eng+math;
	
		double avg = total/3;
		System.out.println("평균 :" + avg);
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg>=60 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}	
	}

//	주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.
//
//	ex.
//	주민번호를 입력하세요(- 포함) : 132456-2123456
//	여자
	
	public void method8() {
		Scanner sc2 = new Scanner(System.in); //{ 안열어도됨
		System.out.print("주민번호를 입력하세요 : ");
		String num1 = sc2.nextLine();  //숫자를 입력한 순간 성별이 나와야하니깐
		System.out.println(num1.charAt(7));
		
		if(num1.charAt(7) == '1') {
			System.out.println("여자"); 
		} else {
			System.out.println("남자");	
		}
	}
}
	
	
	
	
	
	
	
	
	
	
	
	

	

	

