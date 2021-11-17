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

        ArrayList<DataEntry> test1 = Dataset.getLastXElements(lastNamesDataset, 100);
        ArrayList<DataEntry> test2 = Dataset.getFirstXElements(firstNamesDataset, 100);

        //last 100 element printer
        for (int i = 0; i < test1.size(); i++)
        {
            System.out.print(i + "     ");
            System.out.print(test1.get(i).count + "       ");
            System.out.println(test1.get(i).name);
        }

        //first 100 element printer
        System.out.println("------------------------------------------------");
        for (int i = 0; i < test2.size(); i++)
        {
            System.out.print(i + "     ");
            System.out.print(test2.get(i).count + "       ");
            System.out.println(test2.get(i).name);
        }


        //prints arraylist sizes
        System.out.println("Last name size: " + Dataset.getSizeDataset(lastNamesDataset));
        System.out.println("Last name size: " + Dataset.getSizeDataset(firstNamesDataset));
    }
}