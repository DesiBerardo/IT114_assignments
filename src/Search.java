import java.util.ArrayList;

class Search
{
    public static int binarySearch(ArrayList<DataEntry> list, String name)
    {
        int left = 0, right = list.size() - 1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (list.get(mid).name.compareTo(name) == 0)
                return mid;

            if (list.get(mid).name.compareTo(name) < 0)
                left = mid + 1;

            else
                right = mid - 1;
        }
        return -1;
    }
    public static int linearSearch(ArrayList<DataEntry> list, String name)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i).name.compareTo(name) == 0)
                return i;
        }
        return -1;
    }
}