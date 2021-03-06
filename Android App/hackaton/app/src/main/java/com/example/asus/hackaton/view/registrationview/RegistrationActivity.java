package com.example.asus.hackaton.view.registrationview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.asus.hackaton.R;
import com.example.asus.hackaton.presenter.presenterreg.PresenterRegistration;
import com.example.asus.hackaton.view.loginingview.LoginActivity;

public class RegistrationActivity extends AppCompatActivity {
    private EditText familyEditText;
    private EditText nameEditText;
    private EditText snameEeditText;
    private EditText growthEditText;
    private EditText birthdayEditText;
    private EditText genderEditText;
    private EditText loginEditText;
    private EditText passwordEditText;

    private String fname;
    private String name;
    private String sname;
    private int growth;
    private String birthday;
    private String gender;
    private String login;
    private String password;

    private Button buttonRegistration;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        buttonRegistration = (Button) findViewById(R.id.reg_button);
        familyEditText = (EditText) findViewById(R.id.fname_editText);
        nameEditText = (EditText) findViewById(R.id.name_editText);
        snameEeditText = (EditText) findViewById(R.id.sname_editText);
        growthEditText = (EditText) findViewById(R.id.growth_editText);
        birthdayEditText = (EditText) findViewById(R.id.bdate_editText);
        genderEditText = (EditText) findViewById(R.id.sex_editText);
        loginEditText = (EditText) findViewById(R.id.login_editText);
        passwordEditText = (EditText) findViewById(R.id.password_editText);





        buttonRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fname = familyEditText.getText().toString();
                name = nameEditText.getText().toString();
                sname = snameEeditText.getText().toString();
                growth = Integer.parseInt(growthEditText.getText().toString());
                gender = genderEditText.getText().toString();
                login = loginEditText.getText().toString();
                password = passwordEditText.getText().toString();
                birthday = birthdayEditText.getText().toString();

                PresenterRegistration presenterRegistration = new PresenterRegistration(fname,password,login,birthday,growth,
                                                                                        name,sname,gender);

                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });
    }


}
