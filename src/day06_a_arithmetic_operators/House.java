package day06_a_arithmetic_operators;

public class House {
    public static void main (String[] args){
        /* Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3

         */
  String houseType = "Townhouse";
  int bedrooms = 4;
  int bathrooms = 3;
  int kitchen = 2;
  boolean hasBasement = true;
  boolean hasAttic = false;
  boolean forSale = false;
  double price = 999999.99; // in number, we can use "_" for more readble Java will ignor it
  String address = "123 Central Park";
  int zipcode = 123456;
  boolean parkNearBy = true;
  double rating = 9.5;
  String result = "The " + houseType+ " on " + address+ "," +zipcode+ "\n coast $" +price+ "The "
+ houseType + "has" + bedrooms+ " bedroom,has   " + bathrooms+ " bathrooms and has"+ kitchen+ " kitchens and has a "+hasAttic+ "\n also inculuding basmant";
        System.out.println(result);



    }



}
