import java.util.ArrayList;
import java.util.List;

public  class Teste {
        //private int indice1;
        private int indice2;
    
        ArrayList<Integer> indiceLista1 = new ArrayList<>();
        ArrayList<Integer> indiceLista2 = new ArrayList<>();
        ArrayList<String> lista1 = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        
        ArrayList<String> listaTeste = new ArrayList<>();
        ArrayList<String> listaOficial = new ArrayList<>();

        public Teste(List<String> lista1, List<String> lista2){
            this.lista1.addAll(lista1);
            this.lista2.addAll(lista2);
        }

        

        public ArrayList<String> recursivo(){
            for(int k=0; k<lista1.size(); k++){
                indice2 = 0;

                loopJ(k);

            }
        return listaOficial;
        }

        public void loopJ(int k){
            if(indiceLista1.size()> 0){
                indiceLista1.removeLast();
                indiceLista2.removeLast();
                indice2 = indiceLista2.getLast()+1;
            }else{
                indice2=0;
            }
            
            for(int i = k; i< lista1.size(); i++){
                    for(int j= indice2; j<lista2.size(); j++){
                        if(i< lista1.size() && lista1.get(i).equals(lista2.get(j))){
                            indiceLista2.add(j); 
                            indice2 = j+1;
                            indiceLista1.add(i);
                            i++;
                            listaTeste.add(lista2.get(j));
                        }
                    }
                }

                if(indiceLista1.size()> 0){
                    listaTeste.clear();
                    for(int i=0; i<indiceLista1.size();i++){
                        listaTeste.add(lista1.get(indiceLista1.get(i)));
                    }
                }

                if(listaTeste.size() > listaOficial.size()){
                    listaOficial.clear();
                    listaOficial.addAll(listaTeste);
                }
                listaTeste.clear();

                if(indiceLista1.size()>1){
                    loopJ(indiceLista1.getLast()+1);
                    
                }else{
                    indiceLista1.clear();
                    indiceLista2.clear();
                }
        }


}
