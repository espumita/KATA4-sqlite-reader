package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MailListReaderDDBB {
    public static ArrayList<String> read(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException{
        ArrayList<String> mailList = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection conecta = DriverManager.getConnection("jdbc:sqlite:KATA5.DB");
        Statement state = conecta.createStatement();
        String query = "SELECT MAIL FROM MAILS";
        ResultSet resultado = state.executeQuery(query);
        while (resultado.next()) {            
            mailList.add(resultado.getString("MAIL"));
        }
        return mailList;
    }
}
