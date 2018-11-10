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
                fd = new FileReader(file); // useless statement
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
            } finally { // useless blocks
                try {
                    fd.close(); // useless statement
                } catch (IOException ex) {
                    Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
	}

	public static void writeContentToFile(String path) {
            String line = null;
            String res;
            FileWriter fw = null;
            try {
                //Open the file
                File file = new File(path);
                fw = new FileWriter(file, false);
                PrintWriter pw = new PrintWriter(fw); // wrap "file" instead of "fw" will not work
                
                Scanner input = new Scanner(System.in);
                //Write to file
                int n = input.nextInt();
                input.nextLine(); //input.next() is't working
                res = "";
                String eol = System.getProperty("line.seperator");
                //System.out.print(eol);
                for(int i = 0; i < n; i++) {
                    line = input.nextLine();
                    res += line; // concat is't working in this context
                    res += "\r\n"; // eol character
                    //pw.write(line);
                }
                
                res.replace("\0", "");
                
                pw.write(res);
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
            FileWriter fw = null;
            String line = null, res = null;
            Scanner input;
            try {
                File f = new File(path);
                fw = new FileWriter(f, true); // append instead of overwrite
                PrintWriter pw = new PrintWriter(fw);
                
                input =  new Scanner(System.in);
                
                int n = input.nextInt();
                input.nextLine();
                
                for(int i = 0; i < n; i++) {
                    line = input.nextLine();
                    res += line;
                    res += "\r\n";
                }
                pw.write(res);
            } catch(IOException e) {
                e.printStackTrace();
            } finally {
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            
	}

	public static File findFileByName(String folderPath, String fileName) throws NullPointerException {
            File f = new File(folderPath);
            String[] fileList = f.list();
            if (f.isDirectory()) {
                for(String a : fileList) {
                    if (a.equals(fileName)) {
                        File resF = new File(f.getAbsolutePath() + "\\" + fileName);
                        return resF;
                    }
                }
            }
            return null;
	}
}
