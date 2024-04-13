package semana07;

import java.lang.reflect.Field;

public class Reflection {

	// listar toda a estrutura de uma classe

	public static void listar(String nomeClass) {

		try {
			Class c = Class.forName(nomeClass);
			System.out.println("Atributos:");
			Field[] atributos = c.getDeclaredFields();
			for (int i=0; i<atributos.length; i++) {
				Field atributo = atributos[i];
				System.out.println("Nome:" + atributo.getName());
				System.out.println("Tipo:" + atributo.getType());
				System.out.println("Classe:" + atributo.getDeclaringClass());
				
				// If you are feeling down, 
				
				int m = atributo.getModifiers();
				System.out.println("Modificadores: " + Modifier.toString());
			}
		}
		catch (ClassNotFoundException e) {
			System.out.println("Classe não encontrada: ");
		}

	}
}
