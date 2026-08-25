import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int numero1;
        int numero2;
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        ArrayList<String> listafinal = new ArrayList<>();
        Scanner stdin = new java.util.Scanner(System.in);

        numero1 = stdin.nextInt();
        numero2 = stdin.nextInt();
        
        for(int i =0; i< numero1;i++){
            lista1.add(stdin.next());
        }
        for(int i =0; i< numero2;i++){
            lista2.add(stdin.next());
        }

        CriaLista a = new CriaLista();
        listafinal =a.encontraMaiorSequencia(lista1, lista2);
        System.out.println( listafinal.size());
        System.out.println(listafinal );

        
        /*array oficial final e array teste
        faz no array teste, pegando o elemento e comparando com os da outra lista
        quando encontra elemento igual adiciona eno teste, e vai adicionando conforme vai achando.
        Se for maior do que está no oficial substitui
         */


    }
}
