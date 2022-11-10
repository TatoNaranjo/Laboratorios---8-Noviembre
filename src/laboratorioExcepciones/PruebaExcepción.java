/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioExcepciones;

public class PruebaExcepción{

public static void main(String args[]){

formatoNumero();

}

//excepción sin tratar

public static void formatoNumero(){

int numero;

String cadena=" 1";

numero = Integer.parseInt(cadena);


 }


public static void desborde(){

int v[]= new int[3];

for(int i =0; i<5;i++){

v[i]=i;

}

}

public static void aritmetico(){

int numero=5, resultado;

resultado= numero/0;

}
}
