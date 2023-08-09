package ExePoo;

public class Cliente {
	private String nomeCliente;
	private int idade;
	private String endereço;
	private int periodo;
	private String curso;
	public Cliente(String nomeCliente, int idade, String endereço, int periodo, String curso) {
		super();
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.endereço = endereço;
		this.periodo = periodo;
		this.curso = curso;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void visualizar() {
		System.out.println("\n "+nomeCliente+ " tem " +idade+ " residente em " +endereço+ " que está no " +periodo+" do " +curso);
	}
	

}
