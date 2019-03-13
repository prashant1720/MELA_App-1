package com.example.prashant.mela_money;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.textclassifier.TextClassification;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Payment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        TextView textView = findViewById(R.id.eventNameForPayment);
        textView.setText(Madapter.event_Name);

        final EditText editText = findViewById(R.id.uname);
        final EditText editText1 = findViewById(R.id.idno);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editText.getText().toString();
//                String rno = editText1.getText().toString();
//                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getApplicationContext());
//                alertDialog.setPositiveButton("Sure", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                }).setTitle("Do you want to continue?").setMessage("Are you sure to continue?").show();


                startActivity(new Intent(Payment.this, MerchantActivity.class));
//
           }
        });

    }

}
