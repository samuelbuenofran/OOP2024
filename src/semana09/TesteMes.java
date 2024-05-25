package semana09;

import javax.swing.JOptionPane;

public class TesteMes {
	public static void main(String[] args) {
		try {
			digitarMes();
<<<<<<< HEAD
			// continuação do programa
		} 
		catch (MesInvalidoException e) {
			System.out.println(e);
		}
	}

	public static void digitarMes() throws MesInvalidoException {
		int mes = Integer.parseInt(
				JOptionPane.showInputDialog("Número do mês?"));
		if(mes<0) {
			throw new MesInvalidoException("Mês Negativo");
		}
		else if(mes>12){
=======
			// continuacao do programa
		} catch (MesInvalidoException e) {
			System.out.println(e);
		}
	}
	
	public static void digitarMes() throws MesInvalidoException {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Número do mês?"));
		if(mes < 0) {
			throw new MesInvalidoException("Mês Negativo");
		} else if(mes > 12) {
>>>>>>> 125479ee9d1476570dcbddc1518e09a002d2e50d
			throw new MesInvalidoException("Mês superior a 12!");
		}
	}
}
<<<<<<< HEAD
=======

>>>>>>> 125479ee9d1476570dcbddc1518e09a002d2e50d
