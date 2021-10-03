import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/Users/user/Desktop/task1/src/song_plays.csv";
        String line = "";
        //try and run this script
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            //loop through the data and only store none empty lines
            while((line = br.readLine()) != null) {
                String[] values = line.split(","); // split the data by a comma(,)
                System.out.println("song_id: " + values[0] + ", views: " + values[1]);
            }
            //if any errors, catch them and print the stackTrace
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
