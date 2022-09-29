package salaoJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Cliente cliente1 = new Cliente("999.999.999-99");
		cliente1.setId(1);
		cliente1.setNome("Joao");

		Cabelereiro cab1 = new Cabelereiro("232323", "Jonas");
		cab1.setId(1);

		Agendamento talHora = new Agendamento(cliente1, cab1);
		talHora.setCabelereiro(cab1);
		talHora.setCliente(cliente1);
		// talHora.setData();
		talHora.setId(1);
		// talHora.setMinuto(20);
		// talHora.setHora(15);

		Serviço cortarCabelo = new Serviço();
		cortarCabelo.setDescricao("Cortar cabelo");
		cortarCabelo.setId(1);
		cortarCabelo.setNome("Cortar");
		cortarCabelo.setValor(10);

		Atendimento primeiro = new Atendimento(cliente1);
		primeiro.addServiço(cortarCabelo);
		primeiro.setCabelereiro(cab1);
		primeiro.setCliente(cliente1);

		Cliente cliente2 = new Cliente("898989");
		cliente2.setId(2);
		cliente2.setNome("Jeff");

		Cabelereiro cab2 = new Cabelereiro("454545", "Dio");
		cab2.setId(2);
		// cab2.setId(b);

		Agendamento talHora2 = new Agendamento(cliente2, cab2);
		talHora2.setCabelereiro(cab2);
		talHora2.setCliente(cliente2);
		// talHora.setData();
		talHora2.setId(2);
		// talHora.setMinuto(20);
		// talHora.setHora(15);

		Serviço lavarCabelo = new Serviço();
		lavarCabelo.setDescricao("Lavar cabelo");
		lavarCabelo.setId(2);
		lavarCabelo.setNome("Lavagem");
		lavarCabelo.setValor(15);

		Atendimento segundo = new Atendimento(cliente2);
		segundo.addServiço(lavarCabelo);
		segundo.setCabelereiro(cab2);
		segundo.setCliente(cliente2);

		Cliente cliente3 = new Cliente("7474747474");
		cliente3.setId(3);
		cliente3.setNome("Edward");

		Cabelereiro cab3 = new Cabelereiro("56565656", "Cesar");
		cab3.setId(3);
		// cab2.setId(b);

		Agendamento talHora3 = new Agendamento(cliente3, cab3);
		talHora3.setCabelereiro(cab3);
		talHora3.setCliente(cliente3);
		// talHora.setData();
		talHora3.setId(3);
		// talHora.setMinuto(20);
		// talHora.setHora(15);

		Serviço hidratarCabelo = new Serviço();
		hidratarCabelo.setDescricao("Hidratar cabelo");
		hidratarCabelo.setId(3);
		hidratarCabelo.setNome("Hidratação");
		hidratarCabelo.setValor(82);

		Atendimento terceiro = new Atendimento(cliente3);
		terceiro.addServiço(hidratarCabelo);
		terceiro.setCabelereiro(cab3);
		terceiro.setCliente(cliente3);

		System.out.println("Clientes:\n" + cliente1.getId() + ": " + cliente1.getNome() + " CPF:" + cliente1.getCPF()
				+ "\n" + cliente2.getId() + ": " + cliente2.getNome() + " CPF:" + cliente2.getCPF() + "\n"
				+ cliente3.getId() + ": " + cliente3.getNome() + " CPF:" + cliente3.getCPF());
		System.out.println();
		System.out.println("Cabelereiros:\n" + cab1.getId() + ": " + cab1.getNome() + " CPF:" + cab1.getCPF() + "\n"
				+ cab2.getId() + ": " + cab2.getNome() + " CPF:" + cab2.getCPF() + "\n" + cab3.getId() + ": "
				+ cab3.getNome() + " CPF:" + cab3.getCPF());
		System.out.println();
		System.out.println("Serviços:\n" + cortarCabelo.getId() + ": " + cortarCabelo.getNome() + " Valor:"
				+ cortarCabelo.getValor() + "\n" + "Descrição: " + cortarCabelo.getDescricao() + "\n"
				+ lavarCabelo.getId() + ": " + lavarCabelo.getNome() + " Valor:" + lavarCabelo.getValor() + "\n"
				+ "Descrição: " + lavarCabelo.getDescricao() + "\n" + hidratarCabelo.getId() + ": "
				+ hidratarCabelo.getNome() + " Valor:" + hidratarCabelo.getValor() + "\n" + "Descrição: "
				+ hidratarCabelo.getDescricao());
		System.out.println();

		entrada.close();
	}

}
