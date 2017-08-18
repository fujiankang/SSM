package javatests.com.jack.king.fu.oneadpter.test;
import javatests.com.jack.king.fu.oneadpter.impl.JDProgramer;
import javatests.com.jack.king.fu.oneadpter.impl.QJDCooker;
import javatests.com.jack.king.fu.oneadpter.adpter.WorkeAdapter;
import javatests.com.jack.king.fu.oneadpter.inter.ICooker;
import javatests.com.jack.king.fu.oneadpter.inter.IProgrammer;
import javatests.com.jack.king.fu.oneadpter.adpter.IWorkAdapter;
/**
 * 单个适配器的模式
 */
public class TestOoneAdpaters {
    public static void main(String[] args) {
        ICooker qjdCooker = new QJDCooker();
        IProgrammer jdProgramer = new JDProgramer();
        Object[] works = {qjdCooker, jdProgramer};
        System.out.println("=======单个适配器的模式============");
        //创建适配器对象
        IWorkAdapter adapter = new WorkeAdapter();
        //循环遍历每个工种，让每个工种对象，在适配器中逐个进行匹配
        for (Object work : works) {
            String workContent = adapter.work(work);
            System.out.println(workContent);
        }
    }
}
