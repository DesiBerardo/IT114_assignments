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
        ArrayList<DataEntry> lastNamesDataset = Dataset.getDataset("src/lastnames300.txt");
        ArrayList<DataEntry> firstNamesDataset = Dataset.getDataset("src/firstnames300.txt");



        Sort.selectionSort(lastNamesDataset);
        Sort.selectionSort(firstNamesDataset);

        for (int i = 0; i < firstNamesDataset.size(); i++)
        {
            System.out.println(firstNamesDataset.get(i));
        }
        System.out.println("---------------------------------------------------------------------------");

        for (int i = 0; i < lastNamesDataset.size(); i++)
        {
            System.out.println(lastNamesDataset.get(i));
        }

    }
}