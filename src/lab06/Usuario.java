package lab06;

import java.util.HashSet;

public class Usuario {
	private String nome;
	private String login;
	private double saldo = 0;
	protected HashSet<Jogo> jogos;
	protected int x2p;
	
	public Usuario(String nome, String login) {
		this.nome = nome;
		this.login = login;
		jogos = new HashSet<>();
		this.x2p = 0;
	}
	
	public void registraJogada(String nomeJogo, int score, boolean zerar) throws Exception{
		Jogo game = buscaJogo(nomeJogo);
		game.registraJogada(score, zerar);
	}
	
	public Jogo buscaJogo(String nomeJogo){
		for(Jogo e: jogos){
			if (nomeJogo.equals(e.getNome())){
				return e;
			}
		}
		return null;
	}

	public void setSaldo(double valor) {
		saldo += valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getLogin(){
		return this.login;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
}
