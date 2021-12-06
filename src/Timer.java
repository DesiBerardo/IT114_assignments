public class Timer
{
    double startTime, endTime, duration;

    public double startTimer()
    {
        return startTime = System.nanoTime();
    }

    public double endTimer()
    {
        System.out.println(duration());

        return endTime = System.nanoTime();
    }

    public double duration()
    {
        return duration = startTime - endTime;
    }
}
