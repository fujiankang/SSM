package javatests.com.jack.king.fu.noadpter.test;

import javatests.com.jack.king.fu.noadpter.inter.ICooker;
import javatests.com.jack.king.fu.noadpter.inter.IProgrammer;
import javatests.com.jack.king.fu.noadpter.impl.JDProgramer;
import javatests.com.jack.king.fu.noadpter.impl.QJDCooker;

public class TestNoadapter {
    public static void main(String[] args) {
        ICooker qjdCooker = new QJDCooker();
        IProgrammer jdProgramer = new JDProgramer();
        System.out.println("========非适配器模式===========");
        System.out.println(qjdCooker.cook());
        System.out.println(jdProgramer.program());

    }
}
