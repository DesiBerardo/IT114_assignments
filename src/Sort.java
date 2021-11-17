public class Sort
{
    //change for dataentry objects
    public static void selectionSort(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            int k = minIndex(a,i);
            //swap
            int t = a[k]; a[k] = a[i]; a[i] = t;
        }
    }

    public static int minIndex(int[] list, int i)
    {
        int answer = i;
        int min = list[answer];
        for(int k = answer+1; k < list.length; k++)
        {
            if(k < min)
            {
                min = list[k];
                answer = k;
            }
        }
        return answer;
    }
}
