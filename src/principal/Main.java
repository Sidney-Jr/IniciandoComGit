/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author renoa
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList();
        
        System.out.print("Quantos nomes você vai cadastrar: ");
        int size = input.nextInt();
        input.nextLine();
        
        for (int i = 0; i < size; i++) {
            System.out.print("Digite o "+(i+1)+" nome: ");
            String nome = input.nextLine();
            nomes.add(nome);
        }
        
        for (String nome : nomes) {
            System.out.println("Nome "+ nome);
        }
        
    }
    
}
