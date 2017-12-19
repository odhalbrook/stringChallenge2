import java.util.Scanner;

public class ChallengeStrings2
	{
		static String sentence;
		static int character;
		public static void main(String[] args)
			{
				greetUser1();
				askForInput2();
				sentenceStrip3();
				sentanceReport4();
				mullenPrint5();

			}

		private static void greetUser1()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				System.out.println("Cool, nice to meet you, " + name + "!");
				
			}

		private static void askForInput2()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input a sentance with at least 5 words and no punctuation");
				sentence = userInput.nextLine();
				
			}

		private static void sentenceStrip3()
			{
			character = sentence.length();
				sentence = sentence.replace(" ","");
			System.out.println(sentence);
				
			}

		private static void sentanceReport4()
			{
				System.out.println("There are " + character + " characters in this sentence.");
				System.out.println("There are " + sentence.length() + " letters in this sentence.");
				
				int vowel = 0;
				
				for(int i = 0; i < sentence.length(); i++)
					{
					switch(sentence.substring(i, i + 1))
								{
								case "a":
								case "e":
								case "i":
								case "o":
								case "u":
									{
									vowel++;
									break;
									}
								}
					}
				System.out.println("There are " + vowel + " vowels in this sentence.");
				System.out.println("There are " + (sentence.length() - vowel) + " consonants.");
			}

		private static void mullenPrint5()
			{
				String s = "Mullen High School";
				
				for(int i = 0; i < s.length(); i++)
					{
						System.out.println(s.substring(0, i + 1));
						
						try
							{
								Thread.sleep(1000);
							} catch (InterruptedException e)
							{
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
					}
				
			}

	}
