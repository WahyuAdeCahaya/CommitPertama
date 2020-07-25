package id.sch.smktelkom.www;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText inputNama;

    private EditText inputTtl;
    private EditText inputAlamat;
    private EditText inputNomer;
    private EditText inputHobi;
    private EditText inputKeinginan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasilNama = findViewById(R.id.inputNama);
        hasilTtl = findViewById(R.id.inputTtl);
        hasilAlamat = findViewById(R.id.inputAlamat);
        hasilNomer = findViewById(R.id.inputNomer);
        hasilHobi = findViewById(R.id.inputHobi);
        hasilKeinginan = findViewById(R.id.inputKeinginan);
    }


    @Override
    public void onClick(View v) {

    }
}

