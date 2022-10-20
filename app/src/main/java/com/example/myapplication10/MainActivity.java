 package com.example.myapplication10;

 import androidx.appcompat.app.AppCompatActivity;

 import android.content.Intent;
 import android.os.Bundle;
 import android.view.View;
 import android.view.Window;
 import android.view.WindowManager;
 import android.widget.Button;

 import com.example.myapplication10.R;

 public class MainActivity extends AppCompatActivity {


     Button button;

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);

         requestWindowFeature(Window.FEATURE_NO_TITLE);
         this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

         setContentView(R.layout.activity_main);

         button = findViewById(R.id.button3);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i1 = new Intent(getApplicationContext(), MainActivity3.class);
                 startActivity(i1);
             }
         });


         button = findViewById(R.id.button);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i2 = new Intent(getApplicationContext(), MainActivity6.class);
                 startActivity(i2);
             }
         });

         button = findViewById(R.id.button4);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i3 = new Intent(getApplicationContext(), MainActivity4.class);
                 startActivity(i3);
             }
         });


         button = findViewById(R.id.button5);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i3 = new Intent(getApplicationContext(), MainActivity2.class);
                 startActivity(i3);
             }
         });



     }
 }