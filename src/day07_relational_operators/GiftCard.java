package day07_relational_operators;

public class GiftCard {

    public static void main(String[] args) {
                /*

            Task:
                declare and assign a gift card with 200
                buy 2 items.
                buy item 1 for x price and subtract from your gift card
                buy item 2 for x price and subtract from your gift card
                print the remaining balance of your gift card

                100
                40

     */
        double giftCardBalance = 200;
        double item2nd = 50;
        System.out.println("buy item 1 for $100");
        giftCardBalance -= 100;
        System.out.println("buy item 2 for" +item2nd);
        giftCardBalance -= item2nd;
        System.out.println(giftCardBalance);




        }
    }

