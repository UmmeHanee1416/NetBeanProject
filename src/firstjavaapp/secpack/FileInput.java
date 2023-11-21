package firstjavaapp.secpack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("D:\\java\\fileint.docx");
            out = new FileOutputStream("G:\\New Microsoft Word Document.docx");
            int c;
            while ((c = in.read()) != -1) {
//                System.out.println(c + " " + (char) c);
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

}
