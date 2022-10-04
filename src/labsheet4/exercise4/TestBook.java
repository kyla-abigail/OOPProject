package labsheet4.exercise4;

import labsheet4.exercise3.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook {
    JTextArea textArea;
    public static void main(String[] args) {

        String output = "";

        String book1 = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        String price1 = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        String ISBN1 = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        String page1 = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book");
        Book c1 = new Book(book1,Double.parseDouble(price1),ISBN1,Integer.parseInt(page1));

        output += "Calling the no-argument Computer constructor." +
                "The first Computer object details are:\n\n" + c1.toString();

        String book2 = JOptionPane.showInputDialog("Please enter the title of your favourite book");
        String price2 = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        String ISBN2 = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        String page2 = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book");

        Book c2 = new Book(book2,Double.parseDouble(price2), ISBN2, Integer.parseInt(page2));


        output += "\n\nCalling the multi-argument Computer constructor." +
                "The second Computer object details are: \n\n" + c2.toString();

        /*Book c3 = new Book("Apple", 3.65, "Tablet", 500);


        output += "\n\nCalling the multi-argument Computer constructor." +
                "The second Computer object details are: \n\n" + c3.toString();*/
        JOptionPane.showMessageDialog(null, output, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
