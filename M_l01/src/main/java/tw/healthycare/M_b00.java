package tw.healthycare;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class M_b00 extends AppCompatActivity {


    private Button mB_01_b003;
    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mb001);
        setupviewcomponent();
    }
    private void setupviewcomponent() {

        //設定class標題
        Intent intent=this.getIntent();
        String mode_title=intent.getStringExtra("class_title");
        this.setTitle(mode_title);


        mB_01_b003 = (Button) findViewById(R.id.mB_b003);
        mB_01_b003.setOnClickListener(btoast);


    }

    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.mB_b003:
                    intent.putExtra("class_title",getString(R.string.mL_b001));
                    intent.setClass(M_b00.this,M_b002.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };

}
