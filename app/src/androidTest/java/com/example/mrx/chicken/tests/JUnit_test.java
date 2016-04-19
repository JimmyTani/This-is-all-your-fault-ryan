package com.example.mrx.chicken.tests;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.mrx.chicken.MainActivity;
import com.example.mrx.chicken.R;

/**
 * Created by Mr. X on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_sum(){


        mainActivity = getActivity();
        int x = mainActivity.sum(5, 5);

        assertEquals(10,x);
    }
}
