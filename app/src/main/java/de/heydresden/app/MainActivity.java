package de.heydresden.app;

import com.thefinestartist.finestwebview.FinestWebView;
import com.thefinestartist.finestwebview.FinestWebViewActivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new FinestWebView.Builder(this)
                .disableIconClose(true)
                .statusBarColorRes(R.color.colorAccent)
                .dividerColorRes(R.color.colorPrimaryDark)
                .showIconClose(false)
                .show("http://www.hey-dresden.de/");

    }
}
