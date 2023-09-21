package com.ncs.test.member.model.service;

import java.util.List;

import com.ncs.test.member.model.vo.MemberVo;

public interface MemberService {
	
	public List<MemberVo> selectList();
	public MemberVo selectOne(String memberId);

}
