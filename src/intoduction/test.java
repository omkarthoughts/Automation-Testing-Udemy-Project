package intoduction;

import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	
	public static void main (String []args) {
	
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}
}

class test {
    public static void main(String[] args) {
        
        int  num = 100;
        boolean flag = true;
        
        
        for( int i = 2; i<num/2; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                if(i%j == 0)
                { 
                    flag = false;
                    
                 }
                 else
                 {
                     System.out.println(i) ;
                 }
                
            } 
        }
    }
}
public class primeNumFoundber {

    public static void main(String[] args) {

        int i;

        int num = 0;

        int maxCheck = 100; // The limit to find prime numbers is up to 100

        boolean isPrime = true;

        //Empty String

        String primeNumFound = “”;

        //Start loop#2 to maxCheck

        for (i = 2; i <= maxCheck; i++) {

            isPrime = CheckPrime(i);

            if (isPrime) {

             primeNumFound = primeNumFound + i + ” “;

            }

        }

        System.out.println(“Prime numbers from 1 to ” + maxCheck + “:”);

        // It prints prime numbers from 1 to maxCheck

    System.out.println(primeNumFound);

}

    public static boolean CheckPrime(int numToCheck) {

        int remainder;

        for (int i = 2; i <= numToCheck / 2; i++) {

            remainder = numToCheck % i;

            //if remainder gives 0 than numToCheckber is not prime number and breaks loop, else it continues the loop

         if (remainder == 0) {

             return false;

            }

        }

        return true;

}

}