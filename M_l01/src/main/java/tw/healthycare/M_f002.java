package tw.healthycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M_f002 extends AppCompatActivity{

    private Button b005;
    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_f002);

        b005 = (Button) findViewById(R.id.mF_b005);
        b005.setOnClickListener(btoast);
    }
    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.mF_b005:
                    intent.putExtra("class_title",getString(R.string.mL_b002));
                    intent.setClass(M_f002.this,M_f003.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };

}
