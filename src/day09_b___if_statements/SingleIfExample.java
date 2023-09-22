package day09_b___if_statements;

public class SingleIfExample {
    public static void main(String[] args) {
    if (false){
        System.out.println("Hell world");

    }
        System.out.println("Second line ");
    int score =60;
    if (score>=75){
        System.out.println("you passed exam");
    }
if (score<60){
    System.out.println("you faild!");
}

int year =2023;
boolean isLockdown = year == 2020|| year ==2021;
if (isLockdown){
    System.out.println("Stat at home");
    System.out.println("Study Java");
}
    if(!isLockdown){
        System.out.println("Party");
        System.out.println("travel");

    }
    }

}
