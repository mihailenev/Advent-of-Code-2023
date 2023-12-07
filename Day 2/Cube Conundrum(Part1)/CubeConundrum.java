import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CubeConundrum {
    public static void main(String[] args) {
        int R_MAX = 12, G_MAX = 13, B_MAX = 14;
        int sum = 0;
        Boolean legal = true;
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

        //Goes through the input ArrayList
        for(int i = 0; i < lines.size(); i++){
            legal = true;
            for(int j = 0; j < lines.get(i).length(); j++){
                if(lines.get(i).charAt(j) == 'r' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(R_MAX < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                    else{
                        if(R_MAX < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                }
                if(lines.get(i).charAt(j) == 'g' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(G_MAX < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                    else{
                        if(G_MAX < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                }
                if(lines.get(i).charAt(j) == 'b' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(B_MAX < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                    else{
                        if(B_MAX < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            legal = false;
                            break;
                        }
                    }
                }
                
            }
            if(legal){
                sum += (i+1);
            }
        }
        System.out.print(sum);
    }
}
