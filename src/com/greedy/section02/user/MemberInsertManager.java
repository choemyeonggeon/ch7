package com.greedy.section02.user;

public class MemberInsertManager {
	public void insert(MemberDTO[] members) {
		
		System.out.println("회원을 등록합니다.");
		
		for(int i = 0; i < members.length; i++) {
			System.out.println(members[i].getName()+"님을 회원 등록에 성공했습니다.");
		}
	
	}

}
