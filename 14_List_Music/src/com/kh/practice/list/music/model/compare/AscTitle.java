package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.Music;


public class AscTitle implements Comparator<Music> {
	
	@Override
	public int compare(Music o, Music o2) {   // o,o2 숫자로 시작 못함
		int result = 0;
		result = o.getTitle().compareTo(o2.getTitle());
		System.out.println("정렬확인" + result + "-" + o.getSinger());
		return result; // int형이라 return 꼭 해야함

	}

}
