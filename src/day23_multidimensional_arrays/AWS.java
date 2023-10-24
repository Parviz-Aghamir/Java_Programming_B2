package day23_multidimensional_arrays;

public class AWS {
    public static void main(String[] args) {
        String zones = "us-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";
                        
        // Required Output: "$app is deploying on $us-east1"

        // I need to first get each zone - I can use .split
        
       String [] zoneArr = zones.split(" ");

       /* for (String each: zones.split(" ")
             ) {
            
        }*/

        for (String each: zoneArr) {
            System.out.println(app+"is deploying on " + each);
        }


        System.out.println("****************");

        for (int i = 0; i < zoneArr.length; i++) {
            System.out.println(app+"is deploying on " + zoneArr[i]);


        }

    }
}
