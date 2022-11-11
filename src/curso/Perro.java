package curso;

public class Perro implements Acciones{

	public String nombre;
	public String raza;
	public String altura;
	
	public String Comer(String carne) {
		
		return nombre + " mide " + altura + " y comera " + carne;
	}
	
	public String dormir() {
		return "";
	}
	
	public String ladrar() {
		return "";
	}

	
	public String correr() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String nadar() {
		// TODO Auto-generated method stub
		return null;
	}

}
