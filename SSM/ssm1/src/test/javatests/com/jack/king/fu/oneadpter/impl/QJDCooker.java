package javatests.com.jack.king.fu.oneadpter.impl;

import javatests.com.jack.king.fu.oneadpter.inter.ICooker;

public class QJDCooker implements ICooker {

    @Override
    public String cook() {
        return "烤制美味烤鸭";
    }
}
