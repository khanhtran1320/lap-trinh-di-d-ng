package ntu.edu.vn.example.activitymain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activityhome extends AppCompatActivity {
    private Button bttn1,bttn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityhome);
        Button button1 = (Button) findViewById(R.id.btn1);
        Button button2 = (Button) findViewById(R.id.btn2);
        TextView msg=(TextView) findViewById(R. id.txtv);
        String user=getIntent ().getExtras ().getString("ten");
        msg.setText("Chào mừng "+user);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivitylogin();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmainlogin();
            }
        });
    }
    public void openactivitylogin(){
        Intent it = new Intent(this,Activitylogin.class);
        startActivity(it);
    }
    public void openmainlogin(){
        Intent it = new Intent(this,MainActivity.class);
        startActivity(it);
    }
}
