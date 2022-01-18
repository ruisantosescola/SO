import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Individual {
    private int arr[];
    private int cumprimentoTotaldePecas;
    private int size;
    private int numberOfCuts;
    private Params params;
    private List<Integer> listaDeCortes;
    private List<Integer> listaDeDesperdicios;
    private List<Integer> listaDeItems;



    public Individual(Params params) {
        this.params = params;
        this.listaDeCortes = new ArrayList<>();
        this.listaDeDesperdicios = new ArrayList<>();
        this.listaDeItems = new ArrayList<>();
        this.cumprimentoTotaldePecas = 0;

    }



    public void listaDeItens(){
        for(int i = 0; i < params.getM(); i++){
            cumprimentoTotaldePecas += params.getQttPecas()[i];
            for(int j = 0; j < params.getQttPecas()[i]; j++){
                listaDeItems.add(params.getCompPecas()[i]);
            }
        }
        Collections.shuffle(listaDeItems);
    }


    public void calculoCortes(){
        int sum = 0;
        int count = 0;
        for(int j = 0; j < cumprimentoTotaldePecas; j++){
            sum += listaDeItems.get(j);
            if((sum >= params.getMaxComprimento()) || (j == cumprimentoTotaldePecas-1)){
                for(int i = 0; i < count; i++){
                    if(i == count - 1){
                        if(j == cumprimentoTotaldePecas-1){
                            listaDeCortes.add(0);
                        }
                        listaDeCortes.add(1);
                        if(sum == params.getMaxComprimento()){
                            listaDeDesperdicios.add(params.getMaxComprimento() - sum );
                            listaDeCortes.remove(j - 1);
                            listaDeCortes.add(0);
                            listaDeCortes.add(1);
                            j++;
                        }else{
                            if(j == cumprimentoTotaldePecas-1){
                                listaDeDesperdicios.add(params.getMaxComprimento() - sum );
                            }else{
                                listaDeDesperdicios.add(params.getMaxComprimento() - (sum - listaDeItems.get(j)));
                            }

                        }
                        sum = 0;
                        count = -1;
                        j--;
                    }else{
                        listaDeCortes.add(0);
                    }
                }
            }
            count++;
        }
    }


    public Params getParams() {
        return params;
    }

    public List<Integer> getListaDeCortes() {
        return listaDeCortes;
    }

    public List<Integer> getListaDeDesperdicios() {
        return listaDeDesperdicios;
    }

    public List<Integer> getListaDeItems() {
        return listaDeItems;
    }
}
