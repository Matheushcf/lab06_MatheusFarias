package lab06;

public class Jogo {
	private String nome;
	private double preco;
	private int pontuacao = 0;
	private int vezesJogadas = 0;
	private int zerar = 0;

	public Jogo(String nome, double preco, int pontuacao, int vezesJogadas, int zerar) {
		this.nome = nome;
		this.preco = preco;
		this.pontuacao = pontuacao;
		this.vezesJogadas = vezesJogadas;
		this.zerar = zerar;
	}

	public int registraJogada(int score, boolean zerar) {
		if (score > pontuacao) {
			pontuacao = score;
		}
		if (zerar == true){
			this.zerar += 1;
		}
		this.vezesJogadas += 1;
		
		return x2p; 
	}
}
