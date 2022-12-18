import javax.swing.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        System.out.println("--------------------------FX contacts---------------------");
        app();

    }
    public static void app()
    {
        System.out.println("--------------------------FX contacts---------------------");
        String name = JOptionPane.showInputDialog("Enter the contact's name");
        String phone= JOptionPane.showInputDialog("Enter the contact number");
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
            pw.close();

            JOptionPane.showMessageDialog(null,"Record Saved");

            int prompt = Integer.parseInt(JOptionPane.showInputDialog("Do you want to add another contact? Press 1 to continue"));
            if (prompt==1){
                app();
            }





        } catch (Exception e) {

        }
    }
}
