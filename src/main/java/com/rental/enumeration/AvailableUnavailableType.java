package com.rental.enumeration;

public enum AvailableUnavailableType {

	Available('A'),
	Unavailable('U');

	private Character val;

	AvailableUnavailableType(Character val){
		this.val = val;
	}

	public Character getVal() {
		return val;
	}

	public static AvailableUnavailableType valOf(Character val) throws Exception {
		if (val.equals(Available.getVal())) {
			return Available;
		} else if (val.equals(Unavailable.getVal())) {
			return Unavailable;
		}
		throw new Exception("Kode tidak terdaftar");
	}
}
