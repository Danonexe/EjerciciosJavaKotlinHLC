import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      int Ejercicio=0;
      Scanner scan = new Scanner(System.in);
      do{
         System.out.println("Escribe el número de ejercicio que quieres ver, escribe 0 si quieres salir");
          System.out.println("Los ejercicios de Kotlin son los 2,4,6");
          Ejercicio = scan.nextInt();
          if(Ejercicio==2){
              //Ejercicio 2 java
              int energia= 80;
              String estado = (energia >50) ? "Persona fuerte" : "Persona débil";
              System.out.println(estado);
          }
          if(Ejercicio==4){
              //Ejercicio 4 java
              for (int i=1; i<5;i++) {
                  if (i == 3) {
                    break;
                  } System.out.println("Número: "+i);
              }
          }
          if (Ejercicio==6){
              String personaje = null;
              if (personaje != null) {
                  System.out.println("El personaje es "+personaje);
              } else {
                  System.out.println("No hay personaje.");
              }
          }
      }while(Ejercicio!=0);
        System.out.println("Ejercicio realizado por Daniel Hernández Gómez");
    }
}