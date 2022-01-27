
public class Jogador {
	//variaveis:
	private Comportamento comportamento;
	private Chute chute;
	
	//metodos:
	public void setComportamento(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
	
	public void prepararChute() {
		comportamento.prepararChute();
	}
	
	public void setChute(Chute chute) {
		this.chute = chute;
	}
	
	public void finalizacao() {
		chute.finalizacao();
	}

}
