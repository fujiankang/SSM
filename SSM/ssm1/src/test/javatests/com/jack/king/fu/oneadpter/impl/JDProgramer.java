package javatests.com.jack.king.fu.oneadpter.impl;

import javatests.com.jack.king.fu.oneadpter.inter.IProgrammer;

public class JDProgramer implements IProgrammer {
    @Override
    public String program() {
        return "编写高效程序";
    }
}
