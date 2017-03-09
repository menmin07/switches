package kg.app.kuba.switchs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static kg.app.kuba.switchs.Mainfone.text2;

public class Switch2 extends AppCompatActivity {
    Button buttonswitch2;
    EditText editTextsw2;
    TextView textViewsw2, tvsw2extr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.switch2);

        buttonswitch2 = (Button)findViewById(R.id.buttonswitch2);
        editTextsw2 = (EditText)findViewById(R.id.editTextsw2);
        textViewsw2 = (TextView) findViewById(R.id.textViewsw2);

        tvsw2extr = (TextView)findViewById(R.id.tvsw2extr);
        Bundle extras = getIntent().getExtras();
        tvsw2extr.setText(extras.getString(text2));

        buttonswitch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int age = Integer.parseInt(editTextsw2.getText().toString());
                switch (age){
                    case 1:
                        textViewsw2.setText("You are so high");
                        break;
                    case 2:
                        textViewsw2.setText("You are so tall");
                        break;
                    case 3:
                        textViewsw2.setText("You are in the winner");
                        break;
                    default:
                        textViewsw2.setText("You are so not in the top");
                }
            }
        });
    }
}
