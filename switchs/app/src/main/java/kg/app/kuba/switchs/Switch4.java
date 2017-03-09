package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static kg.app.kuba.switchs.Mainfone.text4;

public class Switch4 extends AppCompatActivity {
    Button buttonswitch4;
    EditText editTextsw4;
    TextView textViewsw4, tvsw4extr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch4);

        buttonswitch4 = (Button)findViewById(R.id.buttonswitch4);
        editTextsw4 = (EditText)findViewById(R.id.editTextsw4);
        textViewsw4 = (TextView)findViewById(R.id.textViewsw4);

        tvsw4extr = (TextView)findViewById(R.id.tvsw4extr);
        Bundle extras = getIntent().getExtras();
        tvsw4extr.setText(extras.getString(text4));

        buttonswitch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editTextsw4.getText().toString();
                switch (s){
                    case ("abc"):
                        textViewsw4.setText("abc");
                        break;
                    case ("abcd"):
                        textViewsw4.setText("abcd");
                        break;
                    case ("abcdE"):
                        textViewsw4.setText("abcdE");
                        break;
                    default:
                        textViewsw4.setText("Вы ввели не правильно");
                }
                return;
            }
        });
    }
}
