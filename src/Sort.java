import java.util.ArrayList;

public class Sort
{
    //change for dataentry objects in an arraylist
    public static void selectionSort(ArrayList<DataEntry> a)
    {
        for(int i = 0; i < a.size() - 1; i++)
        {
            int min = i;
            for (int j = i + 1; j < a.size(); j++)
                if (a.get(j).compareTo(a.get(min)) < 0)
                    min = j;

            String temp = a.get(i).name;
            int temp1 = a.get(i).count;
            a.get(i).name = a.get(min).name;
            a.get(i).count = a.get(min).count;
            a.get(min).name = temp;
            a.get(min).count= temp1;
        }
    }
}
