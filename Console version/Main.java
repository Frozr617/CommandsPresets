import java.io.*;
import java.awt.*;
import java.net.*;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main{

    public static File everStarted;
    public static File withNetFolder;
    public static File withoutNetFolder;
    public static File both;
    public static int choose;
    public static String uri1;
    public static String uri2;
    public static String uri3;
    public static String uri4;
    public static BufferedWriter fileWriter;
    public static BufferedWriter fileWriter1;
    public static Scanner howManyApps;
    public static int manyApps;
    public static String path1;
    public static String path2;
    public static String path3;
    public static String path4;
    

    public static void main(String[] args) {
        withNetFolder = new File("./withNet");
        withoutNetFolder = new File("./withoutNet");
        both = new File("./both");
        everStarted  = new File("onesStarted.txt");
        checkingStartingFiles();
    }
    public static void checkingStartingFiles() {
        try {
            if (everStarted.exists()) {
                System.out.println("Ever Started!");
            }
            else if (everStarted.createNewFile()) {
                firstStart();
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
    public static void firstStart() {        
        withNetFolder.mkdir();
        withoutNetFolder.mkdir();
        both.mkdir();
        System.out.println("Hello! This app will automate you day\nLet`s start by making your own command");
        System.out.println("Choose type of command:\n1.With Internet(opening URL`s and having some activity with them)\n2.Without Internet(opening apps and files)\n2.Both");
        Scanner choosing = new Scanner(System.in);
        choose = choosing.nextInt();
        if (choose == 1) {
            creatingCommandWithNet();
        };
        if (choose == 2) {
            creatingCommandWithoutNet();
        };
        if (choose == 3) {
            creatingCombineCommand();
        };
    }
    public static void creatingCommandWithNet() {
        System.out.println("Type the number of URL`s of URI`s in your command: ");
        Scanner howManyURI = new Scanner(System.in);
        int numberOfURI = howManyURI.nextInt();
        //-------------------------------------        
        if (numberOfURI == 1) {
            try{
                System.out.println("Enter the first URI: ");
                Scanner uri1Taker = new Scanner(System.in);
                uri1 = uri1Taker.nextLine();
                System.out.println(uri1);
            }
            catch(InputMismatchException e) {
                System.out.println("Error");
            }
        }
        else if (numberOfURI == 2) {            
            System.out.println("Enter the first URI: ");
            Scanner uri1Taker = new Scanner(System.in);
           uri1 = uri1Taker.nextLine();
            System.out.println(uri1);
            System.out.println("Enter the second URI: ");
            Scanner uri2Taker = new Scanner(System.in);
            uri2 = uri1Taker.nextLine();
            System.out.println(uri2);
        }
        else if (numberOfURI == 3) {
            System.out.println("Enter the first URI: ");
            Scanner uri1Taker = new Scanner(System.in);
            uri1 = uri1Taker.nextLine();
            System.out.println(uri1);
            System.out.println("Enter the second URI: ");
            Scanner uri2Taker = new Scanner(System.in);
            uri2 = uri1Taker.nextLine();
            System.out.println(uri2);
            System.out.println("Enter the third URI: ");
            Scanner uri3Taker = new Scanner(System.in);
            uri3 = uri1Taker.nextLine();
            System.out.println(uri3);
        }
        else if (numberOfURI == 4) {
            System.out.println("Enter the first URI: ");
            Scanner uri1Taker = new Scanner(System.in);
            uri1 = uri1Taker.nextLine();
            System.out.println(uri1);
            System.out.println("Enter the second URI: ");
            Scanner uri2Taker = new Scanner(System.in);
            uri2 = uri1Taker.nextLine();
            System.out.println(uri2);
            System.out.println("Enter the third URI: ");
            Scanner uri3Taker = new Scanner(System.in);
            uri3 = uri1Taker.nextLine();
            System.out.println(uri3);
            System.out.println("Enter the fourth URI: ");
            Scanner uri4Taker = new Scanner(System.in);
            uri4 = uri1Taker.nextLine();
            System.out.println(uri4);
        }
        System.out.println("Do you wnat to save this command?\n1.Yes\n2.No");
        Scanner wantToSave = new Scanner(System.in);
        if (wantToSave.nextInt() == 1) {
            System.out.println("Type the name of your command: ");
            Scanner nameOfCommand = new Scanner(System.in);
            File command;
            try{
                command = new File("./withNet/" + nameOfCommand.nextLine() + ".txt");
                command.createNewFile();
                fileWriter = new BufferedWriter(new FileWriter(command));
                if (numberOfURI == 1) {
                    fileWriter.write(uri1);
                    fileWriter.close();
                }
                if (numberOfURI == 2) {
                    fileWriter.write(uri1);
                    fileWriter.newLine();
                    fileWriter.write(uri2);
                    fileWriter.close();
                }
                if (numberOfURI == 3) {
                    fileWriter.write(uri1);
                    fileWriter.newLine();
                    fileWriter.write(uri2);
                    fileWriter.newLine();
                    fileWriter.write(uri3);
                    fileWriter.newLine();
                    fileWriter.close();
                }
                if (numberOfURI == 4) {
                    fileWriter.write(uri1);
                    fileWriter.newLine();
                    fileWriter.write(uri2);
                    fileWriter.newLine();
                    fileWriter.write(uri3);
                    fileWriter.newLine();
                    fileWriter.write(uri4);
                    fileWriter.close();
                }
                System.out.println("Command succesfuly saved!");
            }
            catch(IOException e) {
                System.out.println("Error");
            }
        }
    }
    public static void creatingCommandWithoutNet(){
        System.out.println("How many programs or files do you want to start?");
        howManyApps = new Scanner(System.in);
        manyApps = howManyApps.nextInt();
        try{
            if (manyApps == 1) {
                System.out.println("Give me the path for the first app or file: ");
                Scanner pathToApp1 = new Scanner(System.in);
                path1 = pathToApp1.nextLine();

            }
            if (manyApps == 2) {
                System.out.println("Give me the path for the first app or file: ");
                Scanner pathToApp1 = new Scanner(System.in);
                path1 = pathToApp1.nextLine();
                System.out.println("Give me the path for the second app or file: ");
                Scanner pathToApp2 = new Scanner(System.in);
                path2 = pathToApp2.nextLine();
                
            }
            if (manyApps == 3) {
                System.out.println("Give me the path for the first app or file: ");
                Scanner pathToApp1 = new Scanner(System.in);
                path1 = pathToApp1.nextLine();
                System.out.println("Give me the path for the second app or file: ");
                Scanner pathToApp2 = new Scanner(System.in);
                path2 = pathToApp2.nextLine();
                System.out.println("Give me the path for the third app or file: ");
                Scanner pathToApp3 = new Scanner(System.in);
                path3 = pathToApp3.nextLine();
                
            }
            if (manyApps == 4) {
                System.out.println("Give me the path for the first app or file: ");
                Scanner pathToApp1 = new Scanner(System.in);
                path1 = pathToApp1.nextLine();
                System.out.println("Give me the path for the second app or file: ");
                Scanner pathToApp2 = new Scanner(System.in);
                path2 = pathToApp2.nextLine();
                System.out.println("Give me the path for the third app or file: ");
                Scanner pathToApp3 = new Scanner(System.in);
                path3 = pathToApp3.nextLine();
                System.out.println("Give me the path for the fourth app or file: ");
                Scanner pathToApp4 = new Scanner(System.in);
                path4 = pathToApp4.nextLine();            
            }
            System.out.println("Do you wnat to save this command?\n1.Yes\n2.No");
            Scanner wantToSave = new Scanner(System.in);
            if (wantToSave.nextInt() == 1) {
                System.out.println("Type the name of command: ");
                Scanner nameOfCommand1 = new Scanner(System.in);
                String commandName = nameOfCommand1.nextLine();
                try{
                    File command1;
                    command1 = new File("./withoutNet/" + commandName + ".txt");
                    command1.createNewFile();
                    fileWriter1 = new BufferedWriter(new FileWriter(command1));
                    if (wantToSave.nextInt() == 1) {
                        if (manyApps == 1) {
                            fileWriter1.write(path1);
                            fileWriter1.close();
                        }
                        if (manyApps == 2) {
                            fileWriter1.write(path1);
                            fileWriter1.newLine();
                            fileWriter1.write(path2);
                            fileWriter1.close();
                        }
                        if (manyApps == 3) {
                            fileWriter1.write(path1);
                            fileWriter1.newLine();
                            fileWriter1.write(path2);
                            fileWriter1.newLine();
                            fileWriter1.write(path3);
                            fileWriter1.close();
                        }
                        if (manyApps == 4) {
                            fileWriter1.write(path1);
                            fileWriter1.newLine();
                            fileWriter1.write(path2);
                            fileWriter1.newLine();
                            fileWriter1.write(path3);
                            fileWriter1.newLine();
                            fileWriter1.write(path4);
                            fileWriter1.close();
                        }
                        System.out.println("Command succesfully saved!");
                    }
                }
                catch(IOException e) {
                    System.out.println("Error");
                }
            }
        }
        catch(InputMismatchException er) {
            System.out.println("Error");
        }
    }
    public static void creatingCombineCommand(){
        System.out.println("Both");
    }
}