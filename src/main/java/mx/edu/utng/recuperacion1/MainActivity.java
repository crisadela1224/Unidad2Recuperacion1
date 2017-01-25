package mx.edu.utng.recuperacion1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNumber1;

    private Button btnCalculate;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumber1=(EditText) findViewById(R.id.edt_number1);

        btnCalculate=(Button)findViewById(R.id.btn_calculate);

        txvResult=(TextView) findViewById(R.id.txv_result);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double number1=Float.parseFloat(edtNumber1.getText().toString());

                double result=0;

                result=(15*(Math.pow(number1, 5))-25*(Math.pow(number1, 3)))/(5*Math.pow(number1, 2));

                txvResult.setText("El resultado es: "+result);
            }
        });


    }
}