package uk.ac.kent.pn94.demoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String _TAG = "MainActivity";

    private EditText nameField;
    private Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind UI elements
        nameField = (EditText) findViewById(R.id.name_field);
        submitBtn = (Button) findViewById(R.id.submit_btn);
        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d(_TAG, "Button clicked");
                //adding the string from nameField to userName string
                String userName = nameField.getText().toString();
                

                //using intent to pass the string to the Output Activity from this activity.
                Intent intent = new Intent(MainActivity.this, OutputActivity.class);
                intent.putExtra("USER_MSG", userName);
                //switching activities
                startActivity(intent);
            }
        });
    }
}
