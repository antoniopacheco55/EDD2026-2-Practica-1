import java.util.Scanner;
public class Picross{
	public static void main(String[] args) throws ValorInvalidoException {
		System.out.println("Bievenido al juego de Picross");
		Tablero tableroDeJuego = new Tablero();
		Scanner sc = new Scanner(System.in);

		while(!tableroDeJuego.victoria()){
			tableroDeJuego.mostrar();
			try{
				System.out.println("Introduce el numero de la opcion que quieras realizar:");
				System.out.println("1°Marcar casilla");
				System.out.println("2°Borrar marca");
				int opcion = sc.nextInt();
				if(opcion > 2 || opcion < 1){
					throw new ValorInvalidoException("Introduce una opcion valida");
				}
				sc.nextLine();

				switch(opcion){
					case 1:
						try{
							System.out.println("Introduce una fila de 0-4");
							int fila = sc.nextInt();
							if(fila > 4 || fila < 0){
								throw new ValorInvalidoException("Introduce una opcion valida");
							}
							sc.nextLine();

							System.out.println("Introduce una columna de 0-4");
							int columna = sc.nextInt();
							if(columna > 4 || columna < 0){
								throw new ValorInvalidoException("Introduce una opcion valida");
							}
							sc.nextLine();
							tableroDeJuego.marcarCasilla(fila,columna);
							tableroDeJuego.victoria();
						}catch(ValorInvalidoException e){
							System.out.println(e);
							sc.nextLine();
							System.out.println("Intentalo de nuevo");
							System.out.println();
						}catch(java.util.InputMismatchException e){
							System.out.println("No introdujiste el tipo adecuado de datos");
							sc.nextLine(); //sirve para limpiar el espacio del nextInt que se introdujo pero es incorrecto
							System.out.println("Intentalo de nuevo");
							System.out.println();
						}
						break;

					case 2:
						try{
							System.out.println("Introduce una fila de 0-4");
							int fila = sc.nextInt();
							if(fila > 4 || fila < 0){
								throw new ValorInvalidoException("Introduce una opcion valida");
							}
							sc.nextLine();

							System.out.println("Introduce una columna de 0-4");
							int columna = sc.nextInt();
							if(columna > 4 || columna < 0){
								throw new ValorInvalidoException("Introduce una opcion valida");
							}
							sc.nextLine();
							tableroDeJuego.borrarCasilla(fila,columna);
							tableroDeJuego.victoria();
						}catch(ValorInvalidoException e){
							System.out.println(e);
							sc.nextLine();
							System.out.println("Intentalo de nuevo");
							System.out.println();
						}catch(java.util.InputMismatchException e){
							System.out.println("No introdujiste el tipo adecuado de datos");
							sc.nextLine(); //sirve para limpiar el espacio del nextInt que se introdujo pero es incorrecto
							System.out.println("Intentalo de nuevo");
							System.out.println();
						}
						break;

				}
			}catch(ValorInvalidoException e){
				System.out.println(e);
				sc.nextLine();
				System.out.println("Intentalo de nuevo");
				System.out.println();
			}catch(java.util.InputMismatchException e){
				System.out.println("No introdujiste el tipo adecuado de datos");
				sc.nextLine(); //sirve para limpiar el espacio del nextInt que se introdujo pero es incorrecto
				System.out.println("Intentalo de nuevo");
				System.out.println();
			}
		}
		System.out.println("Eso ya ganaste");
	}
}