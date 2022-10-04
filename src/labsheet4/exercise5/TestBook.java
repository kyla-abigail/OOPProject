package labsheet4.exercise5;

import labsheet4.exercise3.Book;

import javax.swing.*;
import java.awt.*;

public class TestBook extends JFrame {

    public static void main(String[] args) {
        String output = "";

        JTextArea textArea = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        textArea.setFont(font);

        textArea.setText(String.format("%-25s%-9s%-15s%s+" ,"Title","Price","ISBN","Pages"));

        String book1 =JOptionPane.showInputDialog("Please enter the title of your favourite book");
        String price1 = JOptionPane.showInputDialog("Please enter the price of your favourite book");
        String ISBN1 = JOptionPane.showInputDialog("Please enter the ISBN of your favourite book");
        String page1 = JOptionPane.showInputDialog("Please enter the number of pages in your favourite book");

        double pricing =Double.parseDouble(price1);
        Book c1 = new Book(book1,Double.parseDouble(price1),ISBN1,Integer.parseInt(page1));

        output += String.format("\n\n%-25s%-9.2f%-15s%d",c1.getTitle(),c1.getPrice(),c1.getISBN(),c1.getPages());

        String book2 = JOptionPane.showInputDialog("Please enter the title of your least favourite book");
        String price2 = JOptionPane.showInputDialog("Please enter the price of your least favourite book");
        String ISBN2 = JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book");
        String page2 = JOptionPane.showInputDialog("Please enter the number of pages in your least favourite book");

        Book c2 = new Book(book2,Double.parseDouble(price2), ISBN2, Integer.parseInt(page2));
        c2.setTitle(book2);
        c2.setPrice(Double.parseDouble(price2));
        c2.setISBN(ISBN2);
        c2.setPages(Integer.parseInt(page2));

        output += String.format("\n\n%-25s%-9.2f%-15s%d",c2.getTitle(),c2.getPrice(),c2.getISBN(),c2.getPages());
        textArea.append(output);
        /*Book c3 = new Book("Apple", 3.65, "Tablet", 500);


        output += "\n\nCalling the multi-argument Computer constructor." +
                "The second Computer object details are: \n\n" + c3.toString();*/
        JOptionPane.showMessageDialog(null, textArea, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
