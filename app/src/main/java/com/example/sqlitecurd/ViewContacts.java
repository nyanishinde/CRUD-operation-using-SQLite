package com.example.sqlitecurd;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ViewContacts extends AppCompatActivity {


    ArrayList<ContactDM> arrContact;
    RecyclerView contactRv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_contacts);

        contactRv=findViewById(R.id.contactRV);
        contactRv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        ContactAdapter adapter = new ContactAdapter(ViewContacts.this,arrContact);
        contactRv.setAdapter(adapter);

    }
}