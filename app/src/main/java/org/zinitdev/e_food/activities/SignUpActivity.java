package org.zinitdev.e_food.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.zinitdev.e_food.R;

public class SignUpActivity extends AppCompatActivity {
    private EditText edtFullname, edtEmail, edtPassword, edtConfirmPwd, edtPhone;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        edtFullname = (EditText) findViewById(R.id.editText_full_name);
        edtEmail = (EditText) findViewById(R.id.editText_email);
        edtPassword = (EditText) findViewById(R.id.editText_password);
        edtConfirmPwd = (EditText) findViewById(R.id.editText_confirmPassword);
        edtPhone = (EditText) findViewById(R.id.editText_phone);
        btnSignUp = (Button) findViewById(R.id.button_sign_up);

        btnSignUp.setOnClickListener(v -> signUp());
    }

    private void signUp() {
        String fullName = edtFullname.getText().toString().trim();
        String email = edtEmail.getText().toString().trim();
        String password = edtPassword.getText().toString().trim();
        String confirmPwd = edtConfirmPwd.getText().toString().trim();
        String phone = edtPhone.getText().toString().trim();

        if (fullName.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPwd.isEmpty() || phone.isEmpty()) {
            Toast.makeText(this, "Please enter complete registration information", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(this, "Sign Up Success!", Toast.LENGTH_SHORT).show();
    }

}