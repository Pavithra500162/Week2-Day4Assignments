package week2.day4;

public class Automation extends MultipleLanguage implements Language,TestTool{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Automation a=new Automation();
		a.java();
		a.selenium();
		a.python();
		a.ruby();
	}

	public void selenium() {
		System.out.println("Selenium testing");
		
	}

	public void java() {
		System.out.println("Java Programming");
		
	}

	@Override
	public void python() {
		System.out.println("Python Programming");
		
	}

}
