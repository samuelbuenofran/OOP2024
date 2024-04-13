package semana06;

public class UsaMotor {

	public static void main(String[] args) {
		Motor motor = new Motor();
		motor.ligar();
		motor.mostrar(); // true 0
		for (int a = 1; a < 1000000; a++) {
			motor.acelerar();
		}
		// motor.frear();
		motor.mostrar(); // true 1

		for (int a = 1; a <= 1000000; a++) {
			motor.frear();
		}
		motor.mostrar(); // true 0
	}

}
