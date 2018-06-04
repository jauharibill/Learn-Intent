package org.technologue.dev.belajarintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FirstActivity extends AppCompatActivity {

    public static String EXTRA_NAME = "EXTRA NAME";
    public static String EXTRA_AGE = "EXTRA AGE";
    private TextView dataFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        dataFirst = (TextView)findViewById(R.id.first_view_data);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String text = "My Name : "+ name + " My Age : "+age;
        dataFirst.setText(text);
    }
}
