package ExePoo;

public class TestaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Cliente[] lista = new Cliente [2];
		lista [0] = new Cliente ("Steffanie",24,"Paulista",5,"Nutrição");
		lista [1] = new Cliente ("Ygor",25,"Orelinda",1,"Ciencias da computação");
		for (Cliente mostra : lista) {
			mostra.visualizar();
		}
 
	}

}
