import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {
    public static void main(String[] args) {

        String s = "C";
        System.out.println(s.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

//        byte[] bytes = s.getBytes(StandardCharsets.US_ASCII);
        byte[] bytes = s.getBytes();
        System.out.println(bytes.length + " " + charset.displayName());
    }
}
