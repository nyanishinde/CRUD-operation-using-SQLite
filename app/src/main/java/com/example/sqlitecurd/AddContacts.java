package com.example.sqlitecurd;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class AddContacts extends AppCompatActivity {

    MaterialButton cancelBtn,saveBtn;
    TextInputEditText nameUser,emailUser,phoneUser,addressUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contacts);

        cancelBtn=findViewById(R.id.cancelBtn);
        saveBtn=findViewById(R.id.saveBtn);
        nameUser=findViewById(R.id.userName);
        emailUser=findViewById(R.id.userEmail);
        phoneUser=findViewById(R.id.userPhone);
        addressUser=findViewById(R.id.userAddress);

        String userName=nameUser.getText().toString();
        String userEmail=emailUser.getText().toString();
        String userPhone=phoneUser.getText().toString();
        String userAddress=addressUser.getText().toString();

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }
}