package com.dcw.progressdialogdemo;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        showDialog();
        setContentView(R.layout.activity_main);

    }

    /**
     * 显示Dialog
     */
    private void showDialog() {
        if (dialog == null) {
            dialog = LoadingProgressDialog.createLoadingDialog(this, "加载中...");
            dialog.show();
        }
    }

    /**
     * 关闭Dialog
     */
    private void closeDialog() {
        if (dialog != null) {
            dialog.dismiss();
            dialog = null;
        }

    }

}
