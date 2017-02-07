package lab06;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String login;
	private double carteira;
	private ArrayList<Jogo> jogos;

	public Usuario(String nome, String login, double carteira) {
		this.nome = nome;
		this.login = login;
		this.carteira = carteira;
		this.jogos = new ArrayList<>();
	}

	public enum tipoUsuario {
		Noob(10), Veterano(20); 

		private int valor;

		tipoUsuario(int valor) {
			this.valor = valor;
		}

		public int getValor() {
			return this.valor;
		}

	}

	public void adicionaFundos(double valor) {
		carteira += valor;
	}

	public void comprarJogo(String nome, double preco, int pontuacao, int vezesJogadas, int zerar) {
		Jogo game = new Jogo(nome, preco, pontuacao, vezesJogadas, zerar);
		jogos.add(game);
	}

}
