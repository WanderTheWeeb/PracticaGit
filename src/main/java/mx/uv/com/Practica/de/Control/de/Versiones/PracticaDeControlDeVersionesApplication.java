package mx.uv.com.Practica.de.Control.de.Versiones;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PracticaDeControlDeVersionesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PracticaDeControlDeVersionesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int opc  = 0;
		int numero ;

		Scanner sc = new Scanner(System.in);

		System.out.println("1) Mostrar una tabla");
		System.out.println("2) Mostrar tablas del 2 al 5");
		System.out.println("3) Salir");

		switch (opc) {
			case 1:
				System.out.println("Ingresa un numero para mostrar su tabla de multiplicar");
				numero = sc.nextInt();
				tabla(numero);
				break;
			case 2:
				for (int i = 2; i <= 5; i++) {
					tabla(i);
				}
				break;
			case 3:
				System.out.println("Adios");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion no valida");
				break;
		}
	}

	public void tabla (int numero) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero * i);
		}
	}
}
