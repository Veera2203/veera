package grooming;

public class Demo1
{
	public static void main(String[] args) 
	{
		String key="webdriver.gesko.driver";
		String value="./software/geckodriver.exe";
		System.setProperty(key,value);
		FirefoxDriver driver=new FirefoxDriver();
		
		
		
	}

}
