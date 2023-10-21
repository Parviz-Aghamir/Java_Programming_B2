package day22_arrays;

public class SplitExample {
    public static void main(String[] args) {
        String str = "monday,tuesday,wednesday,thursday,friday";
        String[] days = str.split(",");
        for (String eachElem:
             days) {
            System.out.println(eachElem);
        }


        System.out.println("===============");
        String [] days2 = str.split("day");
        for (String each: days2){
            System.out.println(each);
        }


        System.out.println("===============");
        String months = "jan-feb-mar-apr-may-jun-jul-avg-sep-nov-oct-dec";
        String[] allMonth = months.split("-");

        for (String eachmonth: allMonth){
            System.out.println(eachmonth);
        }

        System.out.println("===============");
        System.out.println(allMonth.length);


        System.out.println("===============");
        String [] arr2 = months.split("y-");
        for (String eachPart:arr2){
            System.out.println(eachPart);

        }

/*
it will separate each character.
        System.out.println("===============");
        String [] arr3 = months.split("");
        for (String eachElem:arr3){
            System.out.println(eachElem);
        }

*/
        System.out.println("===============");

        String[] arr4 = months.split("java");
        for (String each: arr4){
            System.out.println(each);
        }







    }
}
