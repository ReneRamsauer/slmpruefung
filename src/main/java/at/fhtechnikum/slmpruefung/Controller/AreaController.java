package at.fhtechnikum.slmpruefung.Controller;

import at.fhtechnikum.slmpruefung.util.CalculatorHelper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {
    @GetMapping("/api/{shape}/value={size}")
    public double calcArea(@PathVariable String shape, @PathVariable double size){
        switch (shape) {
            case "circle", "Circle", "CIRCLE" -> size = CalculatorHelper.calcCircle(size);
            case "square", "Square", "SQUARE" -> size = CalculatorHelper.calcSquare(size);
            default -> size = 0;
        }
        return size;
    }
}
