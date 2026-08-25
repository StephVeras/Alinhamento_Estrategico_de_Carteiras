import java.util.ArrayList;

public class CriaLista {
    
        ArrayList<String> listaTeste = new ArrayList<>();
        ArrayList<String> listaOficial = new ArrayList<>();

    public ArrayList<String> encontraMaiorSequencia(ArrayList<String> lista1, ArrayList<String> lista2) {
        
        for(int k=0; k<lista1.size(); k++){
            int indice2 = 0;

            for(int i = k; i< lista1.size(); i++){

                for(int j= indice2; j<lista2.size(); j++){

                    if(lista1.get(i).equals(lista2.get(j))){
                        indice2 = j;
                        i++;
                        listaTeste.add(lista2.get(j));
                    }

                }

            }

            if(listaTeste.size() >= listaOficial.size()){
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