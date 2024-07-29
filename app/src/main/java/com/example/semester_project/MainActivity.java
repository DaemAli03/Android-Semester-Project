package com.example.semester_project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private EditText todoEditText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        todoEditText = findViewById(R.id.todoEditText);
        addButton = findViewById(R.id.addButton);

        // Set add button click listener
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the input from EditText
                String todoText = todoEditText.getText().toString();

                // Check if the input is not empty
                if (!todoText.isEmpty()) {
                    // Add the item to the to-do list (This is a placeholder for actual logic)
                    // For example, you can add the item to a RecyclerView or a ListView

                    // Show a success message
                    Toast.makeText(MainActivity.this, "Item added: " + todoText, Toast.LENGTH_SHORT).show();

                    // Clear the input field
                    todoEditText.setText("");
                } else {
                    // Show an error message
                    Toast.makeText(MainActivity.this, "Please enter a to-do item", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
