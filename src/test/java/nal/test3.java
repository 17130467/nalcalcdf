﻿package nal; 
/*Подключение библиотеки. JUnit - это библиотека, позволяющая
 * проводить модульное тестирование Java приложений. Класс Assert 
 * содержит набор утверждений, которые облегачют процесс тестирования. */
import static org.junit.Assert.*;
/*Аннтоация @Test указывает JUnit, что метод является тестовым методом*/
import org.junit.Test;

import nal.tax;
/*Объявляем новый класс test3*/
public class test3 {
	/*Обозначает новую переменную из класса tax*/
	tax tax = new tax();
	/*InterruptedException это проверяемое исключение, генерируемый многими методами стандартной библиотеки, которые блокируют поток исполнения*/
	@Test
	public void testTax() throws InterruptedException
	 {
		/*Подставляет значения в метод calcTax1,
		 * где высчитывают процент налога с дохода*/
	 double res= tax.calcTax(100000, 15);
		/*Заданное полученное значение*/
	 double toch=15000.0;
		/*Сравнивают высчитанное методом calcTax и заранее заданное значение */
	 assertEquals(Double.toString(res),Double.toString(toch));
	 }
}