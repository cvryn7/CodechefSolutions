package AprilChallenge2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Created by karan bhagat on 4/10/2017.
 */

public class SiimilarDishes {
    public static void main(String[] args) throws IOException{
        int T;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String[] ingredients1 = br.readLine().split(" ");
            String[] ingredients2 = br.readLine().split(" ");
            HashMap<String, String> map = new HashMap<String, String>();
            for (int i = 0; i < 4; i++) {
                map.put(ingredients1[i], ingredients1[i]);
            }
            int count = 0;
            for (int i = 0; i < 4; i++) {
                if (map.containsKey(ingredients2[i])) {
                    count++;
                }
            }

            if (count >= 2) {
                System.out.println("similar");
            } else {
                System.out.println("dissimilar");
            }
        }
    }
}
