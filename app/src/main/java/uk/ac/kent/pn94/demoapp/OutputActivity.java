package uk.ac.kent.pn94.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {

    TextView outputMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        //created the outputMsg text view
        outputMsg = (TextView) findViewById(R.id.output_msg);


        //using intent to get the userNAme from the Main Activity to Output activity
        Intent intent = getIntent();
        String userName = intent.getStringExtra("USER_MSG");
        outputMsg.setText("Hello " + userName);
    }
}
