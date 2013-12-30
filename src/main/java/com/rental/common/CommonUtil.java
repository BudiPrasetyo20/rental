package com.rental.common;

import java.util.AbstractMap;
import java.util.Collection;

public class CommonUtil {
    public static Boolean isNotNullOrEmpty(Object object) {
        return !isNullOrEmpty(object);
    }
    
    public static Boolean isNullOrEmpty(Object object) {
        if (object == null) {
            return true;
        } else {
            if (object instanceof Collection) {
                if (((Collection) object).isEmpty()) {
                    return true;
                }
            } else if (object instanceof AbstractMap) {
                if (((AbstractMap) object).isEmpty()) {
                    return true;
                }
            } else {
                if (object.toString().trim().equals("")) {
                    return true;
                }
            }
            return false;
        }
    }
    
    // roman Numeral : credit to http://code.activestate.com/recipes/577313-romannumeral-to-integers-viceversa/
    final static char symbol[] = { 'M', 'D', 'C', 'L', 'X', 'V', 'I' };
	final static int value[] = { 1000, 500, 100, 50, 10, 5, 1 };

	public static int romanValueOf(String roman) {
		roman = roman.toUpperCase();
		if (roman.length() == 0)
			return 0;
		for (int i = 0; i < symbol.length; i++) {
			int pos = roman.indexOf(symbol[i]);
			if (pos >= 0)
				return value[i] - romanValueOf(roman.substring(0, pos))
						+ romanValueOf(roman.substring(pos + 1));
		}
		throw new IllegalArgumentException("Invalid Roman Symbol.");
	}

	private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10,
			9, 5, 4, 1 };

	private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L",
			"XL", "X", "IX", "V", "IV", "I" };

	public static String romanConvertTo(int N) {
		String roman = "";
		for (int i = 0; i < numbers.length; i++) {
			while (N >= numbers[i]) {
				roman += letters[i];
				N -= numbers[i];
			}
		}
		return roman;
	}
    // roman Numeral : credit to http://code.activestate.com/recipes/577313-romannumeral-to-integers-viceversa/
}
