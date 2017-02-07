package lab06;

public class Jogabilidade {

	public enum tipoJogo {
		Online("Online"), Offline("Offline"), Multiplayer("Multiplayer"), Cooperativo("Cooperativo"), Competitivo("Competitivo");

		private String tipo;

		tipoJogo(String tipo) {
			tipo = this.tipo;
		}

		public String getValor() {
			return this.tipo; 
		}

	}

}
