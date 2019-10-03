package dependency_injection.shape;

import org.junit.Test;

public class DrawerTestSuite {
    @Test
    public void testProcessDraw(){
        // given
        Drawer drawer = new Drawer();

        // when
        drawer.processDrawing();

        // then
        //do nothing
    }
}
