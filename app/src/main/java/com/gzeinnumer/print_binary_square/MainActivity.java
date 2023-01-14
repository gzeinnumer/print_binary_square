package com.gzeinnumer.print_binary_square;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String res = print_binary_square(2);
        Log.d(TAG, "onCreate: "+res);

        res = print_binary_square(5);
        Log.d(TAG, "onCreate: "+res);
    }

    String print_binary_square(int count) {
        int index = 0;
        String str = "\n";
        for (int i = 0; i < count; i++) {
            index++;
            String c = "";
            if (index%2!=0)
                c += "0";
            else
                c += "1";
            for (int j = 0; j < count; j++) {
                str += c;
                if (c.equals("1"))
                    c = "0";
                else
                    c = "1";
            }
            str += "\n";
        }

        return str;
    }
}