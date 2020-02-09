/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;
import model.Aluno;
/**
 *
 * @author renoa
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Aluno> nomes = new ArrayList();
        
        System.out.println("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.println("Digite aa idade do aluno: ");
        int idade = input.nextInt();
                input.nextLine();
                
        Aluno aluno = new Aluno(nome, idade);
        nomes.add(aluno);
        
        System.out.println(nomes.get(0).getIdade());
        System.out.println(nomes.get(0).getNome());

    }
    
}
