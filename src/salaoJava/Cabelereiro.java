package salaoJava;

public class Cabelereiro {

	private int id;
	private String nome;
	private String CPF;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0)
			this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 3)
			this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Cabelereiro(String CPF, String nome) {
		this.CPF = CPF;
		this.nome = nome;
	}

}
