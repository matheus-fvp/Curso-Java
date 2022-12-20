package application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        
        /*Sets
         *A interface Set é um subtipo de Collection e define os comportamentos básicos que os Sets que a implementam devem ter em Java
        */

        /**
         * HashSet
         * Utiliza um HashMap - é uma estrutura associativa (chave - valor), se baseia no HashCode
         * Utiliza o codigo hash para verificar se já existe um elemento dentro do HashMap
         * Não realiza a inserção de de elementos que possuem o mesmo HashCode
         * Não garante que os elementos serão exibidos na ordem em que a inserção foi realizada
        */
        Set<Integer> setNumbers = new HashSet<>();
        setNumbers.add(10);
        setNumbers.add(20);
        setNumbers.add(2);
        System.out.println(setNumbers);
        setNumbers.add(2);
        System.out.println(setNumbers);
        for(int i : setNumbers) {
            System.out.println(i);
        }

        /**
         * O LinkedHashSet garante que a ordem de exibição dos elementos será a mesma a ordem de inserção.
         * Internamente realiza a implementação de um LinkedHashMap que garante que a ordem das chaves sejam respeitadas  
         */

        System.out.println("====================LinkedHashSet======================");
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        for(int i : set2) {
            System.out.println(i);
        }
    }
}
