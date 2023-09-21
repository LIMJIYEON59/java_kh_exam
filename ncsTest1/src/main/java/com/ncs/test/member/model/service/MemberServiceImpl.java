package com.ncs.test.member.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncs.test.member.model.dao.MemberDao;
import com.ncs.test.member.model.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberDao memberdao;

	@Override
	public List<MemberVo> selectList() {
		return memberdao.selectList();
	}

	@Override
	public MemberVo selectOne(String memberId) {
		return memberdao.selectOne(memberId);
	}
	


}
