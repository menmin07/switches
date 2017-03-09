package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static kg.app.kuba.switchs.Mainfone.text6;


public class Switch6 extends AppCompatActivity {
    Button buttonswitch6;
    EditText editTextsw6;
    TextView textViewsw6, tvsw6extr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch6);

        buttonswitch6 = (Button)findViewById(R.id.buttonswitch6);
        editTextsw6 = (EditText)findViewById(R.id.editTextsw6);
        textViewsw6 = (TextView)findViewById(R.id.textViewsw6);

        tvsw6extr = (TextView)findViewById(R.id.tvsw6extr);
        Bundle extras = getIntent().getExtras();
        tvsw6extr.setText(extras.getString(text6));

        buttonswitch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String oba = editTextsw6.getText().toString();
                switch (oba){
                    case "Y":
                    case "Yes":
                    case "y":
                    case "yes":
                        textViewsw6.setText("Да");
                        break;
                    case "N":
                    case "No":
                    case "n":
                    case "no":
                        textViewsw6.setText("Нет");
                        break;
                    default:
                        textViewsw6.setText("Только да или нет.");
                }
            }
        });
    }
}
