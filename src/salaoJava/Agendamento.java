package salaoJava;

import java.util.Calendar;

public class Agendamento {

	private Calendar data;
	private int id;
	private Cliente cliente;
	private int hora;
	private int minuto;
	private Cabelereiro cabelereiro;

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		data = Calendar.getInstance();
		data.set(2022, 9, 28, 10, 17);
		this.data = data;
	}

	public Cabelereiro getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(Cabelereiro cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public Agendamento(Cliente cliente, Cabelereiro cabelereiro) {
		this.cliente = cliente;
		this.cabelereiro = cabelereiro;
	}

}
