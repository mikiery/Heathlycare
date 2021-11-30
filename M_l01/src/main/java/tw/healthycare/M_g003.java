package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M_g003 extends AppCompatActivity {
    private Intent i3=new Intent();
    private Button b001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_g003);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b001=(Button)findViewById(R.id.m_g003_b03);
        b001.setOnClickListener(b001on);
    }


    private View.OnClickListener b001on=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            i3.setClass(M_g003.this, M_g001.class);
            startActivity(i3);
        }
    };
}