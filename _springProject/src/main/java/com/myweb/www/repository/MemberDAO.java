package com.myweb.www.repository;

import java.util.List;

import com.myweb.www.security.AuthVO;
import com.myweb.www.security.MemberVO;

public interface MemberDAO {

	int register(MemberVO mvo);

	int insertAuthInit(MemberVO mvo);

	MemberVO selectEmail(String username);

	List<AuthVO> selectAuths(String username);

	int lastLogin(String authEmail);

	List<MemberVO> getMemberList();

	int modiPwd(MemberVO mvo);

	void delAuthUser(String email);

	int delete(String email);



}
