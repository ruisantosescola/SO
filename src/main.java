

public class main {


    public static void main(String[] args) {
        Params params = Params.readfile("src/pcu_tests_tp2/prob03.txt");
        Individual individual = new Individual();


        System.out.println(individual.listaDeItens(params));

    }






}
