import java.util.Random;

public class ChuteForte implements Chute{
	
	public void finalizacao() {
		Random random = new Random();
		int valor = random.nextInt(100);	
		if(valor <= 30) {
			System.out.println("Chute para fora!");
		} else if (valor <=78 ){
			System.out.println("O goleiro espalma!");
		} else {
			System.out.println("Gooolll!");
		}
	}

}
