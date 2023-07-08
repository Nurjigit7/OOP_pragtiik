import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Delphine delphine=new Delphine();
//        delphine.length= 2;
//        delphine.age=25;
//        delphine.color="blue";
//        delphine.whole=70;
//        delphine.place_of_residence="water";
//        delphine.Delphin(delphine.length,delphine.age,delphine.color,delphine.whole,delphine.place_of_residence);
        Scanner scanner=new Scanner(System.in);
        Person person=new Person();
        person.person(scanner.nextLine(), scanner.nextLine(), scanner.nextByte());
        System.out.println(person.kaitaruu());

    }
}