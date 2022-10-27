package package1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(package1.itest.class)
public class testttt {
@Test
public void add() {
	System.out.println("hello");
}
}
