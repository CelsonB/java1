package celson;

public class Produtos {
	private int codigo;
	private String nome;
	private double preco;
	private int estoque;
	
		public Produtos(int codigo, String nome, double preco, int estoque) {
			
			this.codigo = codigo;
			this.nome = nome;
			this.preco = preco;
			this.estoque = estoque;
		}

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}

		public int getEstoque() {
			return estoque;
		}

		public void setEstoque(int estoque) {
			this.estoque = estoque;
		}

		@Override
		public String toString() {
			return "Produtos [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", estoque=" + estoque + "]";
		}
	
	
}
