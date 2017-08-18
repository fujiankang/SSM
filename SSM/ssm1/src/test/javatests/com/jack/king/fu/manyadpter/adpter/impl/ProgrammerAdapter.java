package javatests.com.jack.king.fu.manyadpter.adpter.impl;

import javatests.com.jack.king.fu.manyadpter.adpter.IWorkAdapter;
import javatests.com.jack.king.fu.manyadpter.inter.IProgrammer;

/**
 * 定义ProgrammerAdapter 适配器
 */
public class ProgrammerAdapter implements IWorkAdapter {

    @Override
    public String work(Object work) {
        return ((IProgrammer)work).program();
    }

    @Override
    public boolean supports(Object work) {
        return work instanceof IProgrammer;
    }
}
