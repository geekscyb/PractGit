package seleniumFrameworks;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {

    static String str;

    @Test
    public void check(){
        System.out.println("Day1 1" + str);
    }

    @Test(dependsOnMethods = {"check"})
    public void atst(){
        System.out.println("Day1 2" + str);
    }

    @Test
    public void bt(){
        System.out.println("Day1 3" + str);
    }

    @BeforeTest
    public void bfr(){
        str = "day 1 str";
        System.out.println("Before from day1" + str);

    }
    @BeforeSuite
    public void abfrs(){
        System.out.println("Before suite Day 1");
    }
}