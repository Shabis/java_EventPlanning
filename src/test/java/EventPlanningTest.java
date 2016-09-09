import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventPlanningTest {

@Test
public void EventPlanning_testingFirstUserInput_50() {
  Event testEvent = new Event();
    List<Object> expectedOutput = new ArrayList<Object>();
    expectedOutput.add(50);
    assertEquals(expectedOutput, testEvent.runEventPlanning());

}




}
