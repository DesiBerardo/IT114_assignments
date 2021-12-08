public class Timer
{
    double startTime, endTime, duration;

    public double startTimer()
    {
        return startTime = System.nanoTime();
    }

    public double endTimer()
    {
        endTime = System.nanoTime();
        System.out.println(duration());

        return endTime;
    }

    public double duration()
    {
        return duration = startTime - endTime;
    }
}
