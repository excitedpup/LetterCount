package letterCount;
 

import java.util.Scanner;

/**
 * The LetterCount program implements an application which reads in text from the user. 
 * For each letter that appears on the input, program prints out how many times that letter was there.
 *  
 * @author 	Danielle Whitmarsh
 * @version 1.0
 * @since 	2022-01-21
 */
public class LetterCount {

	public static void main(String[] args) {
		
		// Initiates all letter count to 0
		int q = 0, w = 0, e = 0, r = 0, t = 0, y = 0, u = 0, i = 0, o = 0, p = 0, a = 0, s = 0, d = 0, f = 0, g = 0,
				h = 0, j = 0, k = 0, l = 0, z = 0, x = 0, c = 0, v = 0, b = 0, n = 0, m = 0;

		// Instantiates Scanner Object
		Scanner kb = new Scanner(System.in);
		System.out.println("Write something:");
		
		// adds user input as a string
		String userInput = kb.nextLine();
		
		// Close Scanner Object
		kb.close();
		
		// Initiates ch to null
		String ch = null;
		
		// Loops through each character of user input
		for (int index = 0; index < userInput.length(); index++) {

			// Checks if character is a letter
			if (Character.isLetter(userInput.charAt(i))) {
				
				// Access that character in the user input and turns it to lower case
				ch = userInput.substring(index, index + 1).toLowerCase();
				
				// Use Switch case adds 1 to count of each letter that is pulled from user input
				switch (ch) {

				case "a":
					a++;
					break;
				case "b":
					b++;
					break;
				case "c":
					c++;
					break;
				case "d":
					d++;
					break;
				case "e":
					e++;
					break;
				case "f":
					f++;
					break;
				case "g":
					g++;
					break;
				case "h":
					h++;
					break;
				case "i":
					i++;
					break;
				case "j":
					j++;
					break;
				case "k":
					k++;
					break;
				case "l":
					l++;
					break;
				case "m":
					m++;
					break;
				case "n":
					n++;
					break;
				case "o":
					o++;
					break;
				case "p":
					p++;
					break;
				case "q":
					q++;
					break;
				case "r":
					r++;
					break;
				case "s":
					s++;
					break;
				case "t":
					t++;
					break;
				case "u":
					u++;
					break;
				case "v":
					v++;
					break;
				case "w":
					w++;
					break;
				case "x":
					x++;
					break;
				case "y":
					y++;
					break;
				case "z":
					z++;
					break;

				default:
				}
			}
		}
		
		// Prints out letter and their count if not 0
		print(a, "a");
		print(b, "b");
		print(c, "c");
		print(d, "d");
		print(e, "e");
		print(f, "f");
		print(g, "g");
		print(h, "h");
		print(i, "i");
		print(j, "j");
		print(k, "k");
		print(l, "l");
		print(m, "m");
		print(n, "n");
		print(o, "o");
		print(p, "p");
		print(q, "q");
		print(r, "r");
		print(s, "s");
		print(t, "t");
		print(u, "u");
		print(v, "v");
		print(w, "w");
		print(x, "x");
		print(y, "y");
		print(z, "z");

	}
/**
 * Method that prints out the letter : times used if count is not 0
 * @param count integer amount used of specific letter
 * @param letter
 */
	private static void print(int count, String letter) {
		if (count != 0) {
			System.out.println(letter + " : " + count);
		}
	}
}
