import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.*;

class Main
{
    //I dont think this works.
    Main() throws FileNotFoundException
    {
        System.out.println("No file found");
    }

    public static void main(String[] args) throws FileNotFoundException
    {

        Timer myTimer = new Timer();
        File firstnames = new File("src/firstnames100,000.txt");
        File lastnames = new File("src/lasstnames100,000.txt");
        //FileWriter writer = new FileWriter()

        //just to note you may need to mess with the filenames to get it to find it because im using IntelliJ
        //it for some reason only likes this file path so you have my benevolent authority to modify this here code
        ArrayList<DataEntry> lastNamesDataset = Dataset.getDataset("src/facebook-lastnames-withcount.txt");
        ArrayList<DataEntry> firstNamesDataset = Dataset.getDataset("src/facebook-firstnames-withcount.txt");

        ArrayList<DataEntry> firstname100k = Dataset.getFirstXElements(firstNamesDataset, 99999);
        ArrayList<DataEntry> lastname100k = Dataset.getFirstXElements(firstNamesDataset, 99999);


        //ArrayList<DataEntry> lastNamesDataset = Dataset.getDataset("src/facebook-lastnames-withcount.txt");
        //ArrayList<DataEntry> firstNamesDataset = Dataset.getDataset("src/facebook-firstnames-withcount.txt");
        //Sort.selectionSort(lastname100k);

        //Sort.selectionSort(firstname100k);


        myTimer.startTimer();
        //Search.linearSearch(lastname100k, lastname100k.get(10).name);
        Sort.selectionSort(lastname100k);
        myTimer.endTimer();

        //System.out.println("---------------------------------------------------------------------------");
        //System.out.println(firstNamesDataset.get(99999));
        //for (int i = 0; i < 99999; i++)
        //{
        //    //System.out.println(lastNamesDataset.get(i));
        //
        //}
        //System.out.println(lastNamesDataset.get(99999));
        //myTimer.startTimer();
        //System.out.println(firstNamesDataset.get(Search.linearSearch(firstNamesDataset, "mike")));
        //System.out.println(firstNamesDataset.get(Search.binarySearch(firstNamesDataset, "mike")));
        //myTimer.endTimer();
    }
}