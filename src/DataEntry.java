class DataEntry
{
    DataEntry(String n, int c)
    {
        count = c;
        name = n;
    }
    int count;
    String name;

    public int compareTo(DataEntry deParantheses)
    {
        // Returns a negative integer if this.object < deParantheses
        if (this.name.charAt(0) < deParantheses.name.charAt(0))
            return -1;
        // Returns a positive integer if this.object > deParantheses
        if (this.name.charAt(0) > deParantheses.name.charAt(0))
            return 1;
        // Returns 0 if two objects are equal.
        if (this.name.charAt(0) == deParantheses.name.charAt(0))
            return 0;
        // Return 0 when two DataEntry objects have equal values for the name variable
        return -1;
    }



    @Override
    public String toString() {
        return "count=" + count + ", name='" + name;
    }
}