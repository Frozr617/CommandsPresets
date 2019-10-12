import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.Scanner;

public class Main{

    public static File onesStarted;

    public static void main(String[] args) {
        onesStarted = new File("./Commands/EverStarted.txt");
    }
    public static void startingApp(){
        try{
            try{
                if (onesStarted.exists()) {
                    System.out.println("Started!");
                }
                if (onesStarted.createNewFile()) {
                    System.out.println("Please choose the type of a command: \n1.With Net\n2.Without Net\n2.Both");
                    Scanner choosing = new Scanner(System.in);
                    int choose = choosing.nextInt();
                    if (choose == 1) {
                        creatingWithNet();
                    }
                    else if (choose == 2) {
                        creatingWithoutNet();
                    }
                    else if (choose == 3) {
                        creatingBoth();
                    }
                    else{
                        System.out.println("Try to restart the app and try again!");
                    }
                }
            }
            catch(IOException e) {
                System.out.println("Error");
            }
        }
        catch(NullPointerException er) {
            System.out.println("Null Pointer error!");
        } 
    }
    public static void creatingWithNet() {
        System.out.println("You chose creating with net command!(url`s, uri`s and more)");
    }
    public static void creatingWithoutNet() {
        System.out.println("You chose creating without net command!(apps, files, and mroe)");
    }
    public static void creatingBoth() {
        System.out.println("You chose creating combine command!(files, apps, uri`s, url`s and more)");
    }
}