package ifpr.aula140323;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText real;
    EditText dolar;
    Button converterreal;
    Button converterdolar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        real = findViewById(R.id.real);
        dolar = findViewById(R.id.dolar);
        converterdolar = findViewById(R.id.converterdolar);
        converterreal = findViewById(R.id.converterreal);

        converterreal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double real1 = Double.parseDouble(real.getText().toString());

                //String real1 = real.getText().toString();
                //double real2 = Double.parseDouble(real1);
                double real3=real1 * 4.50;
                dolar.setText(String.valueOf(real3));
            }


        });
        converterdolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dolar1 = dolar.getText().toString();
                double dolar2 = Integer.parseInt(dolar1);
                double dolar3=dolar2 / 4.50;
                real.setText(String.valueOf(dolar3));
            }


        });

    }

}