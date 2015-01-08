package testingJunit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 
 * Sample JUnit4 code snippet
 *
 */

@RunWith(Suite.class)
@SuiteClasses({ countATest.class, squareTest.class })
public class AllTests {

}
