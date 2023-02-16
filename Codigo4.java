package codigo4;
// faltaba la importacion de a Scanner
import java.util.Scanner;

public class Codigo4 {
	//faltaba el public estatic void
	public static void main(String[] args) {

	//faltaba declarar dentro de new Scanner que enra dentro del sistema osea System.in
	Scanner s = new Scanner(System.in);
    
	System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();
   // decia jugador 1 en ves de jugador 2 
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
    //aqui lo mismo no viene Sysitem in en new Scanner
    //este scanner no es necesario pero lo voy a dejar porque si 
    
    Scanner s2 = new Scanner(System.in);
    String j2 = s.nextLine();{
    	
    //aqui habia un cierre de parentesis de mas 
    if (j1 == j2) {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch(j1) {
        case "piedra":
          if (j2 == "tijeras") {
            g = 1;
          }

        case "papel":
          if (j2 == "piedra") {
            g = 1;
          }//faltaba el cierre de los corchetes
        case "tijera":
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
        default:
      }
      System.out.println("Gana el jugador " + g);
    }
    s.close();
}
}
}

