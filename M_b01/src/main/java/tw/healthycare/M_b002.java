package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class M_b002 extends AppCompatActivity {

    private String AA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mb002);
        setupViewcomponent();

    }
    private void setupViewcomponent(){

        Intent intent=this.getIntent();
        AA
                =intent.getStringExtra("00");
            this.setTitle(AA);



        }



    }



