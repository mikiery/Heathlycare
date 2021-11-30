package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class M_g001 extends AppCompatActivity {
    private Intent i2=new Intent();
    private Button b001,b002;
    private ImageView im01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_g001);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001=(Button)findViewById(R.id.m_g001_b02);
        b002=(Button)findViewById(R.id.m_g001_b01);
        im01=(ImageView)findViewById(R.id.m_g001_im01);
        b001.setOnClickListener(b001on);
        b002.setOnClickListener(b001on);
        im01.setOnClickListener(b001on);
    }

    private View.OnClickListener b001on=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.m_g001_b02:
                i2.setClass(M_g001.this, M_g003.class);
                startActivity(i2);
                break;
                case R.id.m_g001_b01:
                i2.setClass(M_g001.this, M_g002.class);
                startActivity(i2);
                break;
                case R.id.m_g001_im01:
                i2.setClass(M_g001.this, M_g004.class);
                    startActivity(i2);
            }
        }
    };
}