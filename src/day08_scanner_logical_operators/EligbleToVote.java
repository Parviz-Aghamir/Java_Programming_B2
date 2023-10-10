package day08_scanner_logical_operators;

public class EligbleToVote {
        /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote, they can only vote
     if they are a citizen,
     And
     have no criminal background and
     And
     are about age 18

    print : $name is eligible to vote: $boolean

 */
        public static void main(String[] args) {
            String name ="James";
            boolean isCitizen = true;
            boolean isNotCriminal = false;
            int age = 49;
            boolean isEligible= isCitizen && !isNotCriminal && age>=18;
            System.out.println(name+ " is eligible to vote: "+isEligible);


        }
}
