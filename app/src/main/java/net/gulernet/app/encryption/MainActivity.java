package net.gulernet.app.encryption;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



public class MainActivity extends AppCompatActivity {


    private guvenlik guvenlik ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText veri = (EditText) findViewById(R.id.veri);
        final EditText md5edit = (EditText) findViewById(R.id.md5);
        final EditText sha1edit = (EditText) findViewById(R.id.sha1);
        final EditText sha256edit = (EditText) findViewById(R.id.sha256);
        final EditText sha384edit = (EditText) findViewById(R.id.sha384);
        final EditText sha512edit = (EditText) findViewById(R.id.sha512);
        Button cevir = (Button) findViewById(R.id.cevir);



        cevir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                md5edit.setText(guvenlik.md5(String.valueOf(veri.getText())));
                sha1edit.setText(guvenlik.sha1(String.valueOf(veri.getText())));
                sha256edit.setText(guvenlik.sha256(String.valueOf(veri.getText())));
                sha384edit.setText(guvenlik.sha384(String.valueOf(veri.getText())));
                sha512edit.setText(guvenlik.sha512(String.valueOf(veri.getText())));

            }
        });
        md5edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    clip = ClipData.newPlainText("MD5 KOPYALANDI !",md5edit.getText().toString());
                    Toast.makeText(MainActivity.this, "MD5 KOPYALANDI !", Toast.LENGTH_SHORT).show();
                    clipboard.setPrimaryClip(clip);
                }
            }
        });



        sha1edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    clip = ClipData.newPlainText("SHA1 KOPYALANDI !",sha1edit.getText().toString());
                    Toast.makeText(MainActivity.this, "SHA1 KOPYALANDI !", Toast.LENGTH_SHORT).show();
                    clipboard.setPrimaryClip(clip);
                }
            }
        });


        sha256edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    clip = ClipData.newPlainText("SHA256 KOPYALANDI !",sha256edit.getText().toString());
                    Toast.makeText(MainActivity.this, "SHA256 KOPYALANDI !", Toast.LENGTH_SHORT).show();
                    clipboard.setPrimaryClip(clip);
                }
            }
        });



        sha384edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    clip = ClipData.newPlainText("SHA384 KOPYALANDI !",sha384edit.getText().toString());
                    Toast.makeText(MainActivity.this, "SHA384 KOPYALANDI !", Toast.LENGTH_SHORT).show();
                    clipboard.setPrimaryClip(clip);
                }
            }
        });


        sha512edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    clip = ClipData.newPlainText("SHA512 KOPYALANDI !",sha512edit.getText().toString());
                    Toast.makeText(MainActivity.this, "SHA512 KOPYALANDI !", Toast.LENGTH_SHORT).show();
                    clipboard.setPrimaryClip(clip);
                }
            }
        });

    }


}
