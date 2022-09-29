package salaoJava;

import java.util.ArrayList;
import java.util.Calendar;

public class Atendimento {

	private Cliente cliente;
	private Cabelereiro cabelereiro;
	private Calendar data;

	private ArrayList<Serviço> listaServiço = new ArrayList<Serviço>();

	public void addServiço(Serviço serviço) {
		this.listaServiço.add(serviço);
	}

	public Atendimento(Cliente cl) {
		this.cliente = cl;
		this.data = Calendar.getInstance();
		data.set(2022, 9, 27, 15, 30);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

}
