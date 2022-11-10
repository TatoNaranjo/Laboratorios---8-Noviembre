/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorioExcepciones;

public class NoValidNumber extends RuntimeException{
    protected int valorInvalido;
    public NoValidNumber(int valorInvalido){
    this.valorInvalido = valorInvalido;       
    }
    
    public int  getValorInvalido(){
    return valorInvalido;
    }
}
