package br.edu.iffarroupilha.bolicho.visao.web;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import br.com.caelum.vraptor.Convert;
import br.com.caelum.vraptor.Converter;

@Convert(Date.class)
public class DataAluno implements Converter<Date>{

	@Override
	public Date convert(String string, Class<? extends Date> arg1, ResourceBundle arg2) {
		
		Date data;
		
		if (string != null) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
			try {
				data = sdf.parse(string);
				return data;
			} catch (ParseException e) {
			
				e.printStackTrace();
			}
			
		} 
			return null;
	}
	
	

}
