class DataEntry
{
    DataEntry(String n, int c)
    {
        count = c;
        name = n;
    }
    int count;
    String name;


    @Override
    public String toString() {
        return "count=" + count + ", name='" + name;
    }
}