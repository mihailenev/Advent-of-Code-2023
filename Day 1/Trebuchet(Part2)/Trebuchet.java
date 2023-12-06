import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Trebuchet{
    public static void main(String[] args) {
        Integer sum = 0;
        ArrayList<String> lines = new ArrayList<String>();

        //Loads the input values from input.txt into ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader("../input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
			e.printStackTrace();
        }

        //Converts the word numburs into digits
        for(int i = 0; i < lines.size(); i++){
            for(int j = 0; j < lines.get(i).length(); j++){
                if(lines.get(i).charAt(j) == 'o'){
                    if(lines.get(i).startsWith("one",j)){
                        String current = lines.get(i).substring(0,j)+'1'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 't'){
                    if(lines.get(i).startsWith("two",j)){
                        String current = lines.get(i).substring(0,j)+'2'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 't'){
                    if(lines.get(i).startsWith("three",j)){
                        String current = lines.get(i).substring(0,j)+'3'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 'f'){
                    if(lines.get(i).startsWith("four",j)){
                        String current = lines.get(i).substring(0,j)+'4'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 'f'){
                    if(lines.get(i).startsWith("five",j)){
                        String current = lines.get(i).substring(0,j)+'5'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 's'){
                    if(lines.get(i).startsWith("six",j)){
                        String current = lines.get(i).substring(0,j)+'6'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 's'){
                    if(lines.get(i).startsWith("seven",j)){
                        String current = lines.get(i).substring(0,j)+'7'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 'e'){
                    if(lines.get(i).startsWith("eight",j)){
                        String current = lines.get(i).substring(0,j)+'8'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
                if(lines.get(i).charAt(j) == 'n'){
                    if(lines.get(i).startsWith("nine",j)){
                        String current = lines.get(i).substring(0,j)+'9'+ lines.get(i).substring(j+1);
                        lines.set(i, current);
                    }
                }
            }
        }

        //Sums the first and last digit from each line
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
