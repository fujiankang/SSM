package javatests.com.jack.king.fu.manyadpter.test;
import javatests.com.jack.king.fu.manyadpter.adpter.impl.CookerAdapter;
import javatests.com.jack.king.fu.manyadpter.adpter.impl.ProgrammerAdapter;
import javatests.com.jack.king.fu.manyadpter.impl.JDProgramer;
import javatests.com.jack.king.fu.manyadpter.impl.QJDCooker;
import javatests.com.jack.king.fu.manyadpter.inter.ICooker;
import javatests.com.jack.king.fu.manyadpter.inter.IProgrammer;
import javatests.com.jack.king.fu.manyadpter.adpter.IWorkAdapter;
import java.util.ArrayList;
import java.util.List;

public class TestManyAdpaters {
    public static void main(String[] args) {
        ICooker qjdCooker = new QJDCooker();
        IProgrammer jdProgramer = new JDProgramer();
        Object[] works = {qjdCooker, jdProgramer};
        System.out.println("=======多适配器的模式============");
        //循环遍历每个工种，让每个工种对象，在适配器中逐个进行匹配
        for (Object work : works) {
            IWorkAdapter adapter = getAdapter(work);
            System.out.println(adapter.work(work));
        }
    }

    /**
     * 匹配适配器
     */
    private static IWorkAdapter getAdapter(Object work) {
        List<IWorkAdapter> adapters = getAllAdapters();
        for (IWorkAdapter adapter : adapters) {
            //是否支持这个适配器
            if (adapter.supports(work)) {
                return adapter;
            }

        }
        return null;
    }

    //获取所有的适配器
    private static List<IWorkAdapter> getAllAdapters() {
        List<IWorkAdapter> adapters = new ArrayList<IWorkAdapter>();
        adapters.add(new CookerAdapter());
        adapters.add(new ProgrammerAdapter());
        return adapters;
    }
}
