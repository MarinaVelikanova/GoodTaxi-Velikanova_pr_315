package com.example.goodtaxi_velikanova_pr_315;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button button2 = (Button) findViewById(R.id.button);
            button2.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.button:
                    Intent a = new Intent(MainActivity.this, Sign_up.class);
                    startActivity(a);
                    break;
            }
        }
    }
}