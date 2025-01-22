package boletincolecciones;

import java.util.*;

public class Ejer4 {

	public static void main(String[] args) {
		Random random = new Random();
		
		ArrayList<Integer>numbers = new ArrayList<>();
		
		int randomNum;
		boolean sameNum;
		
		for (int i = 0; i < 20; i++) {
			do {
				sameNum = false;
				randomNum = random.nextInt(0, 100);
					if (numbers.contains(randomNum))
						sameNum = true;
			} while (sameNum);
			numbers.add(randomNum);
			Collections.sort(numbers);
		}
		
		System.out.print(numbers);
	}
}
