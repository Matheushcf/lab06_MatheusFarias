package lab06;

public class Veterano extends Usuario{

	public Veterano(String nome, String login) {
		super(nome, login);
		x2p = 1000;
	}
	
	public boolean comprarJogo(Jogo jogo){
		if(super.getSaldo() >= jogo.getPreco() * 0.8){
			super.jogos.add(jogo);
			adicionaX2P(jogo.getPreco());
			return true;
		}
		return false;
	}
	
	public void adicionaX2P(int preco){
		x2p += (15 * preco);
	}
}
