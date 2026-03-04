Marco Antonio Pacheco Sanchez 
323100102
antoniopacheco55@ciencias.unam.mx

El codigo tiene dos clases una clase tablero dentro de la cual se implementan 
los metodos que permitiran modificar y visualizar con el tablero, los 
metodos mas relevantes son pistaFila() y pistaColumna() lo cual dan las
pistas del tablero, su funcionamiento consiste en que mientras haya un uno en 
el tablero se suma a la cantidad que ya este dentro de un arreglo bidimensional
especifico para las pistas en cambio si se ve un cero se aumenta una posicion en
dicho arreglo para guardar  la siguiente cantidad de casillas con un uno.

Otros metodos igual de relevantes son los que permiten voltear las casillas
del tablero, y esto se logra gracias a que se creo un arreglo del mismo
tamaño que el tablero de booleanos, donde si la casilla se voltea se vuele true
y asi muestra si existe un 1 o un 0 en esa posicion,en otro caso se muestra un
astedisco y para este codigo se muestra todo el tablero de esta forma, pues
al declarar un booleano este inicia con un valos de false.Y por
ultimo el metodo de victoria verifica que si existe un 1 en el tablero y este 
tiene un valor distinto de true o que si existe un 0 en el tablero y tiene un
valor de true entonces el jugador no gana, si no entra en ningun caso entonces
el usuario ya gano.

La otra clase que es Picross contiene ya la interaccion entre el usuario y
el tablero mediante un escaner, dentro de esta clase se manejan los
posibles errores que el usuario pudiera cometer al intentar marcar o borrar
una marca de alguna casilla. 
tablero este no debe tener el valor true
 
