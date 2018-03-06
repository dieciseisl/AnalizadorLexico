public class Control {

public static void main (String [] args) throws Exception {
SimpleCharStream fEntrada = new SimpleCharStream (System.in);

TextoTokenManager aplicacion= new TextoTokenManager (fEntrada);

Token pieza;

boolean seguir = true;

while (seguir){
	
pieza = aplicacion.getNextToken();
	
switch (pieza.kind) {
case TextoConstants.patron1:  { System.out.println(pieza.image + "\nAprobada la asignatura\n"); break;}	//Aprobada la asignatura
case TextoConstants.patron2:  { System.out.println(pieza.image + "\nAprobada la teoría y suspensa la práctica\n"); break;}	//Aprobada la teoria y suspensa la practica
case TextoConstants.patron3:  { System.out.println(pieza.image + "\nAprobada la práctica y suspensa la teoría\n"); break;} //Aprobada la practica y suspensa la teoria
case TextoConstants.patron4:  { System.out.println(pieza.image + "\nSuspensa la teoría y suspensa la práctica\n"); break;} //Suspensa la teoria y suspensa la practica
case TextoConstants.patron5:  { System.out.println("Error léxico, falta el comentario"); break;}
case TextoConstants.patron6:  { System.out.println("Error léxico, falta el comentario"); break;}	
case TextoConstants.patron7:  { System.out.println("Error léxico, falta el comentario"); break;}
	
}
seguir = pieza.kind != TextoConstants.EOF;
}
}}