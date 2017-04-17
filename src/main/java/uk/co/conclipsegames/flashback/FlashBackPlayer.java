package uk.co.conclipsegames.flashback;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ethan on 15/04/2017.
 */
public class FlashBackPlayer {

    public String name;
    public List<Double[]> pos = new ArrayList<Double[]>();
    // x, y, z, pitch, yaw

    public FlashBackPlayer(String name) {
        this.name = name;
    }

    public void add_pos(Double[] lta) {
        pos.add(lta);
        if (pos.size() > 200) { // 10 seconds
            pos.remove(0);
        }
    }
    public List<Double[]> get_fb_pos() {
        if (pos.size() == 0) {
            return null;
        }
        return pos;
    }

}
