package main;

import food.*;
import book.*;
import cinema.*;
import touristspot.*;

public class Main extends BanglaBook {
	public static void main(String[] args) {

		StreetFood ob1 = new StreetFood();
		ResturantFood ob2 = new ResturantFood();
		ob1.favourtieFood();
		ob2.favourtieFood();

		Main ob3 = new Main();
		EnglishBook ob4 = new EnglishBook();
		ob3.favourtieBook();
		ob4.favourtieBook();

		KoreanMovie ob5 = new KoreanMovie();
		HollywoodMovie ob6 = new HollywoodMovie();
		ob5.favouriteMovie();
		ob6.favouriteMovie();

		Bangladesh ob7 = new Bangladesh();
		Overseas ob8 = new Overseas();
		ob7.favouriteTourisSpot();
		ob8.favouriteTourisSpot();
	}
}
