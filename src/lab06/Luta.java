package lab06;

public class Luta extends Jogo {

	public Luta(String nome, int preco) {
		super(nome, preco);
	}
	
	@Override
	public int registraJogada(int score, boolean zerar) throws Exception {
		if (score > 100.000 || score < 0){
			throw new Exception("A sua pontuação tem que ser entre 0 e 100.000");
		}
		super.setVezesJogadas();
		super.setPontuacao(score);
		
		if(zerar == true){
			super.setZerar();
		}
		if(score > super.getPontuacao()){
			super.setPontuacao(score);
			return score/1000;
		}
		return 0;
		
	}
	

}
