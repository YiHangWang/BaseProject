package YiHangWangBaseProject;

import org.junit.Test;

import static org.junit.Assert.*;

public class YiHangTest {
    @Test
    public void getType() throws Exception {
        YiHang lol = new YiHang(10, 20, 30);
        System.out.println(lol.getType());
    }

}
