/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Praktikum
 */
public class MainException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic heretry 
        try {
            int y[] = new int[3];
            y[3] = 11;
            int x = 7 / 0;
        } catch (ArithmeticException aie) {
            System.out.println("Pembagian nol");
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Mengakses array");
        } finally {
            System.out.println("Baris ini selalu di ");
        }
    }
    
}

class A{
    public void doA() throws FileNotFoundException {
        File file = new File("readme.dat");
        FileReader fr = new FileReader(file);
    }
    public void doB() {
        try {
            doA();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
