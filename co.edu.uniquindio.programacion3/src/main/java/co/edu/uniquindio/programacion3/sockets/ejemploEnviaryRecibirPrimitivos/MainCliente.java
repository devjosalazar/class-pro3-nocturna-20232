package co.edu.uniquindio.programacion3.sockets.ejemploEnviaryRecibirPrimitivos;

public class MainCliente {

	public static void main(String[] args) {
		
		AppCliente appCliente = new AppCliente("localhost",8081);
		System.out.println("Iniciando cliente\n");
		appCliente.iniciarCliente();
	}

}
