import java.io.*;

public class TesteEscrita {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);

        bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        bw.newLine();
        bw.newLine();
        bw.write("Escreveu tudim mesmo em");

        bw.close();

    }
}
