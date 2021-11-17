import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main
{
    //I dont think this works.
    Main() throws FileNotFoundException
    {
        System.out.println("No file found");
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        //just to note you may need to mess with the filenames to get it to find it because im using IntelliJ
        //it for some reason only likes this file path so you have my benevolent authority to modify this here code
        ArrayList<DataEntry> lastNamesDataset = Dataset.getDataset("src/facebook-lastnames-withcount.txt");
        ArrayList<DataEntry> firstNamesDataset = Dataset.getDataset("src/facebook-firstnames-withcount.txt");

        System.out.println(lastNamesDataset.get(0));


    }
}