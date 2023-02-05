

import java.util.Scanner;

public class K44A_K43A01 {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		String inputLine;
		int lenght;
		char test;
		
		do {
			int konsonanten = 0, leerzeichen = 0, vokale = 0, zeichen = 0, zahlen = 0, unknown = 0;
			
			System.out.println("Ihr Satz: ");
			inputLine = scan.nextLine();
			inputLine = inputLine.toLowerCase();
			lenght = inputLine.length()-1;
			
			for(int i = 0; i<=lenght; i++) {
				test = inputLine.charAt(i);
				
				switch(test) {
				
				case 'b':
				case 'c':
				case 'd':
				case 'f':
				case 'g':
				case 'h':
				case 'j':
				case 'k':
				case 'l':
				case 'm':
				case 'n':
				case 'p':
				case 'q':
				case 'r':
				case 's':
				case 't':
				case 'v':
				case 'w':
				case 'x':
				case 'y':
				case 'z':
					konsonanten += 1;
					break;
					
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					vokale += 1;
					break;
				
				case ' ':
					leerzeichen += 1;
					break;
					
				case '.':
				case ',':
				case ';':
				case ':':
				case '"':
				case '#':
				case '+':
				case '-':
				case '/':
				case '*':
				case '_':
				case '?':
				case ')':
				case '(':
				case '&':
				case '$':
				case '!':
				case '=':
					zeichen += 1;
					break;
					
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
				case '8':
				case '9':
					zahlen += 1;
					break;
				default:
					unknown += 1;
					break;
				}
			}
			System.out.println("Sie haben " + konsonanten + " Konsonanten in ihrem Satz.");
			System.out.println("Sie haben " + vokale + " Vokale in ihrem Satz.");
			System.out.println("Sie haben " + leerzeichen + " Leerzeichen in ihrem Satz.");
			System.out.println("Sie haben " + zeichen + " Zeichen in ihrem Satz.");
			System.out.println("Sie haben " + zahlen + " Zahlen in ihrem Satz");
			
			if (unknown>0) {
				System.out.println("Sie haben " + unknown + " Unbekanten Charakter in ihrem Satz");
			}
			
			System.out.println("\nMaechten Sie das Programm erneut ausfaehren(Y / Yes / N / No)");
			inputLine = scan.nextLine();
			System.out.println("\n");
		} 
		while(inputLine.equals("Yes") || inputLine.equals("Y") || inputLine.equals("yes") || inputLine.equals("y"));
		
		scan.close();
	}
}
