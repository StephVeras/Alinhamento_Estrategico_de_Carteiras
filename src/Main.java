import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    
    public static void main(String[] args) {
        int numero1;
        int numero2;
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        ArrayList<String> listaOficial = new ArrayList<>();
        

        ////////////// SCANNER ///////////////////////////////////////
        
        Scanner stdin = new java.util.Scanner(System.in);

        numero1 = stdin.nextInt();
        numero2 = stdin.nextInt();
        
        for(int i =0; i< numero1;i++){
            lista1.add(stdin.next());
        }
        for(int i =0; i< numero2;i++){
            lista2.add(stdin.next());
        }

        /////////////// ALGORITMO //////////////////////////////////////////////////
        Teste teste = new Teste(lista1, lista2);
        listaOficial.addAll(teste.recursivo());
        System.out.println(listaOficial.size());
        System.out.println(listaOficial.stream().collect(Collectors.joining(" ")));

    }
}
