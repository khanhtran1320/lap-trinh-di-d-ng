package cntt61.khanh61133799;

import static android.media.CamcorderProfile.get;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> al;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView)findViewById(R.id.listv);
        TextView txt = (TextView) findViewById(R.id.edtxt);
        al = new ArrayList();
        al.add("Tèo");
        al.add("Tí");
        al.add("Bin");
        al.add("Bo");
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_list_item_1, al);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedItem = (String) adapterView.getItemAtPosition(position);
                txt.setText(selectedItem);

            }
        });
    }

}