package day07_relational_operators;

public class Pizza {
/*  create a class Pizza
        add a main method
        declare and assign these variables:

           type of pizza,  the number of slices,  the number of people eating

        calculate how many slices each person will get
        calculate how many slices are left over

        Sample print statement:

           We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over

 */
    public static void main(String[] args){
    String typePizza  = "cheese";
    int numOfSlices = 17, people = 4;
    int slicesPerPerson= numOfSlices/people; //
    int slicesLeftOver= numOfSlices%people;
    String report = "We ordered " + typePizza+ " pozza with the " + numOfSlices+ " slices" + people+ " people ate "+ slicesPerPerson+
            " for each. There were " + slicesLeftOver+ " slices left";
        System.out.println(report);


    }



}
