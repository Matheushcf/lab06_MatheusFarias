package lab06;

public abstract class Jogo {
	private String nome;
	private int preco;
	private int pontuacao;
	private int vezesJogadas;
	private int zerar;

	public Jogo(String nome, int preco) {
		this.nome = nome;
		this.preco = preco;
		this.pontuacao = 0;
		this.vezesJogadas = 0;
		this.zerar = 0;
	}

	public abstract int registraJogada(int score, boolean zerar) throws Exception;
	
	public String getNome(){
		return this.nome;
	}
	
	public int getPreco(){
		return this.preco;
	}
	
	public int getPontuacao(){
		return this.pontuacao;
	}
	
	public int getVezesJogadas(){
		return this.vezesJogadas;
	}
	
	public int getZerar(){
		return this.zerar;
	}
	
	public void setPontuacao(int score){
		pontuacao = score;
	}
	
	public void setZerar(){
		this.zerar += 1;
	}
	
	public void setVezesJogadas(){
		this.vezesJogadas += 1;
	}
}
