package co.edu.uniquindio.programacion3.hilos_CreacionV0;

public class MainEjemplo1 {

	public static void main (String [] args) {
		
		MiHilo1 hilo1 = new MiHilo1();
		hilo1.setName("Mi hilo 1");
		hilo1.start();
		System.out.println(" OJO---continuaci�n del flujo principal");
	}
}
