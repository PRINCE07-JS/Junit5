package com.mytests.junit5.assertions.displaynameannotation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Display name annotation demo")
public class DisplayNameAnnotationDemo {

		@Test
		@DisplayName("Display name demo test")
		public void displayNameDemoTest() {
			assertEquals(3, 2 + 1);
		}
		
		@Test
		@DisplayName("Display name  demo  with  spaces")
		public void displayNameDemoWithSpaces() {
			assertEquals(3, 2 + 1);
		}
		
		@Test
		@DisplayName("Display name  demo  with  *> *& ) specials characters")
		public void displayNameDemoWithSpecialsCharacters() {
			assertEquals(3, 2 + 1);
		}
		
		@Test
		@DisplayName("Display name  demo  with  Emojis ❤️😊😘")
		public void displayNameDemoWithEmojis() {
			assertEquals(3, 2 + 1);
		}
}
