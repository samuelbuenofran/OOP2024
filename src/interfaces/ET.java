package interfaces;

public class ET {
	
	public static void main(String[] args) {
        
		Pessoa p = new Pessoa();
		Animal a = new Animal();
		ET e = new ET();
		
		Vida.viver(p);
		Vida.viver(a);
		Vida.viver(e);
    }
    
}

}
