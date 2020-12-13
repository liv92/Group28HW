package ZRandom_InterviewMain;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhoWillBeInterviewed$ {
    public static void main(String[] args) throws FileNotFoundException {
        Random rand = new Random();
        FileInputStream file = new FileInputStream("src/ZRandom_InterviewMain/group28Names");


        Scanner sc = new Scanner(file);
        ArrayList<String> group28Names = new ArrayList<>();
        while(sc.hasNext()){
            group28Names.add(sc.nextLine());
        }
        System.out.println("The Possible Names are: \n");
        System.out.println("================================");
        for(String each: group28Names) System.out.println(each);
        System.out.println("================================");
        System.out.println("\n");


        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM, dd");
        System.out.println("The lucky winners for "+todayDate.format(df)+" are:");

        System.out.println("================================");



    }
}
