package com.rental.enumeration;


public enum OrderStatusType {

	Process('P'),
	Finish('F'),
	Void('V');

	private Character val;

	OrderStatusType(Character val){
		this.val = val;
	}

	public Character getVal() {
		return val;
	}

	public static OrderStatusType valOf(Character val) throws Exception {
		if (val.equals(Process.getVal())) {
			return Process;
		} else if (val.equals(Finish.getVal())) {
			return Finish;
		} else if (val.equals(Void.getVal())) {
			return Void;
		}
		throw new Exception("Kode tidak terdaftar");
	}

}
