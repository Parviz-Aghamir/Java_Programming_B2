package day11_if_statements;

public class AmazonPrime {
            /*
        Task:
            declare and assign a price variable
            declare and assign a boolean - hasPrime variable
            possible outputs:
                prime member:
                    Eligible for 2 day shipping not prime and item price is more than or equal 25:
                    Eligible for regular free shipping not prime and item price is less than 25:
                    Not eligible for free shipping. Shipping fee: 3.99
         */
            public static void main(String[] args) {
                double price = 20.0;
                boolean hasPrime = true;
                double shipping = 3.99;
                String message = "";
                if (hasPrime) {
                    message = "Eligible for 2 day shipping";

                } else  {
                    if (price>=25){
                        message = "Eligible for regular free shipping";

                    }else{
                        message ="Not eligible for free shipping. Shipping fee: 3.99";
                    }
                }
                System.out.println(message);
System.out.println("-------------------");


                if (hasPrime) {
                    message = "Eligible for 2 day shipping";

                } else if (!hasPrime && price>=25) {
                     message = "Eligible for regular free shipping";
                    }else if (!hasPrime && price<25){
                        message ="Not eligible for free shipping. Shipping fee: 3.99";
                    }
                System.out.println(message);









                }









            }














