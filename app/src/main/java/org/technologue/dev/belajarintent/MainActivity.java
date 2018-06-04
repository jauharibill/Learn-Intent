package org.technologue.dev.belajarintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMoveActivity;
    private Button btnFirstActivity;
    private Button btnDialCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button)findViewById(R.id.btn_pindah_activity);
        btnMoveActivity.setOnClickListener(this);

        btnFirstActivity = (Button)findViewById(R.id.btn_first_activity);
        btnFirstActivity.setOnClickListener(this);

        btnDialCall = (Button) findViewById(R.id.btn_dial_call);
        btnDialCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.btn_pindah_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_first_activity:
                Intent firstIntent = new Intent(MainActivity.this, FirstActivity.class);
                firstIntent.putExtra(FirstActivity.EXTRA_NAME, "BILL TANTHOWI JAUHARI");
                firstIntent.putExtra(FirstActivity.EXTRA_AGE, 23);
                startActivity(firstIntent);
                break;
            case R.id.btn_dial_call:
                String number = "082245088948";
                Intent callIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+number));
                startActivity(callIntent);
                break;

        }
    }
}
