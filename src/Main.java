import javax.swing.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------FX contacts---------------------");
        app();

    }
    public static void app()
    {
        System.out.println("--------------------------FX contacts---------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the contact name: ");
        String name = sc.next();
        System.out.println("Enter the phone number");
        String phone= sc.next();
        String filepath="contacts.csv";
        saveRecord(name,phone,filepath);
    }
    public static void saveRecord(String name,String phone,String filepath){
        try {
            FileWriter fw= new FileWriter(filepath,true);
            BufferedWriter bw= new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(name+","+phone);
            pw.flush();
            Scanner sc = new Scanner(System.in);
            System.out.println("Do you want to add another contact? Press 1 to continue");
            int prompt = sc.nextInt();
            if (prompt==1){
                app();
            }
            pw.close();

            JOptionPane.showMessageDialog(null,"Record Saved");





        } catch (Exception e) {

        }
    }
}
