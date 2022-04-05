package ntu.edu.vn.example.activitymain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Activitylogin extends Activity  {
    Button b1;
    EditText eduser,edpass,edemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogin);

        b1 = (Button)findViewById(R.id.btnxn);
        edemail = (EditText)findViewById(R.id.ede);
        edpass = (EditText)findViewById(R.id.edp);
        eduser = (EditText)findViewById(R.id.edu);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edemail.getText().toString().equals("") &&
                        edpass.getText().toString().equals("")&&eduser.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Enter your password and email",Toast.LENGTH_SHORT).show();
                }else{
                    openlogin();
                }
            }
        });

    }
    public void openlogin(){
        Intent it = new Intent(this,Activityhome.class);
        it.putExtra("ten",eduser.getText().toString());
        startActivity(it);

    }
}