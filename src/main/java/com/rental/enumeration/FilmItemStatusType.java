package com.rental.enumeration;


public enum FilmItemStatusType {

	Good('G'),
	Brooken('B'),
	Lose('L');

	private Character val;

	FilmItemStatusType(Character val){
		this.val = val;
	}

	public Character getVal() {
		return val;
	}

	public static FilmItemStatusType valOf(Character val) throws Exception {
		if (val.equals(Good.getVal())) {
			return Good;
		} else if (val.equals(Brooken.getVal())) {
			return Brooken;
		} else if (val.equals(Lose.getVal())) {
			return Lose;
		}
		throw new Exception("Kode tidak terdaftar");
	}

}
