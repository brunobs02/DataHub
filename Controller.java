package com.datahubapi.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
	
	
		@RequestMapping("/")
		@ResponseBody		
		public static String calculaIdade()
		{

			Calendar dateOfBirth = new GregorianCalendar();

			dateOfBirth.set(2013, Calendar.FEBRUARY, 28);

			// Cria um objeto calendar com a data atual

			Calendar today = Calendar.getInstance();

			// retorna idade de acordo com o ano

			int age = today.get(Calendar.YEAR) - dateOfBirth.get(Calendar.YEAR);

			//se a data de hoje for anterior a data de nascimento diminui 1 ano

			if (today.before(dateOfBirth)) 
			{
			age--;
			}

			return ("A idade de acordo com a data setada no código é: " + age + " anos.");
		}
	}


