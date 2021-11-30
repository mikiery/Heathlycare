package tw.healthycare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class M_b001 extends AppCompatActivity {

    private Button b001;
    private Intent intent=new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mb001);
        setupviewcomponent();

    }
    private void setupviewcomponent(){

        b001=(Button)findViewById(R.id.mB_b003);






        b001.setOnClickListener(b001on);

    }

    private View.OnClickListener b001on=new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            switch (v.getId()){

                case R.id.mB_b003:

                    intent.putExtra("00", getString(R.string.m0000_b0500));
                    intent.setClass(M_b001.this,M_b002.class);

                    break;



            }
startActivity(intent);
        }
    };

}