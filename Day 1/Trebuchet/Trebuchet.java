import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Trebuchet{
    public static void main(String[] args) {
        Integer sum = 0;
        ArrayList<String> lines = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
			e.printStackTrace();
        }

        System.out.println(lines.get(0).length());

        ArrayList<Integer> numInLines = new ArrayList<Integer>();
        for(int i = 0; i < lines.size(); i++){
            ArrayList<Integer> numInLine = new ArrayList<Integer>();
            for(int j=0; j < lines.get(i).length(); j++){
                
                if(Character.getNumericValue(lines.get(i).charAt(j)) < 10){
                    numInLine.add(Character.getNumericValue(lines.get(i).charAt(j)));
                }
            }
            numInLines.add(numInLine.getFirst()*10 + numInLine.getLast());
        }
        
        for(int i = 0; i < numInLines.size(); i++){
            sum += numInLines.get(i);
        }
        System.out.println(sum);
    }
}
