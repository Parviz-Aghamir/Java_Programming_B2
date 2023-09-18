package day05_variable;
/*
        create a class CellPhone
        create a main method
        declare and assign these variables:
            brand, model, color, price, storage, hasCamera, sim(char A, B, C)

        Print all the variables

            sample data: apple, iphone 10, black, 1000.99, 128, true, A
     */
public class CellPhone {

    public static void main (String [] args){
        String brand = "Apple";
        String model = "Iphone 14 pro-max";
        String colour = "Black";
        double price = 1999.99;
        int storge = 128;
        boolean hasCamera = true;
        char sim = 'A';
        System.out.println();
        System.out.println();

        System.out.println("I have an " + model + " from "+ brand);
        System.out.println("It came in the colour of  "+ colour+ " and it is has a "+ storge + " GB");
        System.out.println("For the sim type " + sim+ " with camera "+ hasCamera+ " total price was $" +price);

        System.out.println();
        System.out.println();

    String fullMessage="I have an " + model + " from "+ brand + "\nIt came in the colour of  "+ colour+ " and it is has a "+ storge + " GB" + "\nFor the sim type " + sim+ " with camera "+ hasCamera+ " total price was $" +price;


    System.out.println(fullMessage);
    }
}
