package com.oops.collections.main.programs;

import com.oops.collections.sub.programs.Theatre;

public class MainTheatre {

	public static void main(String[] args) {
		Theatre theatre = new Theatre("Olympian", 8, 12);
//        theatre.getSeats();
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}
		if (theatre.reserveSeat("H11")) {
			System.out.println("Please pay");
		} else {
			System.out.println("Sorry, seat is taken");
		}
	}

}
