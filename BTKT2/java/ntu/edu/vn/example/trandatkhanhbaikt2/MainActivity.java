package ntu.edu.vn.example.trandatkhanhbaikt2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioButton r13, r15, r18;
    Button tt;
    EditText bp;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bp = (EditText) findViewById(R.id.edtN);
        textView = (TextView) findViewById(R.id.tvkq1);
        r13 = (RadioButton) findViewById(R.id.radio_13);
        r15 = (RadioButton) findViewById(R.id.radio_15);
        r18 = (RadioButton) findViewById(R.id.radio_18);
        tt = (Button) findViewById(R.id.btntinh);
        tt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float nhap = Float.parseFloat(bp.getText().toString());
                if (r13.isChecked()) {
                    float tt = (float) (nhap * 0.13);
                    textView.setText("Your tip will be $" + tt);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + tt, Toast.LENGTH_SHORT).show();
                } else if (r15.isChecked()) {
                    float tt = (float) (nhap * 0.15);
                    textView.setText("Your tip will be $" + tt);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + tt, Toast.LENGTH_SHORT).show();
                } else if (r18.isChecked()) {
                    float tt = (float) (nhap * 0.18);
                    textView.setText("Your tip will be $" + tt);
                    Toast.makeText(MainActivity.this, "Your tip will be $" + tt, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}