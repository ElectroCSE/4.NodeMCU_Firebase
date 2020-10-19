package com.example.node_mcu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    Button ONbutton, OFFbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ONbutton = findViewById(R.id.ONbutton);
        OFFbutton = findViewById(R.id.OFFbutton);


        // Write a message to the database
       final FirebaseDatabase database = FirebaseDatabase.getInstance();



        ONbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference ledDb = database.getReference("ledDb");
                ledDb.setValue(1);
            }
        });

        OFFbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatabaseReference ledDb = database.getReference("ledDb");
                ledDb.setValue(0);
            }
        });



    }
}