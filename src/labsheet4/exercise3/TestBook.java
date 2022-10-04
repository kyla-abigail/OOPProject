package labsheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        labsheet4.exercise4.Book c1 = new labsheet4.exercise4.Book();

        output += "Calling the no-argument Computer constructor." +
                "The first Computer object details are:\n\n" + c1.toString();

        labsheet4.exercise4.Book c2 = new labsheet4.exercise4.Book("The Davinci Code", 19.99, "3452617232", 348);


        output += "\n\nCalling the multi-argument Computer constructor." +
                "The second Computer object details are: \n\n" + c2.toString();

            /*Book c3 = new Book("Apple", 3.65, "Tablet", 500);


            output += "\n\nCalling the multi-argument Computer constructor." +
                    "The second Computer object details are: \n\n" + c3.toString();*/
        JOptionPane.showMessageDialog(null, output, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
