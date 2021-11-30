package tw.healthycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M_l001 extends AppCompatActivity {
    private Intent intentL=new Intent();
    private Button b001,b002,b003,b004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_l001);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001=(Button)findViewById(R.id.mL_b001);
        b002=(Button)findViewById(R.id.mL_b002);
        b003=(Button)findViewById(R.id.mL_b003);
        b004=(Button)findViewById(R.id.mL_b004);
        b001.setOnClickListener(b001on);
        b002.setOnClickListener(b001on);
        b003.setOnClickListener(b001on);
        b004.setOnClickListener(b001on);
    }

    private View.OnClickListener b001on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.mL_b001:
                    intentL.setClass(M_l001.this,M_b00.class);
                    startActivity(intentL);
                    break;
                case R.id.mL_b002:
                    intentL.setClass(M_l001.this,M_f001.class);
                    startActivity(intentL);
                    break;
                case R.id.mL_b003:
                    intentL.setClass(M_l001.this,WelcomeActivity.class);
                    startActivity(intentL);
                    break;
                case R.id.mL_b004:
                    intentL.setClass(M_l001.this,M_a001.class);
                    startActivity(intentL);
                    break;
            }
        }
    };
}