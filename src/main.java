

public class main {


    public static void main(String[] args) {
        Params params = Params.readfile("src/pcu_tests_tp2/prob03.txt");
        Individual individual = new Individual(params);

        individual.listaDeItens();
        individual.calculoCortes();

        System.out.println(individual.getListaDeItems());
        System.out.println(individual.getListaDeCortes());
        System.out.println(individual.getListaDeDesperdicios());



    }






}
