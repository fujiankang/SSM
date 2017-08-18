package javatests.com.jack.king.fu.oneadpter.adpter;

import javatests.com.jack.king.fu.oneadpter.inter.ICooker;
import javatests.com.jack.king.fu.oneadpter.inter.IProgrammer;
import javatests.com.jack.king.fu.oneadpter.adpter.IWorkAdapter;

//适配器类
public class WorkeAdapter implements IWorkAdapter {
    @Override
    public String work(Object work) {
        String workContent="";
        //若传来的的对象是厨师则调用cook()方法
        if(work instanceof ICooker){
            workContent= ((ICooker)work).cook();
        }
        //若传来的对象是程序员则调用program方法
        if(work instanceof IProgrammer){
            workContent= ((IProgrammer)work).program();
        }
        return workContent;
    }
}
