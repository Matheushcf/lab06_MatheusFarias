package lab06;

public class Plataforma extends Jogo{

	public Plataforma(String nome, int preco) {
		super(nome, preco);
	}

	@Override
	public int registraJogada(int score, boolean zerar){
		if (score > super.getPontuacao()) {
			super.setPontuacao(score);
		}
		super.setVezesJogadas();
		if (zerar == true){
			super.setZerar();
			return 20;
		}
		return 0;
	}
}
