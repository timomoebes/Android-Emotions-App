package com.example.myapplication2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextEmotion;
    private Button buttonSubmit;
    private TextView textViewResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmotion = findViewById(R.id.editTextEmotion);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        textViewResponse = findViewById(R.id.textViewResponse);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emotion = editTextEmotion.getText().toString().toLowerCase();
                provideSupport(emotion);
            }
        });
    }

    private void provideSupport(String emotion) {
        if (emotion.contains("sad")) {
            textViewResponse.setText("I'm here for you. It's okay to feel this way, and I'm glad you told me.");
        } else if (emotion.contains("happy")) {
            textViewResponse.setText("That's wonderful to hear! Keep enjoying your day!");
        } else {
            textViewResponse.setText("Thank you for sharing your feelings with me.");
        }
    }
}
