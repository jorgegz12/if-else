
package pkgif.pkgelse;

import java.util.Scanner;


public class operacion {
int numero1;
int numero2;
int suma;
int resta;
public void leerNumero(){
 Scanner scan = new Scanner(System.in);
System.out.println("Escriba el primer numero");
 numero1 = scan.nextInt();
 System.out.println("Escriba el segundo numero");
numero2 = scan.nextInt();    
}
public void sumar (){
suma = numero1 + numero2;
}
public void restar (){
resta = numero1 - numero2;
}
public void mostrarResultados (){
System.out.println("la suma es:"+ suma);
System.out.println("la resta es:"+ resta);
}
   
    }

    
    

