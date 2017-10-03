package fr.utt.if26.mouloud_tp03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String msg="Mouloud";
        setContentView(R.layout.activity_main);
        TextView tx   = (TextView)findViewById(R.id.akm);
        tx.setText(msg);








    }
}
