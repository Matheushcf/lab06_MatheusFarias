package lab06;

import java.util.HashSet;

public class Usuario {
	private String nome;
	private String login;
	private double carteira = 0;
	protected HashSet<Jogo> jogos;
	protected int x2p;

	public Usuario(String nome, String login) {
		this.nome = nome;
		this.login = login;
		jogos = new HashSet<>();
	}
	
	public int registraJogada(String nomeJogo, int score, int zerou){
		
	}
	
	public Jogo buscaJogo(String nomeJogo){
		for(Jogo e: jogos){
			if (nomeJogo.equals(e.getNome())){
				return e;
			}
		}
		return null;
	}

	public void adicionaFundos(double valor) {
		carteira += valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public double getCarteira(){
		return this.carteira;
	}
}
