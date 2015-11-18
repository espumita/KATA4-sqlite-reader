package kata4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class KATA4 {
    
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException{
        String fileName = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\KATA4\\KATA5.DB";
        ArrayList<String> listMail = MailListReaderDDBB.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(listMail);
        HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
        histogramDisplay.execute();
    }
    
}
