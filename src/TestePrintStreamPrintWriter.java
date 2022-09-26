import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {

//        FileOutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osr = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osr);

//        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));

        PrintStream ps = new PrintStream("lorem2.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("Escreveu tudim mesmo em");

        ps.close();

    }
}
