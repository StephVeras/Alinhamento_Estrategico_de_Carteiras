import java.util.ArrayList;

public class CriaLista {
    
        ArrayList<String> listaTeste = new ArrayList<>();
        ArrayList<String> listaOficial = new ArrayList<>();

    public ArrayList<String> encontraMaiorSequencia(ArrayList<String> lista1, ArrayList<String> lista2) {
        
        for(int k=0; k<lista1.size(); k++){
            int indice2 = 0;
            System.out.println("Loop k " + k);

            for(int i = k; i< lista1.size(); i++){
                System.out.println("Loop i " + i);
                
                for(int j= indice2; j<lista2.size(); j++){
                    System.out.println("Loop j " + j);
                    
                    if(i< lista1.size() && lista1.get(i).equals(lista2.get(j))){
                        System.out.println("entrou no if");
                        indice2 = j;
                        i++;
                        listaTeste.add(lista2.get(j));
                        System.out.println("indice novo do i " + i);
                    }

                }

            }

            if(listaTeste.size() > listaOficial.size()){
                //listaOficial = listaTeste;
                listaOficial.clear();
                listaOficial.addAll(listaTeste);
            }
            listaTeste.clear();

        }

        return this.listaOficial;
    }
}

/*
for(int i =0; i< lista1.size();i++){
                String teste = lista1.get(i);
                
                for(int j=0; j<lista2.size();j++){
                    if(lista2.get(j) == lista1.get(i)){
                        this.listaTeste.add(lista2.get(j));
                        break;
                    }
                }
            }
            if( this.listaTeste.size()> this.listaOficial.size()){
                this.listaOficial = listaTeste;
            }
 */