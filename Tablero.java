/**
 * Clase para manejar el tablero 
 * 
 * @author Antonio Pacheco
 * @version 2026-2
 * 
 */
public class Tablero{
	//Atributos
	private int [][] tablero = new int[5][5];
	private boolean[][] visible = new boolean[5][5]; 

	/**
	 * Metodo constructor por defecto de un tablero
	 */
	public Tablero(){
		tablero = new int[][] {
				   {1, 0, 1, 1, 0},
				   {0, 1, 1, 0, 0},	
				   {1, 1, 0, 0, 1}, 	
				   {0, 1, 0, 1, 1},
				   {1, 0, 0, 1, 0}};
	}

	/**
	 * Metodo para mostrar el tablero
	 */	
	public void mostrar(){
		//Mostrar pistas de columnas
		int [][] pistaColumna = pistaColumna();
		int [][] pistaFila = pistaFila();
		for(int i = 0; i < pistaColumna[0].length; i++){
			//Espacio para alinear las pistas
			for(int espacio = 0; espacio < 3; espacio++){
				System.out.print("  ");
			}

			for(int j = 0; j < tablero.length;j++){
				if(pistaColumna[j][i] != 0){
				System.out.print(pistaColumna[j][i] + "  ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("   _________________");

		//Mostrar pistas de fila y tablero
		for(int i = 0; i < tablero.length; i++){
			//imprimir pistas de las filas
			for(int j = 0; j < pistaFila[0].length; j++){
				if(pistaFila[i][j] != 0){
				System.out.print(pistaFila[i][j]);
				}else{
					System.out.print(" ");
				}
			}
			System.out.print(" |");

			//imprimir tablero
			for(int j = 0; j < tablero.length; j++){
				if(visible[i][j] == true){
					System.out.print(" " + tablero[i][j] + " ");
				}else{
					System.out.print(" * ");
				}
			}
			System.out.println();
		}

	}

	/**
	 * Metodo para desvelar casillas
	 * 
	 * @param int fila del tablero
	 * @param columna del tablero
	 */
	public void marcarCasilla(int fila, int columna){
		if(visible[fila][columna] == true){
			System.out.println("Esta casillas ya esta marcada");
			return;
		}
		visible[fila][columna] = true;
	}

	/**
	 * Metodo para borrar casillas
	 * 
	 * @param int fila del tablero
	 * @param columna del tablero
	 */

	public void borrarCasilla(int fila, int columna){
		if(visible[fila][columna] == false){
			System.out.println("Esta casillas ya esta borrada");
			return;
		}
		visible[fila][columna] = false;
	}

	/**
	 * Metodo para dar pistas de las filas
	 * 
	 * @return arreglo de las pistas de las filas
	 */
	public int[][] pistaFila(){
		int [][] aux = new int[5][3]; //Este arreglo servira para guardar las pistas de cada fila y tendran tamaño tres porque es el mayor numero de valores que pueden estar separados
		int m;
		for(int i  = 0; i < tablero.length; i++){
			m = 0;
			for(int j = 0; j < tablero.length; j++){
				if(tablero[i][j] == 1 ){
					aux[i][m] += 1;
				}else if(aux[i][m] != 0){
				m++;
				}
			}
		}
		return aux;
	}

	/**
	 * Metodo para dar pistas de las columnas
	 * 
	 * @return arreglo de las pistas de las columnas
	 */
	public int[][] pistaColumna(){
		int [][] aux = new int[5][3]; //Este arreglo servira para guardar las pistas de cada fila y tendran tamaño tres porque es el mayor numero de valores que pueden estar separados
		int m;
		for(int i  = 0; i < tablero.length; i++){
			m = 0;
			for(int j = 0; j < tablero.length; j++){
				if(tablero[j][i] == 1 ){
					aux[i][m] += 1;
				}else if(aux[i][m] != 0){
				m++;
				}
			}
		}
		return aux;
	}
 
	/**
	 * Metodo para determinar la victoria
	 * 
	 * @return true si el tablero del usuario ya tiene todas las pistas
	 */
	public boolean victoria(){
		for (int i  = 0 ;i < tablero.length; i++){
			for(int j = 0; j < tablero.length; j++){
				if(tablero[i][j] == 1 && visible[i][j] == false){
					return false;
				}else if(tablero[i][j] == 0 && visible[i][j] == true){
					return false;
				}
			}
		}
		return true;
	}


}