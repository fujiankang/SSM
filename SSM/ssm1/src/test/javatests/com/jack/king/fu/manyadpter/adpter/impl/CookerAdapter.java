package javatests.com.jack.king.fu.manyadpter.adpter.impl;
import javatests.com.jack.king.fu.manyadpter.adpter.IWorkAdapter;
import javatests.com.jack.king.fu.manyadpter.inter.ICooker;

/**
 * 定义CookerAdapter适配器
 */
public class CookerAdapter implements IWorkAdapter {
    @Override
    public String work(Object work) {
        return ((ICooker)work).cook();
    }

    @Override
    public boolean supports(Object work) {
        return work instanceof ICooker;
    }
}
