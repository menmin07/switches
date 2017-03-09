package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import static kg.app.kuba.switchs.Mainfone.text1;

public class Switch1 extends AppCompatActivity {
    Button buttonswitch1;
    EditText editTextsw1;
    TextView textViewsw1, tvsw1extr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch1);

        tvsw1extr = (TextView)findViewById(R.id.tvsw1extr);
        Bundle extras = getIntent().getExtras();
        tvsw1extr.setText(extras.getString(text1));

        editTextsw1 = (EditText)findViewById(R.id.editTextsw1);
        textViewsw1 = (TextView)findViewById(R.id.textViewsw1);
        buttonswitch1 = (Button)findViewById(R.id.buttonswitch1);

        buttonswitch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int monthAsInt = Integer.parseInt(editTextsw1.getText().toString());
                switch (monthAsInt) {
                    case 1:
                        textViewsw1.setText("Январь");
                        break;
                    case 2:
                        textViewsw1.setText("Февраль");
                        break;
                    case 3:
                        textViewsw1.setText("Март");
                        break;
                    case 4:
                        textViewsw1.setText("Аперль");
                        break;
                    case 5:
                        textViewsw1.setText("Май");
                        break;
                    case 6:
                        textViewsw1.setText("Июнь");
                        break;
                    case 7:
                        textViewsw1.setText("Июль");
                        break;
                    case 8:
                        textViewsw1.setText("Август");
                        break;
                    case 9:
                        textViewsw1.setText("Сентябрь");
                        break;
                    case 10:
                        textViewsw1.setText("Октябрь");
                        break;
                    case 11:
                        textViewsw1.setText("Ноябрь");
                        break;
                    case 12:
                        textViewsw1.setText("Декабрь");
                        break;
                    default:
                        textViewsw1.setText("Не правильный выбор месяца");                            ;
                }
                return;
            }
        });
    }
}
