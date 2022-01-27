
public class Main {
	
	public static void main(String[] args) {
				//Criandos os comportamentos & tipos de chute:
				Comportamento reativo = new ComportamentoReativo();
				Comportamento normal = new ComportamentoNormal();
				Comportamento agressivo = new ComportamentoAgressivo();
				
				Chute forte = new ChuteForte();
				Chute colocado = new ChuteColocado();
				
				//Criando o jogador:
				Jogador jogador = new Jogador();
				
				//Atribuindo os valores ao jogador e testando os resultados possiveis:
				//tipos de corrida p/ bola - reativo, normal e agressivo
				//tipos de chute ao gol - forte e colocado (há possibilidade de mudanca de resultados)
				System.out.println("Tentativa 1:");
				jogador.setComportamento(normal);
				jogador.setChute(colocado);
				jogador.prepararChute();
				jogador.finalizacao();
				System.out.println("Tentativa 2:");
				jogador.setComportamento(reativo);
				jogador.setChute(colocado);
				jogador.prepararChute();
				jogador.finalizacao();
				System.out.println("Tentativa 3:");
				jogador.setComportamento(agressivo);
				jogador.setChute(forte);
				jogador.prepararChute();
				jogador.finalizacao();
	}

}
