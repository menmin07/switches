package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static kg.app.kuba.switchs.Mainfone.text3;


public class Switch3 extends AppCompatActivity {
    Button buttonswitch3;
    EditText editTextsw3;
    TextView textViewsw3, tvsw3extr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch3);

        buttonswitch3 = (Button)findViewById(R.id.buttonswitch3);
        editTextsw3 = (EditText)findViewById(R.id.editTextsw3);
        textViewsw3 = (TextView)findViewById(R.id.textViewsw3);

        tvsw3extr = (TextView)findViewById(R.id.tvsw3extr);
        Bundle extras = getIntent().getExtras();
        tvsw3extr.setText(extras.getString(text3));

        buttonswitch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int slov = Integer.parseInt(editTextsw3.getText().toString());
                switch (slov) {
                    case 1:
                        textViewsw3.setText("В строке 1 слов");
                        break;
                    case 2:
                        textViewsw3.setText("В строке 2 слов");
                        break;
                    case 3:
                        textViewsw3.setText("В строке 3 слов");
                        break;
                    case 4:
                        textViewsw3.setText("В строке 4 слов");
                        break;
                    case 5:
                        textViewsw3.setText("В строке 5 слов");
                        break;
                    case 6:
                        textViewsw3.setText("В строке 6 слов");
                        break;
                    case 7:
                        textViewsw3.setText("В строке 7 слов");
                        break;
                    default:
                        textViewsw3.setText("В строке 8 или более слов");
                }
                return;
            }
        });

    }
}
