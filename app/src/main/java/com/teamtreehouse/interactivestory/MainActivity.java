package com.teamtreehouse.interactivestory;

<<<<<<< HEAD
import android.content.Intent;
=======
>>>>>>> 878f194c63b2287aa1ad191b207581b94ee56a82
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
=======
import android.widget.Toast;
>>>>>>> 878f194c63b2287aa1ad191b207581b94ee56a82

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText)findViewById(R.id.nameEditText);
        startButton = (Button)findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameField.getText().toString();
<<<<<<< HEAD
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("name", name);
        startActivity(intent);
=======
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
            }
        });
>>>>>>> 878f194c63b2287aa1ad191b207581b94ee56a82
    }
}














