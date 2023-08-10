package ExePoo;

public class pessoajuridica extends Cliente {
	private String Cnpj;

	public pessoajuridica(String nomeCliente, int idade, String endereço, int periodo, String curso, String Cnpj) {
		super(nomeCliente, idade, endereço, periodo, curso);
		this.Cnpj = Cnpj;
	}

	public String getCnpj() {
		return Cnpj;
	}

	public void setCnpj(String Cnpj) {
		this.Cnpj = Cnpj;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Cnpj: " + Cnpj);
	}

	public void validarCnpj() {
		if (getCnpj().length() != 14) {
			System.out.println("\nCnpj inválido!!");
		} else {
			System.out.println("\nCnpj válido!!");
		}

	}

}
