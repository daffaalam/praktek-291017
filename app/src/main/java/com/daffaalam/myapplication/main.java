package com.daffaalam.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class main extends AppCompatActivity {

    int size = 35;
//    String hoby;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tampildata("Abiyyu Daffa' Alam");
    }

    public void isidata(View view) {
        EditText innama = (EditText) findViewById(R.id.nama);
        String nama = innama.getText().toString();

        RadioGroup jnsklmn = (RadioGroup) findViewById(R.id.pilihkelamin);
        int plhnjnsklmn = jnsklmn.getCheckedRadioButtonId();

        String rb_jk = ((RadioButton) findViewById(plhnjnsklmn)).getText().toString();

        CheckBox cbbaca = (CheckBox)findViewById(R.id.baca);
        CheckBox cbolga = (CheckBox)findViewById(R.id.olga);
        CheckBox cbmusic = (CheckBox)findViewById(R.id.music);
        boolean isbaca = cbbaca.isChecked();
        boolean isolga = cbolga.isChecked();
        boolean ismusic = cbmusic.isChecked();

        String datax = "Nama : " + nama;
        datax = datax + "\nJenis Kelamin : " + rb_jk;
        datax = datax + "\nUkuran Sepatu : " + size;
        datax = datax + "\nHobby : " + isbaca + isolga + ismusic;
        tampildata(datax);
    }
//    public void DataHobby()
//    {
//        String Hoby="";
//        CheckBox cbbaca = (CheckBox)findViewById(R.id.baca);
//        CheckBox cbolga = (CheckBox)findViewById(R.id.olga);
//        CheckBox cbmusic = (CheckBox)findViewById(R.id.music);
//        TextView Hobby = (TextView)findViewById(R.id.hobi);
//        if(cbbaca.isChecked())
//        {
//            Hoby = cbbaca.getText().toString();
//        }
//        else if(cbmusic.isChecked())
//        {
//            Hoby = cbmusic.getText().toString();
//        }
//        else if(cbolga.isChecked())
//        {
//            Hoby = cbolga.getText().toString();
//        }
//        Hobby.setText(String.valueOf(Hoby));
//
//        hoby = "";
//        hoby = hoby + "Hobby : " + Hoby +"\n";
//    }
    public void dcrmnt(View view) {
        if (size <= 20) {
            Toast.makeText(this, "Ukuran Terlalu Kecil", Toast.LENGTH_SHORT).show();
            return;
        }
        size = size - 1;
        tampilukuran(size);
    }

    public void incrmnt(View view) {
        if (size >= 50) {
            Toast.makeText(this, "Ukuran Terlalu Besar", Toast.LENGTH_SHORT).show();
            return;
        }
        size = size + 1;
        tampilukuran(size);
    }

    private void tampildata(String pesan) {
        TextView dataxs = (TextView) findViewById(R.id.data);
        dataxs.setText(pesan);
    }

    private void tampilukuran(int uks) {
        TextView ukspt = (TextView) findViewById(R.id.ukspt);
        ukspt.setText(""+uks);
    }
}
