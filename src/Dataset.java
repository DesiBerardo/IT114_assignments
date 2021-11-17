import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Dataset
{
    public static ArrayList<DataEntry> getDataset(String filename) throws FileNotFoundException
    {
        File files = new File(filename);
        ArrayList<DataEntry> dataset = new ArrayList<>();
        Scanner scn = new Scanner(files);

        //scanner will check if there is any lines left to do. Each time a line shows up, a DataEntry object is made,
        //and count will be updated with the number followed by name. It is then added to ze dataset arraylist muhahahahaaaa
        while (scn.hasNext())
        {
            DataEntry entry = new DataEntry();
            entry.count = scn.nextInt();
            entry.name = scn.next();
            dataset.add(entry);
        }

        return dataset;
    }

    //iterates through a for loop to do the thing and do the do
    public static ArrayList<DataEntry> getFirstXElements(ArrayList<DataEntry> dataset, int x)
    {
        ArrayList<DataEntry> rtn = new ArrayList<>();
        for (int i = 0; i < x; i++)
        {
            rtn.add(dataset.get(i));
        }
        return rtn;
    }

    //goes through the for loop but ooooo its backwards this time (not sure if you wanted it in this order but welp here ya go)
    public static ArrayList<DataEntry> getLastXElements(ArrayList<DataEntry> dataset, int x)
    {
        ArrayList<DataEntry> rtn = new ArrayList<>();


        for (int i = 1; i < x + 1; i++)
        {
            rtn.add(dataset.get(dataset.size() - i));
        }
        return rtn;
    }

    public static int getSizeDataset(ArrayList<DataEntry> dataset)
    {
        return dataset.size();
    }
}