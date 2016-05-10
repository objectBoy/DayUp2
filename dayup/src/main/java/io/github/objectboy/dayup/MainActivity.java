package io.github.objectboy.dayup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import io.github.objectboy.dayup.utils.DisplayUtil;
import io.github.objectboy.dayup.view.ArcStatemnt;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArcStatemnt arcTable = (ArcStatemnt) findViewById(R.id.arc_table);

//       arcTable.setSweepValue(340);
    }
}
