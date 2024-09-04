//PRACTICAL-18:Write a Java program to create an interface Playable with a method play() that takes 
//no arguments and returns void. Create three classes Football, Volleyball, and Basketball that 
//implement the Playable interface and override the play() method to play the respective sports.
//Click me to see the solution
package com.inheritance;

interface Playable{
	void play();
}

class Football implements Playable{
	public void play(){
		System.out.println("Football Playing");
	}
}
class Volleyball implements Playable{
	public void play(){
		System.out.println("Volleyball Playing");
	}
}
class Basketball implements Playable{
	public void play(){
		System.out.println("Basketball Playing");
	}
}

public class Interface {
	public static void main(String[] args) {
		Playable football = new Football();
		football.play();
		
		Playable basketball = new Basketball();
		basketball.play();
		
		Playable volleyball = new Volleyball();
		volleyball.play();
	}
}
