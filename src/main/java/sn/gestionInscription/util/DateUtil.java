package sn.gestionInscription.util;

import java.util.Date;

import com.ibm.icu.util.Calendar;

public class DateUtil {
	public static Date createDate(int day, int month, int year) {
		Calendar cal =Calendar.getInstance();
		cal.set(year, month-1, day);
		return cal.getTime();
	}

}
