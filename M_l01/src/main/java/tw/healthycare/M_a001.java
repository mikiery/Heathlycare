package tw.healthycare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class M_a001 extends AppCompatActivity {

    private Intent intenta=new Intent();
    private Button im07;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_a001);
        setupviewcomponent();
    }

    private void setupviewcomponent() {
        Spinner s001 = (Spinner) findViewById(R.id.m_a001_s001);
        im07=(Button)findViewById(R.id.m_a001_t007);
        im07.setOnClickListener(im07on);
        ArrayAdapter<CharSequence> adapterSexList =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.m_a001_s001,
                        R.layout.spinner_item);
        s001.setAdapter(adapterSexList);
    }


    private View.OnClickListener im07on=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            intenta.setClass(M_a001.this,M_a002.class);
            startActivity(intenta);
        }
    };

}