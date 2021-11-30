package tw.healthycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M_g101 extends AppCompatActivity {
    private Intent intentg1=new Intent();
    private Button b001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_g101);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001=(Button)findViewById(R.id.mG_b103);
        b001.setOnClickListener(b001on);
    }

    private View.OnClickListener b001on=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            intentg1.setClass(M_g101.this,M_g201.class);
            startActivity(intentg1);
        }
    };
}