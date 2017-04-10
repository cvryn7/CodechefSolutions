import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnapeAndLadder {

	public static void main(String[] args) {
		int t;
		int LS;
		int B;
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		try {
			t = Integer.parseInt(br.readLine());
			while( t-- > 0) {
				String[] values = br.readLine().split(" ");
				B = Integer.parseInt(values[0]);
				LS = Integer.parseInt(values[1]);
				
				float rs_min, rs_max;
				rs_min = (float)Math.sqrt(Math.abs((Math.pow(LS, 2) - Math.pow(B, 2))));
				rs_max = (float)Math.sqrt(Math.abs((Math.pow(LS, 2) + Math.pow(B, 2))));
				System.out.println(rs_min + " " + rs_max);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
