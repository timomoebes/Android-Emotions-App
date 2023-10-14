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
        } else if (emotion.contains("joyful")){
            textViewResponse.setText("That's wonderful! What's bringing you so much joy today?");
        } else if (emotion.contains("excited")){
            textViewResponse.setText("Excitement is contagious! What's the special occasion?");
        } else if (emotion.contains("nervous")) {
            textViewResponse.setText("It's normal to feel nervous. Is there anything I can do to help?");
        } else if (emotion.contains("angry")) {
            textViewResponse.setText("I'm here for you. It's okay to feel angry. Want to talk about it?");
        } else if (emotion.contains("frustrated")) {
            textViewResponse.setText("Frustration can be tough. Talking about it might help. What's going on?");
        } else if (emotion.contains("bored")){
            textViewResponse.setText("Let's shake things up a bit. Want suggestions for things to do?");
        } else if (emotion.contains("lonely")) {
            textViewResponse.setText("I'm really sorry to hear that. I'm here for you, let's chat.");
        } else if (emotion.contains("overwhelmed")) {
            textViewResponse.setText("Take a deep breath. It's okay to feel overwhelmed. Want to share more?");
        } else if (emotion.contains("confident")) {
            textViewResponse.setText("Confidence is empowering! Keep up the positive vibes.");
        } else if (emotion.contains("loved")) {
            textViewResponse.setText("That's heartwarming! Love makes the world go round.");
        } else if (emotion.contains("hopeful")) {
            textViewResponse.setText("Hope is a powerful force. Stay hopeful, and amazing things can happen.");
        } else if (emotion.contains("guilty")) {
            textViewResponse.setText("It's a heavy feeling, but it's a step towards making things right. Want to discuss it?");
        } else if (emotion.contains("jealous")) {
            textViewResponse.setText("Jealousy is a natural emotion. It's how we handle it that matters. Want to talk about it?");
        } else if (emotion.contains("anxious")) {
            textViewResponse.setText("I'm here to help. Talking about what's making you anxious may help ease your mind.");
        } else if (emotion.contains("grateful")) {
            textViewResponse.setText("Gratitude is a wonderful feeling. What are you grateful for today?");
        } else if (emotion.contains("optimistic")) {
            textViewResponse.setText("Optimism is a beacon of hope. Keep shining bright!");
        } else if (emotion.contains("pessimistic")) {
            textViewResponse.setText("It's tough when things look grim. I'm here to listen if you want to talk about it.");
        } else if (emotion.contains("curious")) {
            textViewResponse.setText("Curiosity is the spark of learning! What's piqued your interest?");
        } else if (emotion.contains("impatient")) {
            textViewResponse.setText("Patience can be challenging. Is there something specific you're waiting for?");
        } else if (emotion.contains("relieved")) {
            textViewResponse.setText("Relief is like a breath of fresh air. I'm glad you're feeling better!");
        }

        else {
            textViewResponse.setText("Thank you for sharing your feelings with me.");
        }
    }
}
