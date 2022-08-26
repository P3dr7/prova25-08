
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinfo
 */
public class provaex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double aumento, salario;
        
        salario=1000;
        aumento= 1.5;
        
        for (int a = 1995; 2022 > a; a++) {
           salario = salario + (salario * aumento / 100);
            aumento = aumento *2;
            a++;
            System.out.println("O salario dele no ano de: "+a+ " foi de: "+ salario); 
            
        }
    }
}

