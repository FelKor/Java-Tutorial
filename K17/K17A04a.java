

import java.util.Scanner;

public class K17A04a {
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		int leerzeichen=0, benötigteleerzeichen, stern=1, benötigtesterne, gewolltesterne, reihe;
		int sternest=1, benötigtesternest=2, benötigteleerzeichenst=0, leerzeichenst=1, reihest=2;
		
		System.out.println("Wie groö soll ihr Baum sein: ");
		gewolltesterne = scan.nextInt();
		reihe = gewolltesterne/2;
		
		if(gewolltesterne%2==0) {
			benötigteleerzeichen = gewolltesterne/2;
			benötigtesterne = gewolltesterne/gewolltesterne-1;
			if(gewolltesterne <= 8) {
				reihest = 2;
				benötigtesternest=2;
				benötigteleerzeichenst = gewolltesterne/2;
			}
			if(gewolltesterne > 8 && gewolltesterne <= 16){
				reihest=2;
				benötigtesternest=2;
				benötigteleerzeichenst = gewolltesterne/2;
			}
			if(gewolltesterne > 16 && gewolltesterne <= 30) {
				reihest=3;
				benötigtesternest=4;
				benötigteleerzeichenst = gewolltesterne/2-1;
			}
			if(gewolltesterne > 30) {
				reihest=4;
				benötigtesternest=6;
				benötigteleerzeichenst = gewolltesterne/2-2;
			}
		}
		else {
			benötigteleerzeichen = gewolltesterne/2-1;
			benötigtesterne = gewolltesterne/gewolltesterne;
			if(gewolltesterne <= 7) {
				reihest = 2;
				benötigtesternest=1;
			}
			if(gewolltesterne > 7 && gewolltesterne <= 15){
				reihest=2;
				benötigtesternest=3;
			}
			if(gewolltesterne > 15 && gewolltesterne <= 31) {
				reihest=3;
				benötigtesternest=3;
			}
			if(gewolltesterne > 31) {
				reihest=4;
				benötigtesternest=5;
			}
			benötigteleerzeichenst = gewolltesterne/2-benötigtesternest/2;
		}
		
		while(0<=reihe) {
			while(leerzeichen<=benötigteleerzeichen) {
				System.out.print(" ");
				leerzeichen++;
			}
			while(stern<=benötigtesterne) {
				System.out.print("*");
				stern++;
			}
			System.out.println(" ");
			stern = 1;
			leerzeichen = 0;
			reihe--;
			benötigteleerzeichen--;
			benötigtesterne += 2;
		}
		
		
		while(0<reihest) {
			while(leerzeichenst<=benötigteleerzeichenst) {
				System.out.print(" ");
				leerzeichenst++;
			}
			leerzeichenst = 1;
			
			while(sternest<=benötigtesternest) {
				System.out.print("*");
				sternest++;
			}
			sternest = 1;
			System.out.println(" ");
			reihest--;
		}

		scan.close();
	}
}