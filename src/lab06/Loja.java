package lab06;

import java.util.HashSet;

public class Loja {
	private HashSet<Usuario> usuarios;

	public Loja() {
		usuarios = new HashSet<>();

	}

	public void criaConta(String nome, String login) {
		Usuario newUser = new Usuario(nome, login);
		usuarios.add(newUser);
	}

	public void adicionaFundos(String login, double valor) {
		Usuario user = buscaUsuario(login);
		user.setSaldo(valor);
	}

	public Usuario buscaUsuario(String login) {
		for (Usuario e : usuarios) {
			if (login.equals(e.getLogin())) {
				return e;
			}
		}
		return null;
	}
	
	public void compraJogo(String login, String nomeJogo, double preco){
		Usuario user = buscaUsuario(login);
		
	}
}
