package com.example.app_08;

import android.os.Bundle;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;


public class Adapter extends AppCompatActivity {
    String[] values ={"one","two","three","one hundred","one thousand"};
    TextView tvText ,tvPos,tvComplete;
    Spinner mSpinner;
    AutoCompleteTextView singleComplete;
    MultiAutoCompleteTextView multiComplete;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.adapter);
        tvText= (TextView) findViewById(R.id.textView3);
        tvPos=(TextView) findViewById(R.id.textView5);
        mSpinner=(Spinner)findViewById(R.id.spinner1);
        ArrayAdapter<String> spinnerAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item,values);
        mSpinner.setAdapter(spinnerAdapter);
        mSpinner.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int pos, long arg3) {
                tvText.setText(mSpinner.getSelectedItem().toString());
                tvPos.setText(String.valueOf(pos));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                tvText.setText("");
                tvPos.setText("");
            }
        });
        ArrayAdapter<String> textAdapter=new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_dropdown_item,values);
        singleComplete=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        singleComplete.setAdapter(textAdapter);
        multiComplete=(MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        multiComplete.setAdapter(textAdapter);
        multiComplete.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
