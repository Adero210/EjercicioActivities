package ceti.edu.helping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button buton_go;
    EditText text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        buton_go = findViewById(R.id.boton_go);


        buton_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  i = new Intent(MainActivity.this, B_Activity.class);
                startActivity(i);
            }
        });


    }


    @Override
    public void  onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String fresa = String.valueOf(text.getText());
        outState.putString("Luis",fresa);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String fresa2 = savedInstanceState.getString("Luis");
        text.setText(fresa2);

    }
}
