package com.example.classregistrationapp.views;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.classregistrationapp.R;
import com.example.classregistrationapp.model.Account;
import com.example.classregistrationapp.model.DialogBuilder;
import com.example.classregistrationapp.model.Registrator;

public class MainActivity extends AppCompatActivity {
    private String incomingUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToManageCourses(View view){
        Registrator registrator = new Registrator();
        registrator.getAccountMap().insert(new Account("itmanselmo@gmail.com", "123"));
        if(login(registrator) == true) {
            Intent intent = new Intent(this, ManageCoursesActivity.class);
            startActivity(intent);
        } else {
            DialogBuilder dialogBuilder = new DialogBuilder(this);
            Dialog dialog = dialogBuilder.getBuiltDialogue("Username not found!",
                    "Sorry, there is no user with username: " + incomingUsername);
            dialog.show();
        }
    }

    public boolean login(Registrator registrator){
        EditText usernameText = (EditText)findViewById(R.id.emailText);
        incomingUsername = usernameText.getText().toString().trim();
        EditText passwordText = (EditText)findViewById(R.id.passwordText);
        if(registrator.getAccountMap().login(usernameText.getText().toString(), passwordText.getText().toString()) == true){
            return true;
        } else {
            return false;
        }
    }
}
