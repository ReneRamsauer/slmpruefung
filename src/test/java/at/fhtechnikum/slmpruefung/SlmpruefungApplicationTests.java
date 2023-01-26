package at.fhtechnikum.slmpruefung;

import at.fhtechnikum.slmpruefung.Controller.AreaController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.awt.geom.Area;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmpruefungApplicationTests {

	@Test
	 void testCalculationSquare() {
		/* GiVEN */
		AreaController controller = new AreaController();
		/* When */
		double result = controller.calcArea("square",10.0);
		/* Then */
		assertEquals(result,100.0);
	}
	@Test
	public void testCalculationCircle() {
		/* GiVEN */
		AreaController controller = new AreaController();
		/* When */
		double result = controller.calcArea("circle",10.0);
		/* Then */
		assertEquals(result,314.16);
	}

}
