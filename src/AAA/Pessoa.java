package AAA;

public class Pessoa {

	private String nome;
	private int idade;
	private String estado;
	public Pessoa(String nome, int idade,  String estado) {
		this.idade = idade;
		this.nome = nome;
		this.estado = estado;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
