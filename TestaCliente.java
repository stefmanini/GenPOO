package ExePoo;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Cliente[] lista = new Cliente [2];
		lista [0] = new pessoafisica ("Steffanie",24,"Paulista",5,"Nutrição","23456789123");
		lista [1] = new pessoajuridica ("Ygor",25,"Orelinda",1,"Ciencias da computação", "2345678912312");
		for (Cliente mostra : lista) {
			mostra.visualizar();
			if (mostra instanceof pessoafisica) {
                pessoafisica pf = (pessoafisica) mostra;
                pf.validarcpf();
            } else if (mostra instanceof pessoajuridica) {
                pessoajuridica pj = (pessoajuridica) mostra;
                pj.validarCnpj();
            }
		}
 
	}

}
