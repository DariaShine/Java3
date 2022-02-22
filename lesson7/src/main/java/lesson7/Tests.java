package lesson7;

public class Tests {

    @BeforeSuite
    public static void test1(){
        System.out.println("test 1 @BeforeSuite");
    }

    @Test(prior = 1)
    public static void test2(){
        System.out.println("test 2 @Test prior = 1");
    }

    @Test(prior = 10)
    public static void test3(){
        System.out.println("test 3 @Test prior = 10");
    }

    @Test
    public static void test4(){
        System.out.println("test 4 @Test");
    }

    @AfterSuite
    public static void test5(){
        System.out.println("test 5 @AfterSuite");
    }
}
