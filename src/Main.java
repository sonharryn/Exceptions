import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.println("Please enter filename");
        String filePath = userInputScanner.nextLine();
        File fileToRead = new File(filePath);
        ArrayList<String> fileAsList = new ArrayList<>();

        try{
            if(!fileToRead.exists()){
                throw new FileNotFoundException("Could not find file");
            }
            Scanner textScanner = new Scanner (fileToRead);
            while(textScanner.hasNextLine()){
                fileAsList.add(textScanner.nextLine());
            }
            System.out.println(fileAsList.size());

        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }


        /*try{
            int [] tal = {1,2,3};
            System.out.println(tal[3]);
        }
        catch(Exception e){
            System.out.println("Arrayindex ikke fundet");
            System.out.println(e);
        }*/

    }
}
