package com.example.celso.lifecycleactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate",
                Toast.LENGTH_LONG).show();
        btn=(Button) findViewById(R.id.id_btn);

        btn.setOnClickListener(this);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "onStart",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "onResume",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "onPause",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy",
                Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.id_btn) {
            Intent i=new Intent(this, SecondActivity.class);
            this.startActivity(i);
        }
    }
}
