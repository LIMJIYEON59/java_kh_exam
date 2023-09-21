package com.ncs.test.member.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ncs.test.member.model.vo.MemberVo;

@Repository
public class MemberDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberVo> selectList() {
		return sqlSession.selectList("member.selectList");
	}
	public MemberVo selectOne(String memberId) {
		return sqlSession.selectOne("member.selectOne",memberId);
	}
	
}
