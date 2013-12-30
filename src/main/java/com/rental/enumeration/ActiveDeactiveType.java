package com.rental.enumeration;


public enum ActiveDeactiveType {

	Active('A'),
	Inactive('I');

	private Character val;

	ActiveDeactiveType(Character val){
		this.val = val;
	}

	public Character getVal() {
		return val;
	}

	public static ActiveDeactiveType valOf(Character val) throws Exception {
		if (val.equals(Active.getVal())) {
			return Active;
		} else if (val.equals(Inactive.getVal())) {
			return Inactive;
		}
		throw new Exception("Kode tidak terdaftar");
	}

}
