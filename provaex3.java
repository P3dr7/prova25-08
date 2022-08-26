
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinfo
 */
public class provaex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = 0, h, m, s;
        float massac, massaf;
        System.out.println("Massa em gramas: ");
        massac = sc.nextFloat();
        massaf = massac;
        
        while(massac >= 0.5){
            massaf /=2;
            tempo +=50;
        }
        System.out.println("Massa Inicial "+ massac+ " gramas");
        System.out.println("Massa Final "+ massaf+ " gramas");
        h = (tempo / 3600);
        m = (tempo % 3600)/60;
        s = (tempo % 3600) % 60;
        System.out.println(h+ "horas, "+ m +" minutos, "+s+" segundo.");
    }
}
