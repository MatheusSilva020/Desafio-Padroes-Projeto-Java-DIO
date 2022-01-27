import java.util.Random;

public class ChuteColocado implements Chute{
	
	@Override
	public void finalizacao() {
		Random random = new Random();
		int valor = random.nextInt(100);	
		if(valor >=75) {
			System.out.println("O goleiro defendeu!");
		} else {
			System.out.println("Gooolll!");
		}
	}
}
