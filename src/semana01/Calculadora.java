package semana01;

/**
 * Portuguese: Esta aplicacao simula uma calculadora English: This application
 * simulate a calculator Deutsch: Diese Anwendung simuliert einen Taschenrechner
 * Français: Cette application simule une calculatrice Español: Esta aplicación
 * Japanese: このアプリケーションは電卓をシミュレートします Nederlands: Deze toepassing simuleert een
 * rekenmachine Chinese (Traditional): 這個應用程序模擬了一個計算器 Svenska: Denna applikation
 * simulerar en kalkylator
 */

public class Calculadora {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);

		System.out.println("A soma é: " + (n1 + n2));
//		System.out.println(args[1]);
	}
}
