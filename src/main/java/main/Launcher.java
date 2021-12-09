package main;

import vista.MainGui;

import javax.swing.*;
import java.io.FileNotFoundException;



public class Launcher {
    public static void main(String[] args) throws FileNotFoundException {
       runCreator();
    }
    public static void runCreator(){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainGui GUI =  new MainGui();
                GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GUI.setVisible(true);
            }
        });
    }
}
