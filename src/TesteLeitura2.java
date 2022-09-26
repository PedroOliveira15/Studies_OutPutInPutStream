import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner( new File("contas.csv"));

        while (scanner.hasNextLine()){
            String linha = scanner.nextLine();
//            System.out.println(linha);

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");


            String valor1 = linhaScanner.next();
//            String.format("",valor1,valor2 ...);
            //System.out.println(valor1 + ", " + valor2 ...);
            System.out.println(valor1);

            linhaScanner.close();

        }
        scanner.close();
    }
}
