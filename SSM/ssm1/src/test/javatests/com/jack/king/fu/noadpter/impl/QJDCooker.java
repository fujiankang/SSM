package javatests.com.jack.king.fu.noadpter.impl;

import javatests.com.jack.king.fu.noadpter.inter.ICooker;

public class QJDCooker implements ICooker {

    @Override
    public String cook() {
        return "烤制美味烤鸭";
    }
}
