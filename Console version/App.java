import javax.swing.*;
import javax.swing.JFrame;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;

public class App{

    public static JFrame mainWindow;
    public static File everStarted;
    public static JComboBox itemsToCreate;

    public static void main(String[] args) {
        windowing();
    }
    public static void windowing() {
        everStarted = new File("oneStarted.txt");
        mainWindow = new JFrame("Quick Commands");
        mainWindow.setSize(500, 150);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setVisible(true);
        chekingStartingFile();
    }
    public static void chekingStartingFile() {
        
        try{
            if (everStarted.exists()) {
                everStartedApp();
            }
            if (everStarted.createNewFile()) {
                firststartPanel();
            }
        }
        catch(IOException e) {
            System.out.println("Error");
        }        
    }
    public static void firststartPanel() {
        JPanel startingPanel = new JPanel();
        JLabel welcome = new JLabel("Welcome to quick commands! Let`s create your own command!");
        JButton startButton = new JButton("Start!");
        startButton.addActionListener(new ActionListener(){        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    everStarted.createNewFile();
                    mainWindow.setSize(750, 500);
                    mainWindow.remove(startingPanel);
                    creatingFirstCmd();
                }
                catch(IOException er){
                    System.out.println("Error");
                }
            }
        });

        startingPanel.add(welcome);
        startingPanel.add(startButton);
        mainWindow.add(startingPanel);
    }
    public static void everStartedApp() {
        JPanel yourCommands = new JPanel();
        JLabel hereYourCommands = new JLabel("Here is your commands");
        yourCommands.add(hereYourCommands);
        mainWindow.add(yourCommands);
    }
    public static void creatingFirstCmd() {
        JPanel firstCmd = new JPanel();
        JPanel helpingPanel = new JPanel();
        JLabel letsCreate = new JLabel("To create your own command press 'New Command' button");
        JButton newCommand = new JButton("New Command");
        newCommand.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                mainWindow.remove(firstCmd);
                choosingCommand();
            }
        });
        firstCmd.add(letsCreate);
        helpingPanel.add(newCommand);
        helpingPanel.setLocation(375, 250);
        mainWindow.add(firstCmd);
        mainWindow.add(helpingPanel);
    }
    public static void choosingCommand() {
        JPanel choosingType = new JPanel();
        JLabel choose = new JLabel("Choose your command type with this combobox");
        String[] itemsToChoose = {
            "With Internet(opening URL, URI and more)",
            "Without Internet(opening programs and more)",
            "Both"
        };
        JComboBox choosingItems = new JComboBox<>(itemsToChoose);
        choosingType.add(choose);
        choosingType.add(choosingItems);
        mainWindow.add(choosingType);
    }
}