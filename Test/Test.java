package Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Test {
    public void writing() {
        try {
            // Whatever the file path is.
            File statText = new File("C:/Users/noctu/OneDrive/VS Code/Java/Test/Test.txt");
            FileOutputStream is = new FileOutputStream(statText);
            OutputStreamWriter osw = new OutputStreamWriter(is);
            Writer w = new BufferedWriter(osw);
            w.write("POTATO!!!");
            w.close();
        } catch (IOException e) {
            System.err.println("Problem writing to the file statsTest.txt");
        }
    }

    public static void main(String[] args) {
        Test write = new Test();
        write.writing();
    }
}