package org.djodjo.lalog.example;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import org.djodjo.lalog.Lalog;

public class ExampleActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        Lalog.d("on create");
        Lalog.e("unreal onCreate error :)");
    }

    public void updateLog(View checkBox) {
        Lalog.d("someone checked me");
        Lalog.e("unreal checked error ");

        String chkTag = "";
        if(checkBox.getId()==R.id.chkDebugLog) {
            chkTag = ExampleLalogApp.TAG_ADEBUG;
        } else if(checkBox.getId()==R.id.chkWELog) {
            chkTag = ExampleLalogApp.TAG_REPORTER;
        }
        Lalog.getLalogger(chkTag).setActive(((CheckBox)checkBox).isChecked());

        Lalog.d("ok adjusted... happy now ??");
        Lalog.e("once more: eeeerrooooorrrr muahahahah");
    }

}
