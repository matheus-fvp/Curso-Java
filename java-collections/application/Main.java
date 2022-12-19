package application;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        /*
        //Collection é a interface raiz da hierarquia da API Collections do Java.
        Collection<Integer> numbers = new ArrayList<>(List.of(1, 20, 4, 50, 60)); //ArrayList é um subtipo de Collection
        Collection<Integer> numbers2 = new ArrayList<>(List.of(11, 23, 33, 20));
        numbers.add(12); //adiciona um elemento a coleção
        System.out.println(numbers);
        numbers.addAll(numbers2); //insere todos os elementos da coleção numbers2 na coleção numbers. ArrayList permite repetição de valores.
        System.out.println(numbers);
        numbers2.clear(); //remove todos os elementos da coleção
        System.out.println(numbers2);
        System.out.println(numbers.contains(12)); //verifica se um determinado elemento pertence a coleção
        System.out.println(numbers.containsAll(List.of(1, 50, 100))); //verifica se a coleção numbers possui todos os elementos da coleção fornecida como parametro
        System.out.println(numbers.equals(numbers2)); //compara o endereço de memoria das coleções para verificar se elas são identicas
        System.out.println(numbers2.isEmpty()); //verifica se a coleção é vazia

        Iterator<Integer> it = numbers.iterator(); //obtem um iterator para percorrer a coleção

        while(it.hasNext()) { //percorre a coleção enquanto existir elementos 
            System.out.print(it.next() + " "); //obtém o elemento no qual o iterator aponta
        }
        System.out.println("");

        numbers.remove(20); //removea primeira ocorrencia um determinado elemento da coleção
        System.out.println(numbers);

        numbers.removeAll(List.of(1, 100)); //remove da coleção numbers todos os elementos que estão na coleção passada como parametro
        System.out.println(numbers);

        numbers.removeIf(p -> p % 2 != 0); //remove da coleção todos os numeros impares
        System.out.println(numbers);

        numbers2.addAll(List.of(4, 50, 60));
        numbers.retainAll(numbers2); //mantem na coleção numbers apenas os elementos que estão na coleção numbers2
        System.out.println(numbers);
        System.out.println(numbers.size()); //obtém a quantidade de elementos de uma coleção

        Integer[] b = new Integer[numbers.size()];
        b = numbers.toArray(b); //converte a coleção para um Array
        for(Integer i : b) {
            System.out.print(i + " ");
        }
        System.out.println("");*/


        /**
         * Interface List
         * É um subtipo da interface Collection
         * É um representação de uma coleção em que os elementos são inseridos de forma sequencial e a ordem de inserção é mantida
         * Permite elementos duplicados.
         * Elementos são acessados por índices
         * É uma coleção mais especifica do que a interface Collection
         * ArrayList e LinkedList são classes que implementam a interface List 
         * */ 

        List<String> nomes = new LinkedList<>(List.of("Pedro", "André", "Tiago", "João", "Filipe", "Bartolomeu", "Tomé", "Mateus", "Judas", "Tiago"));

        System.out.println(nomes.get(1)); //obtém o elemento que está indexado na posição 1 da lista de elementos
        System.out.println(nomes.indexOf("Tiago")); //retorna o indice da primeira ocorrencia do elemento na lista 
        System.out.println(nomes.lastIndexOf("Tiago")); //obtém o indice daultima ocorrencia na lista do elemento fornecido como parametro 

        ListIterator<String> nomesIt = nomes.listIterator(nomes.size()); //obtém um iterator especifico para percorrer listas em uma posição especifica

        while(nomesIt.hasPrevious()) { //percorre a lista em ordem inversa
            System.out.print(nomesIt.previous() + " ");
        }

        System.out.println("");

        nomes.remove(8); //remove um elemento de uma posição especifica
        System.out.println(nomes);

        nomes.set(8, "Paulo");
        System.out.println(nomes); //realiza a troca de elementos de uma determinda posição

        List<String> nomes2 = nomes.subList(0, 3); //recupera uma sublista da lista original
        System.out.println(nomes2);




    }
    
}