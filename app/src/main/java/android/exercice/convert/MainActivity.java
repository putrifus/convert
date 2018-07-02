package android.exercice.convert;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convertion(View view) {
        EditText celc = findViewById(R.id.num_cel);
        EditText fara = findViewById(R.id.num_far);
        TextView c = findViewById(R.id.txt_c);
        TextView f = findViewById(R.id.txt_f);
        Temperature temp;

        if (celc.getText().toString().equals("") && !(fara.getText().toString().equals(""))) {
            temp = new Temperature(Double.parseDouble(fara.getText().toString()), "f");
            c.setText(String.valueOf(temp.getCel()) + " °C");
            f.setText(fara.getText().toString() + " °F");
            fara.setText("");
        } else if (fara.getText().toString().equals("") && !(celc.getText().toString().equals(""))) {
            temp = new Temperature(Double.parseDouble(celc.getText().toString()), "c");
            f.setText(String.valueOf(temp.getFar()) + " °F");
            c.setText(celc.getText().toString() + " °C");
            celc.setText("");
        } else {
            System.out.println("impossible de convertir");
        }
    }
}
