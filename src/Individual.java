import java.util.ArrayList;
import java.util.Collections;

public class Individual {
    private int arr[];
    private int numTotalDeCortes; //number of diferente lenght
    private int size;
    private int numberOfCuts;
    private Params params;



    public Individual() {

    }



    public ArrayList<Integer> listaDeItens(Params params){
        ArrayList<Integer> listaFinal = new ArrayList<>();

        for(int i = 0; i < params.getM(); i++){
            for(int j = 0; j < params.getQttPecas()[i]; j++){
                listaFinal.add(params.getCompPecas()[i]);
            }
        }

        Collections.shuffle(listaFinal);

        return listaFinal;
    }








}
