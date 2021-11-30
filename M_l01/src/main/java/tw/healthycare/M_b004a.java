package tw.healthycare;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class M_b004a extends AppCompatActivity {

    private Button mb_04a_b004;
    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mb004a);


        mb_04a_b004 = (Button) findViewById(R.id.mB_b004);
        mb_04a_b004.setOnClickListener(btoast);

    }

    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.mB_b004:
                    intent.putExtra("class_title",getString(R.string.mL_b002));
                    intent.setClass(M_b004a.this,M_f001.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };

}
