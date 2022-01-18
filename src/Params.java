import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Params {

    private int m;
    private int maxComprimento;
    private int[] compPecas;
    private int[] qttPecas;

    public Params() {
        this.m = 0;
        this.maxComprimento = 0;
    }


    //Read File
    public static Params readfile(String fileName) {
        Params result = new Params();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            result.m = scanner.nextInt();
            result.maxComprimento = scanner.nextInt();
            result.compPecas = new int[result.m];
            result.qttPecas = new int[result.m];
            for (int i = 0; i < result.m; i++) {
                result.compPecas[i] = scanner.nextInt();
            }
            for (int i = 0; i < result.m; i++) {
                result.qttPecas[i] = scanner.nextInt();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int getM() {
        return m;
    }

    public int getMaxComprimento() {
        return maxComprimento;
    }

    public int[] getCompPecas() {
        return compPecas;
    }

    public int[] getQttPecas() {
        return qttPecas;
    }

}
