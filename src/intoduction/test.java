package intoduction;

import org.openqa.selenium.chrome.ChromeDriver;

//public class test {
//	
//	public static void main (String []args) {
//	
//		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://rahulshettyacademy.com");
//	System.out.println(driver.getTitle());
//	System.out.println(driver.getCurrentUrl());
//	driver.close();
//	}
//}

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