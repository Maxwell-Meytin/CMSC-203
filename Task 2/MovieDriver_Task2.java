package Lab1;

import java.util.Scanner;

public class MovieDriver_Task2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		
		while (continueInput) {
			Movie movie = new Movie();
			
			System.out.print("Enter the title of the movie: ");
			String title = input.nextLine();
			movie.setTitle(title);
			
			System.out.print("Enter the rating of the movie: ");
			String rating = input.nextLine();
			movie.setRating(rating);
			
			System.out.print("Enter the number of tickets sold: ");
			int soldTickets = input.nextInt();
			input.nextLine();
			movie.setSoldTickets(soldTickets);
			
			System.out.println(movie);
			
			System.out.println("Do you want to enter another movie? (y/n)");
			String response = input.nextLine();
			continueInput = response.equalsIgnoreCase("y");
		}
		input.close();
	}
}
