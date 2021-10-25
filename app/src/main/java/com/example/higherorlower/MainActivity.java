package com.example.higherorlower;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;

    void setToast(String msg){
        Toast.makeText(MainActivity.this,msg, Toast.LENGTH_SHORT).show();

    }

    public void guess(View view) {
        EditText guessedittext = (EditText) findViewById(R.id.guessedittext);
        int guessInt = Integer.parseInt(guessedittext.getText().toString());
        if (guessInt > randomnumber) {
            setToast("Lower!");
        } else if (guessInt < randomnumber) {
            setToast("Higher!");
        } else {
            setToast("That's right! try again!");
            Random rand = new Random();
            randomnumber = rand.nextInt(20) + 1;

        }
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            Random rand = new Random();
            randomnumber = rand.nextInt(20) + 1;


        }
    }
