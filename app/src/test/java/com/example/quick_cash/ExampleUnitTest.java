package com.example.quick_cash;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

import com.example.quick_cash.Credentials.LoginActivity;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    static LoginActivity loginActivity;

    @BeforeClass
    public static void setup() {
        loginActivity = new LoginActivity();
    }

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}