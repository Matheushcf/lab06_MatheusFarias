package lab06;

public class Noob extends Usuario{
	
	public Noob(String nome, String login) {
		super(nome, login);
		x2p = 0;
	}
	
	public boolean comprarJogo(Jogo jogo){
		if(super.getCarteira() >= jogo.getPreco() * 0.9){
			super.jogos.add(jogo);
			adicionaX2P(jogo.getPreco());
			return true;
		}
		return false;
	}
	
	public void adicionaX2P(int preco){
		x2p += (10 * preco);
	}
}
