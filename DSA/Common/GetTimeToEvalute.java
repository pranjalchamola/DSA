package GitCode.DSA.Common;

public class GetTimeToEvalute {
    long startTime=0;
    long endtime=0;

    public void start()
    {
        startTime=System.currentTimeMillis();
    }

    public void end()
    {
        endtime=System.currentTimeMillis();
        System.out.println(endtime-startTime);
    }
}
