package ex05method;
/*
¹®Á¦5-3) ÆÄÀÏ¸í : QuTemperature.java  (³­ÀÌµµ:Áß)
¼·¾¾(Celsius)¸¦ ÀÔ·Â¹Þ¾Æ¼­ È­¾¾(Fahrenheit)·Î º¯È¯ÇÏ¿© ¸®ÅÏÇÏ´Â ÇÔ¼ö¿Í
È­¾¾¸¦ ÀÔ·Â¹Þ¾Æ¼­ ¼·¾¾·Î º¯È¯ÇÏ¿© ¸®ÅÏÇÏ´Â ÇÔ¼ö¸¦ ¸¸µé¾î¶ó.
°ø½Ä]
  È­¾¾ = 1.8 * ¼·¾¾ + 32
  ¼·¾¾ = (È­¾¾ - 32) / 1.8
 */

public class QuTemperature {
	
	static double CelsiusToFahrenheit(int cel) {
		
		return 1.8 * cel + 32;
	}
	
    static double FahrenheitToCelsius(int fah) {
    	
    	double cel = (fah - 32) / 1.8;
    	return cel;
    }

	public static void main(String[] args) {
		
		System.out.println("¼·¾¾22->È­¾¾");
		System.out.println(CelsiusToFahrenheit(22));
		System.out.println("È­¾¾98->¼·¾¾");
		System.out.println(FahrenheitToCelsius(98));
		

	}

}
