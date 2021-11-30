package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class M_f001 extends AppCompatActivity {

    private Button b003;
    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_f001);
        setupviewcomponent();
    }

    private void setupviewcomponent() {

        //設定class標題
        Intent intent=this.getIntent();
        String mode_title=intent.getStringExtra("class_title");
        this.setTitle(mode_title);


        b003 = (Button) findViewById(R.id.mF_b003);
        b003.setOnClickListener(btoast);


    }

    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.mF_b003:
                    intent.putExtra("class_title",getString(R.string.mL_b002));
                    intent.setClass(M_f001.this,M_f002.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };
}