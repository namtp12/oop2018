/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week9;

import java.io.File;

/**
 *
 * @author Administrator
 */
public class TestUtils {
    public static void main() {
        String filePath = "src\\week9\\file.txt";
        String folderPath = "src\\week9";
        Utils.readContentFromFile(filePath);
        Utils.writeContentToFile(filePath);
        Utils.appendContentToFile(filePath);
        //Find file
        try {
            File f = Utils.findFileByName(folderPath,"file.txt");
            System.out.println(f.getName());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}
