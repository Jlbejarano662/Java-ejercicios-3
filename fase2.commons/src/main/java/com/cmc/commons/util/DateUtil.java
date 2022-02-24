package com.cmc.commons.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	private static final String FORMATO = "yyyy/dd/MM";
	
	public static Date convertir(String fecha) throws ParseException{
		SimpleDateFormat f = new SimpleDateFormat(FORMATO);
        Date date = f.parse(fecha);  
        return date;
	}
}
