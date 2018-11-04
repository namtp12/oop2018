package week9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {

	public static void readContentFromFile(String path) {
            String line;
            FileReader fd = null;
            try {
                // Open file
                File file = new File(path);
                //fd = new FileReader(file);
                FileInputStream fis = new FileInputStream(file);
                InputStreamReader is = new InputStreamReader(fis);
                BufferedReader buf = new BufferedReader(is);
                
                // Read from file
                while((line = buf.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException e) {
                System.err.println("IOException");
            } finally {
                try {
                    fd.close();
                } catch (IOException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}

	public static void writeContentToFile(String path) {
            String line = null;
            FileWriter fw = null;
            try {
                //Open the file
                File file = new File(path);
                fw = new FileWriter(file);
                PrintWriter pw = new PrintWriter(fw);
                
                Scanner input = new Scanner(System.in);
                //Write to file
                while((line = input.nextLine()) != "-1") {
                    pw.write(line, 0, line.length());
                }
            } catch (IOException ex) {
                Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fw.close();
                } catch (IOException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}

	public static void appendContentToFile(String path) {

	}

	public static File findFileByName(String folderPath, String fileName) {
            return null;
	}
}
