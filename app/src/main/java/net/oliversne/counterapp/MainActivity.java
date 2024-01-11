package net.oliversne.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView title;
    TextView counterText;
    Button counterBtn;
    int counter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.textView2);
        counterText = findViewById(R.id.textView);
        counterBtn = findViewById(R.id.button);

        counterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText(""+increaseCounter());
            }
        });
    }

    public int increaseCounter(){
        return ++counter;
    }

}