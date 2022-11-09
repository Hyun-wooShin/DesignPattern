import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject{
    private List<Integer> scores = new ArrayList<Integer>();


 /*    public void setDataSheetView(DataSheetView dataSheetView)
    {
        this.dataSheetView = dataSheetView;
    }

    public void setDataSheetView(MinMaxView minMaxView)
    {
        this.minMaxView = minMaxView;
    } */

    public void addScore(int score)
    {
        scores.add(score);
        /* dataSheetView.update();
        minMaxView.update(); */
        notifyObservers();
    }

    public List<Integer> getScoreRecord()
    {
        return scores;
    }
}