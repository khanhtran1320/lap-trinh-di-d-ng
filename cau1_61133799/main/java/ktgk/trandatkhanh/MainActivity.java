package ktgk.trandatkhanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText canha, canhb,chieucao;
    Button tinhChuvi, tinhDientich;
    TextView ketqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chieucao = (EditText)findViewById(R.id.edth);
        canha = (EditText)findViewById(R.id.edtd);
        canhb = (EditText)findViewById(R.id.edtr);
        tinhChuvi = (Button)findViewById(R.id.btnc);
        tinhDientich = (Button)findViewById(R.id.btnd);
        ketqua = (TextView)findViewById(R.id.txkq);

        tinhChuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(canha.getText().toString());
                int b = Integer.parseInt(canhb.getText().toString());
                int kqua = (a + b) * 2;
                ketqua.setText("Chu vi hinh binh hanh la: " + kqua);
            }
        });
        tinhDientich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(canha.getText().toString());
                int h = Integer.parseInt(chieucao.getText().toString());
                int kqua = a * h;
                ketqua.setText("Dien tich hinh binh hanh la: " + kqua);
            }
        });
    }
}