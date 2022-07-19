/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lbm.compradepaquetes;

import java.util.Scanner;

/**
 *
 * @author MenDark
 */
public class LBMCompraDePaquetes {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
         double total;
        System.out.print("Ingresar cantidad de Dinero: ");
        total = sc.nextInt();
        
        if(total >= 50000){
            System.out.print("Si puede comprar el Paquete A");
        }else{
                if(total >=20000){
                    System.out.print("Si puede comprar el Paquete B");

                    
                }else{
                    if(total >=10000){
                        System.out.print("Si puede comprar el Paquete C");
                      }
                    else{
                         System.out.print("Si puede comprar el Paquete D");
                }
            }
                
        }
    }
    
}
