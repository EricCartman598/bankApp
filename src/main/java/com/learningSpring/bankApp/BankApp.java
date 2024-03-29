package com.learningSpring.bankApp;

import com.learningSpring.bankApp.services.ConvertCurrency;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ConvertCurrency convertCurrency = (ConvertCurrency) context.getBean("convertCurrencyUsingFile");
		System.out.println(convertCurrency.convert("USD", "RUB", 10.0));
	}

}
