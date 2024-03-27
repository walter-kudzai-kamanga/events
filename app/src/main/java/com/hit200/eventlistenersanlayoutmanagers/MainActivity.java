package com.hit200.eventlistenersanlayoutmanagers;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private EditText inputEditText;
    private Button calculateButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEditText = findViewById(R.id.inputEditText);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = inputEditText.getText().toString();
                if (!input.isEmpty()) {
                    double number = Double.parseDouble(input);
                    double square = number * number;
                    resultTextView.setText(String.format("Square: %.2f", square));
                } else {
                    resultTextView.setText("Please enter a number");
                }
            }
        });
    }
}