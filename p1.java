/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pc1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class p1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int maior, menor;

        System.out.println("Informe o nÃºmero 1: ");
        n1 = sc.nextInt();

        maior = n1;
        menor = n1;

        System.out.println("Informe o nÃºmero 2: ");
        n2 = sc.nextInt();

        if (n2 < menor) {
            menor = n2;
        }

        if (n2 > maior) {
            maior = n2;
        }

        System.out.println("Informe o nÃºmero 3: ");
        n3 = sc.nextInt();

        if (n3 < menor) {
            menor = n3;
        }

        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("Informe o nÃºmero 4: ");
        n4 = sc.nextInt();

        if (n4 < menor) {
            menor = n4;
        }
        
        if (n4 > maior) {
            maior = n4;
        }
        
        System.out.println("Informe o nÃºmero 5 :");
        n5 = sc.nextInt();
        
        if (n5 < menor) {
            menor = n5;
        }
        
        if (n5 > maior) {
            maior = n5;
        }
        
        System.out.println("Maior: " + maior + " menor:  " + menor);

    }
}
