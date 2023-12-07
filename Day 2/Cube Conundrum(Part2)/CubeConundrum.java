import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CubeConundrum {
    public static void main(String[] args) {
        int current_r_max = 0, current_g_max = 0, current_b_max = 0;
        int sum = 0;
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
            current_r_max = 0;
            current_g_max = 0;
            current_b_max = 0;
            for(int j = 0; j < lines.get(i).length(); j++){
                if(lines.get(i).charAt(j) == 'r' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(current_r_max < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_r_max = Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                    else{
                        if(current_r_max < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_r_max = Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                }
                if(lines.get(i).charAt(j) == 'g' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(current_g_max < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_g_max = Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                    else{
                        if(current_g_max < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_g_max = Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                }
                if(lines.get(i).charAt(j) == 'b' && lines.get(i).charAt(j-1) == ' '){
                    if(Character.getNumericValue(lines.get(i).charAt(j-3)) > 0){
                        if(current_b_max < Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_b_max = Character.getNumericValue(lines.get(i).charAt(j-3)) * 10 + Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                    else{
                        if(current_b_max < Character.getNumericValue(lines.get(i).charAt(j-2))){
                            current_b_max = Character.getNumericValue(lines.get(i).charAt(j-2));
                        }
                    }
                }
                
            }
                sum += (current_r_max*current_g_max*current_b_max);
        }
        System.out.print(sum);
    }
}
