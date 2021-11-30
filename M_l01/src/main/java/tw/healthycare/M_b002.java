package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M_b002  extends AppCompatActivity {

    private Button mb_02_b001;
    private Intent intent =new Intent();//如果沒有 =new Intent()，會閃退


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mb002);

        mb_02_b001 = (Button) findViewById(R.id.mB_b001);
        mb_02_b001.setOnClickListener(btoast);

    }

    private View.OnClickListener btoast=new View.OnClickListener(){

        @Override
        public void onClick(View v) {

            switch(v.getId()){
                case R.id.mB_b001:
                    intent.putExtra("class_title",getString(R.string.mL_b002));
                    intent.setClass(M_b002.this,M_b003.class); //程式 從 M0607 到 M0500
                    break;

            }

            startActivity(intent);

        }
    };
}
