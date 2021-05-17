package com.example.event;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class AddEventPage extends AppCompatActivity {

    private TextInputLayout eventName,eventDomain,city,date,time, ticketPrice;

    private Button addEventBtn;

    private DatabaseReference reference;

    private FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event_page);
        initializeViews();

        addEventBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddEventDto addEventDto=new AddEventDto(eventName.getEditText().getText().toString(),eventDomain.getEditText().getText().toString(),city.getEditText().getText().toString(),date.getEditText().getText().toString(),time.getEditText().getText().toString(),ticketPrice.getEditText().getText().toString());
                reference=FirebaseDatabase.getInstance().getReference("EventsDetails");
                reference.setValue(addEventDto);
                Log.d("event Name",eventName.getEditText().getText().toString());
                Toast.makeText(AddEventPage.this, "Event Created", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initializeViews()
    {
        eventName = findViewById(R.id.addEvent_eventName);
        eventDomain = findViewById(R.id.addEvent_eventDomain);
        city = findViewById(R.id.addEvent_city);
        date = findViewById(R.id.addEvent_date);
        time = findViewById(R.id.addEvent_time);
        ticketPrice = findViewById(R.id.addEvent_ticketPrice);
        addEventBtn = findViewById(R.id.addEvent_addEventButton);
    }
}