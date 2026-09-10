import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;

        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        
        ArrayList<String> listaTeste = new ArrayList<>();
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
        
        for(int k=0; k<lista1.size(); k++){
            int indice2 = 0;

            for(int i = k; i< lista1.size(); i++){
                
                for(int j= indice2; j<lista2.size(); j++){
                    
                    if(i< lista1.size() && lista1.get(i).equals(lista2.get(j))){
                        indice2 = j +1;
                        i++;
                        listaTeste.add(lista2.get(j));
                    }

                }

            }

            if(listaTeste.size() > listaOficial.size()){
                listaOficial.clear();
                listaOficial.addAll(listaTeste);
            }
            listaTeste.clear();

        }

        /////////////////////////////////////////////////////////////////////////////
        
        System.out.println( listaOficial.size());
        System.out.println(String.join(" ", listaOficial));


    }
}
