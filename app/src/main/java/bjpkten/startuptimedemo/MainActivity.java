package bjpkten.startuptimedemo;

import android.os.Trace;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Trace.beginSection("kodulf");
        setContentView(R.layout.activity_main);
        Trace.endSection();
    }
}
