
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author labinfo
 */
public class provaex1 {
    static int retornaMaior(int[] vetor){
	    int maior = vetor[0];
	    for (int i = 1 ; i < vetor.length; i++){
	       if (vetor[i] > maior){
	           maior = vetor[i];
	       } 
	    }
	    return(maior);
	}
	
	static int retornaMenor(int[] vetor){
	    int menor = vetor[0];
	    for (int i = 1 ; i < vetor.length; i++){
	       if (vetor[i] < menor){
	           menor = vetor[i];
	       } 
	    }
	    return(menor);
	}
	
	public static void main(String[] args) {
		
		int[] vetor = new int[5];
		Scanner dados = new Scanner(System.in);
		    
		    for (int i = 0 ; i < 5; i++){
		        System.out.println("digite o " + (i + 1) + "ª valor: ");
		    	vetor[i] = dados.nextInt();
		    }
		    
		    System.out.println("maior valor:" + retornaMaior(vetor));
		    System.out.println("menor valor:" + retornaMenor(vetor));
	}
}
