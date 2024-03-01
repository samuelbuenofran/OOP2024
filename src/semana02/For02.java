/**
 * 
 */
package semana02;

/**
 * 
 */
public class For02 {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for (char letra = 'A'; letra <= 'z'; letra++) {
			System.out.println(letra + " = " + (int) letra);
			Thread.sleep(1000);
		}
	}

}
