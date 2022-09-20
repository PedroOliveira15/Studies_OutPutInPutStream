import java.io.*;

public class TesteCopiarArquivoSystemIn {
    public static void main(String[] args) throws IOException {

        InputStream fis = System.in;
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        OutputStream fos = new FileOutputStream("loremIn.txt"); //System.Out
        Writer osr = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osr);

        while (linha != null && !linha.isEmpty()){
            //System.out.println(linha);
            bw.write(linha);
            bw.newLine();
            linha = br.readLine();
        }
        br.close();
        bw.close();

    }
}
