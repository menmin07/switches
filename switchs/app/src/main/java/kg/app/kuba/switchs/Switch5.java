package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static kg.app.kuba.switchs.Mainfone.text5;


public class Switch5 extends AppCompatActivity {
    Button buttonswitch5;
    EditText editTextsw5;
    TextView textViewsw5, tvsw5extr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch5);

        buttonswitch5 = (Button)findViewById(R.id.buttonswitch5);
        editTextsw5 = (EditText)findViewById(R.id.editTextsw5);
        textViewsw5 = (TextView)findViewById(R.id.textViewsw5);

        tvsw5extr = (TextView)findViewById(R.id.tvsw5extr);
        Bundle extras = getIntent().getExtras();
        tvsw5extr.setText(extras.getString(text5));

        buttonswitch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(editTextsw5.getText().toString());
                switch (number){
                    case 1:
                        textViewsw5.setText("Вы ввели число 1");
                        break;
                    case 2:
                        textViewsw5.setText("Вы ввели число 2");
                        break;
                    case 3:
                        textViewsw5.setText("Вы ввели число 3");
                        break;
                    case 4:
                        textViewsw5.setText("Вы ввели число 4");
                        break;
                    case 5:
                        textViewsw5.setText("Вы ввели число 5");
                        break;
                    case 6:
                        textViewsw5.setText("Вы ввели число 6");
                        break;
                    case 7:
                        textViewsw5.setText("Вы ввели число 7");
                        break;
                    default:
                        textViewsw5.setText("У нас начинающий уровень. У нас пока только до 7");
                }
            }
        });

    }
}
