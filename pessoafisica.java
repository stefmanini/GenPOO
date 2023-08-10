package ExePoo;

public class pessoafisica extends Cliente {
	private String cpf;

	public pessoafisica(String nomeCliente, int idade, String endereço, int periodo, String curso, String cpf) {
		super(nomeCliente, idade, endereço, periodo, curso);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cpf: " + cpf);
	}

	public void validarcpf() {
		if (getCpf().length() != 11) {
			System.out.println("\nCpf inválido!!");
		} else {
			System.out.println("\nCpf válido!!");
		}

	}

}
