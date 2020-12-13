package ZRandom_InterviewMain;
/*
@Author: Daniel Vanshtein
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WhoWillBeInterviewed$ {
    public static void main(String[] args) throws FileNotFoundException {//HAVE TO THROW EXCEPTION for the input file in case the filePath given is wrong
        Random rand = new Random();
        FileInputStream file = new FileInputStream("src/ZRandom_InterviewMain/group28Names");//created a fileStream Object "File" that we will be reading.


        Scanner sc = new Scanner(file);//make a scanner specifically to read that file...NOT SYSTEM.IN


        ArrayList<String> group28NamesArrayList = new ArrayList<>(); // making an arrayList to put all our names in
        while(sc.hasNext()){
            group28NamesArrayList.add(sc.nextLine());
        }
        System.out.println("The Possible Names are: \n");
        System.out.println("================================");
        for(String each: group28NamesArrayList) System.out.println(each);
        System.out.println("================================");
        System.out.println("\n");


        LocalDate todayDate = LocalDate.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM, dd");
        System.out.println("The lucky winners for "+todayDate.format(df)+" are:");

        System.out.println("================================");
        //IDEA TO ADD HOW MANY PEOPLE WE WANT TO TAKE FROM THE LIST, OR DO WE WANT ALL the names to be put into the random hat

        ArrayList<String> tempArrayList = new ArrayList<>();//tempArrayList for printing out our random names and making sure none of them are printed TWICE

        while(!group28NamesArrayList.isEmpty()){//creating condition for ALL the names to be read from the ArrayList
                int randInt = rand.nextInt(group28NamesArrayList.size());//initializing a random number using our RandomClass object "rand"
                tempArrayList.add(group28NamesArrayList.get(randInt));//adds the element in the random index that it generated
                group28NamesArrayList.remove(randInt);//removes the element that was just chosen.
        }

       int i=1;//WE CAN PUT THE DATE FOR EACH PERSON AS WELL!!! I HATE FOR LOOPS WITH I.
        for(String each: tempArrayList) {
            System.out.println(i+" "+each);//our print statement that will print the new randomized arrayList.
            i++;
        }




    }
}
