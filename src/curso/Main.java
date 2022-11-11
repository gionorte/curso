package curso;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Perro P = new Perro();
//		P.nombre = "firulais";
//		P.altura = "5";
//		
//		System.out.println(P.Comer("fish"));
		
		Dinosaurio D = new Dinosaurio();
		D.setNombre("Dino");
		System.out.println(D.getNombre());
		
		Ruido(D);

	}
	
	public static void Ruido(Animal A) {
		System.out.println(A.getNombre()+ " hace " + A.HacerRuido());
	}

}
