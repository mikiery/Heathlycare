package tw.healthycare;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class M_g999 extends AppCompatActivity {
    private Intent intent=new Intent();
    private Button b01,b02,b03,b04,b05,b06;
    private MediaPlayer startmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_g999);
        setupViewcomponent();
    }

    private void setupViewcomponent() {
        b01 = (Button) findViewById(R.id.m_g999_b01);
        b02 = (Button) findViewById(R.id.m_g999_b02);
        b03 = (Button) findViewById(R.id.m_g999_b03);
        b04 = (Button) findViewById(R.id.m_g999_b04);
        b05 = (Button) findViewById(R.id.m_g999_b05);
        b06 = (Button) findViewById(R.id.m_g999_b06);
        b01.setOnClickListener(b01on);
        b02.setOnClickListener(b01on);
        b03.setOnClickListener(b01on);
        b04.setOnClickListener(b01on);
        b05.setOnClickListener(b01on);
        b06.setOnClickListener(b01on);

        startmusic= MediaPlayer.create(getApplication(), R.raw.adstmh2);
        startmusic.setLooping(true);
        startmusic.start();
    };

    private View.OnClickListener b01on =new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.m_g999_b01:
                    intent.setClass(M_g999.this, M_g001.class);
                    break;
                case R.id.m_g999_b02:
                    intent.setClass(M_g999.this, M_g003.class);
                    break;
                case R.id.m_g999_b05:
                    intent.setClass(M_g999.this, M_g002.class);
                    break;
                case R.id.m_g999_b04:
                    intent.setClass(M_g999.this, M_g004.class);
                    break;
                case R.id.m_g999_b03:
                    intent.setClass(M_g999.this, M_g101.class);
                    break;
                case R.id.m_g999_b06:
                    intent.setClass(M_g999.this, M_g005.class);
                    break;
            }
            startActivity(intent);
        }
    };

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(startmusic.isPlaying()){startmusic.pause();}else{startmusic.start();};
    }

    @Override
    protected void onStop() {
        super.onStop();
        if(startmusic.isPlaying()){startmusic.stop();};
    }
}
