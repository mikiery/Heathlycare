package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M_g002 extends AppCompatActivity {
    private Intent i=new Intent();
    private Button b001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_g002);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001=(Button)findViewById(R.id.m_g002_b07);
        b001.setOnClickListener(b001on);
    }


    private View.OnClickListener b001on=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i.setClass(M_g002.this, M_g003.class);
            startActivity(i);
        }
    };
}