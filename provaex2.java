
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
        double aumento=1.5, salario=1000, ano= 1996;
        do {
            salario = salario + (salario * aumento / 100);
            aumento = aumento *2;
            ano++;
            System.out.println("Ano: "+ ano +" Salario: "+ salario);
        } while (ano <= 2022);
        
    }
}
