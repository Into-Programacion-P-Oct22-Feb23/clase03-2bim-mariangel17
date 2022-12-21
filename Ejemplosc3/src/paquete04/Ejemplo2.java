/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de arreglo bidimensionales
        
        double [][] resultado=new double[2][3];
        double[][] dato1 = {{1, 2, 3},{6, 8, 9}}; //
        /*
            1   4   3
            36  64  9
        */
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                if(dato1[i][j]%2==0){
                    resultado[i][j]=Math.pow(dato1[i][j],2);
                }else {
                    resultado[i][j]=dato1[i][j];
                }
           
        }    
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%0.f\t",resultado[i][j]);
                
            }    
        }
    }
    
    
    
    
}
