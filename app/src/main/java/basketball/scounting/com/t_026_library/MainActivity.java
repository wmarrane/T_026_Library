package basketball.scounting.com.t_026_library;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import basketball.scounting.com.mylibrary.ToolBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ToolBox.fazerSAudacao("");
    }
}
