/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoCalculadora;

/**
 *
 * @author bruno
 */
public class Calculadora {
    
    public double Soma (double num1, double num2){
    return num1+num2;
    }
     public  double Subtrair (double num1, double num2){
    return num1-num2;
      }
      
    public  double Dividir (double num1, double num2){
    return num1/num2;
    }
    public double Multiplicar (double num1, double num2){
        double res;
        res = num1* num2;
    return res;
      }
     public String Inverso(double num){
         
    return String.format("%f7", 1/num);

     }
    public String Raiz (double num, double raiz){
        raiz = Math.sqrt(num);
 
         return String.format("%f5", raiz);
   
}  
    public double Porcentagem (double num1, double num2){
    
    return (num1 * num2)/ 100;
    }

}
