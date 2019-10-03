package dependency_injection.shape;

import org.junit.Assert;
import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testDrawingWithCircle(){
        // given
        Circle circle = new Circle();

        // when
        Drawer drawer = new Drawer(circle);
        String result = drawer.processDrawing();

        // then
        Assert.assertEquals("This is a circle", result);
    }
}
