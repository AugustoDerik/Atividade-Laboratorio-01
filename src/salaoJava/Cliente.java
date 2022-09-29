package salaoJava;

public class Cliente {

	private int id;
	private String nome;
	private String CPF;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 3)
			this.nome = nome;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String cPF) {
		this.CPF = cPF;
	}

	public Cliente(String CPF) {
		this.CPF = CPF;
	}

}
