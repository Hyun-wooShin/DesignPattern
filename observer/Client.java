public class Client {
    public static void main(String[] args)
    {
        ScoreRecord scoreRecord = new ScoreRecord();

        DataSheetView dataSheetView = new DataSheetView(scoreRecord, 3);
        // scoreRecord.setDataSheetView(dataSheetView);
        scoreRecord.attach(dataSheetView);
   
        MinMaxView minMaxView = new MinMaxView(scoreRecord);
        // scoreRecord.setDataSheetView(minMaxView);
        scoreRecord.attach(minMaxView);


        for(int i=1;i<=5;i++)
        {
            int score = i * 10;
            System.out.println("Adding "+ i);

            scoreRecord.addScore(score);
        }
    }
}
