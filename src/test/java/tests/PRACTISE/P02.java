package tests.PRACTISE;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class P02 {
@Before
public void before(){
    System.out.println("----------------Before------------------");
    System.out.println("Yeni bir test çalıştırılıyor");
    System.out.println("----------------Before------------------");
}
@After
public void after(){
    System.out.println("");
    System.out.println("-----------------After-----------");
    System.out.println("");


}

    @Test
    public void test01(){
        System.out.println("1 no'lu test çalıştırıldı");
    }
    @Test @Ignore
    public void test02(){
        System.out.println("2 no'lu test çalıştırıldı");
    }
    @Test
    public void test03(){
        System.out.println("3 no'lu test çalıştırıldı");
    }
    @Test
    public void test04(){
        System.out.println("4 no'lu test çalıştırıldı");
    }
    @Test
    public void test05(){
        System.out.println("5 no'lu test çalıştırıldı");
    }
}
