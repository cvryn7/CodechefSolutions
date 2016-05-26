import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChefAndRemissness {

	public static void main(String[] args) {
		int t;
		int A;
		int B;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		try {
			t = Integer.parseInt(br.readLine());
			
			while( t-- > 0 ){
				String[] input = br.readLine().split(" ");
				A = Integer.parseInt(input[0]);
				B = Integer.parseInt(input[1]);
				System.out.println( (A >= B?A:B) + " " + (A+B));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
