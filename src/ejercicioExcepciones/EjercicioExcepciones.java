
//Cree un programa que lea un entero y lea un divisor, realice la división mostrando los números leídos y el resultado, 
//haga diversas pruebas como ingresar valores tipo texto y dividir por 0, trate las excepciones generadas.
//Cree una excepción propia cuando el entero sea menor que 10 (use if …throw new), y trátela.
package ejercicioExcepciones;
import java.util.InputMismatchException;
import java.util.Scanner;
import laboratorioExcepciones.NoValidNumber;
public class EjercicioExcepciones {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
       
      
        try{
            //Ingresa el Entero a dividir.
            System.out.println("Ingresa el Entero a Dividir");
        int entero = sc.nextInt();
        
        //Ingresa el Divisor
           System.out.println("Ingresa el Divisor.");
        int divisor = sc.nextInt();
        
          //Instanciamos la Respuesta
        int respuesta = entero/divisor;
        
            //Imprimimos las respuestas
            System.out.println("La respuesta es: "+ respuesta);
    
       //si el numero ingresado es menor a 10 ponemos nuestra propia excepción
          if (entero <10){
        throw new NoValidNumber(entero);
        } 
        
        }catch(InputMismatchException err){
            System.out.println("El Entero o El Divisor ingresado no es un número " + err.getMessage());
        }
    }
    
}
