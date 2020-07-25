package id.sch.smktelkom.www;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText inputNama, inputTtl, inputAlamat, inputNomer, inputHobi,
            inputKeinginan;
    Button btnSimpan;
    TextView hasilNama, hasilTtl, hasilAlamat, hasilNomer, hasilHobi, hasilKeinginan;

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

        btnSimpan.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_simpan) {
            String nama = inputNama.getText().toString().trim();
            String ttl = inputTtl.getText().toString().trim();
            String alamat = inputAlamat.getText().toString().trim();
            String nomer = inputNomer.getText().toString().trim();
            String hobi = inputHobi.getText().toString().trim();
            String keinginan = inputKeinginan.getText().toString().trim();

            boolean isEmptyFields = false;


            if (TextUtils.isEmpty(nama)) {
                isEmptyFields = true;
                inputNama.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(ttl)) {
                isEmptyFields = true;
                inputTtl.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(alamat)) {
                isEmptyFields = true;
                inputAlamat.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(nomer)) {
                isEmptyFields = true;
                inputNomer.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(hobi)) {
                isEmptyFields = true;
                inputHobi.setError("Field ini tidak boleh kosong");
            }
            if (TextUtils.isEmpty(keinginan)) {
                isEmptyFields = true;
                inputKeinginan.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                hasilNama.setText(String.valueOf(inputNama));
                hasilTtl.setText(String.valueOf(inputTtl));
                hasilAlamat.setText(String.valueOf(inputAlamat));
                hasilNomer.setText(String.valueOf(inputNomer));
                hasilHobi.setText(String.valueOf(inputHobi));
                hasilKeinginan.setText(String.valueOf(inputKeinginan));


            }

        }
    }
}

