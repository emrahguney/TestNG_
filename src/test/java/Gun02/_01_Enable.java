package Gun02;

import Utility.BaseDriver;
import org.testng.annotations.Test;

public class _01_Enable extends BaseDriver {

    @Test
    void test1(){//bunda public zorunlu degildir ama baska yerde calistircaksan public koyman lazim//junitte public koymak zorunluydu

        System.out.println("test 1");

    }
    @Test(enabled=false)
    void test2(){
        System.out.println("test 2");
    }
    @Test
    void test3(){
        System.out.println("test 3");
    }

}
