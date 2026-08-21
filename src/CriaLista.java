import java.util.ArrayList;

public class CriaLista {
    
        ArrayList<String> listaTeste = new ArrayList<>();
        ArrayList<String> listaOficial = new ArrayList<>();

    public ArrayList<String> encontraMaiorSequencia(ArrayList<String> lista1, ArrayList<String> lista2) {

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

        return this.listaOficial;
    }
}
