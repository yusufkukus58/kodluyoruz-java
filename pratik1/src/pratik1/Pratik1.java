/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratik1;

import java.util.Scanner;

/**
 *
 * @author yusuf
 */
public class Pratik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int k;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayı giriniz :");
        k=inp.nextInt();
        for(int i=1;i<=k;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        
    }
    
}
