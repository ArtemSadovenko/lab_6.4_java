package com.company;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static com.company.Main.less_c;
import static com.company.Main.sum;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void TestLess_c() {
        double []a = new double[]{1, 2, 3, 4};
        double c = 8;
        int real = less_c(a , 4, 8);
        int ex = 4;
        Assert.assertEquals(ex, real);
    }
}