package lab06;

public class RPG extends Jogo{

	public RPG(String nome, int preco) {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerar) {
		if (score > super.getPontuacao()) {
			super.setPontuacao(score);
		}
		if (zerar == true){
			super.setZerar();
		}
		super.setVezesJogadas();
		return 10;
	}
}
