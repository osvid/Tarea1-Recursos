package uv.edu.recursosdemo;

import android.app.Activity;
import android.os.Bundle;

import java.util.Locale;

import uv.edu.customlog.InfoLog;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume(){
        String app = getResources().getString(R.string.app_name);
        InfoLog.log(app, Locale.getDefault().getDisplayLanguage());
        super.onResume();
    }
}
