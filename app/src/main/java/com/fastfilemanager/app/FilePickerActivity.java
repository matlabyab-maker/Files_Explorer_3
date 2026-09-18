package com.fastfilemanager.app;
import android.app.*; import android.os.*; import android.content.*;
public class FilePickerActivity extends Activity { @Override public void onCreate(Bundle b){super.onCreate(b); Intent i=new Intent(Intent.ACTION_OPEN_DOCUMENT); i.addCategory(Intent.CATEGORY_OPENABLE); i.setType("*/*"); startActivityForResult(i,1);} }
