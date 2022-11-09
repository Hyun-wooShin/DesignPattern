import java.util.List;

public class DataSheetView implements Observer {
    private ScoreRecord scoreRecord;
    private int viewCount;

    public DataSheetView(ScoreRecord scoreRecord, int viewCount)
    {
        this.scoreRecord = scoreRecord;
        this.viewCount = viewCount;
    }

    public void update()
    {
        List<Integer> record = scoreRecord.getScoreRecord();
        displaySocres(record, viewCount);
    }

    private void displaySocres(List<Integer> record, int viewCount)
    {
        System.out.println("List of "+ viewCount + "entries: ");
        for(int i=0;i<viewCount && i<record.size();i++)
        {
            System.out.println(record.get(i));
        }
    }
}
