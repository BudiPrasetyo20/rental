package com.rental.enumeration;

public enum UserType {
	Admin('A'),
	Member('M'),
	SuperAdmin('S');

	private Character val;

	UserType(Character val){
		this.val = val;
	}

	public Character getVal() {
		return val;
	}

	public static UserType valOf(Character val) throws Exception {
		if (val.equals(Admin.getVal())) {
			return Admin;
		} else if (val.equals(Member.getVal())) {
			return Member;
		} else if (val.equals(SuperAdmin.getVal())) {
			return SuperAdmin;
		}
		throw new Exception("Kode tidak terdaftar");
	}

}
