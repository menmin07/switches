package kg.app.kuba.switchs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import static kg.app.kuba.switchs.R.string.text6;
import static kg.app.kuba.switchs.R.string.tvmainfone;

public class Mainfone extends AppCompatActivity implements OnClickListener {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    TextView tvmainfone;
    public final static String text1 = "Вы выбрали первый пример. Далее наберите цифру.";
    public final static String text2 = "Вы выбрали второй пример. Далее наберите цифру.";
    public final static String text3 = "Вы выбрали третий пример. Далее наберите цифру.";
    public final static String text4 = "Вы выбрали четвертый пример. Далее наберите цифру.";
    public final static String text5 = "Вы выбрали пятый пример. Далее наберите цифру.";
    public final static String text6 = "Вы выбрали шестой пример. Далее наберите цифру.";
    //public final static String text7 = "Вы выбрали седьой пример. Далее наберите цифру.";
    //public final static String text8 = "Вы выбрали восьмой пример. Далее наберите цифру.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainfone);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn4 = (Button)findViewById(R.id.btn4);
        btn5 = (Button)findViewById(R.id.btn5);
        btn6 = (Button)findViewById(R.id.btn6);
        btn7 = (Button)findViewById(R.id.btn7);
        btn8 = (Button)findViewById(R.id.btn8);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        //btn7.setOnClickListener(this);
        //btn8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:
                Intent intsw1 = new Intent(Mainfone.this, Switch1.class);
                intsw1.putExtra(text1, "Вы выбрали третий пример. Далее наберите цифру.");
                startActivity(intsw1);
                break;
            case R.id.btn2:
                Intent intsw2 = new Intent(Mainfone.this, Switch2.class);
                intsw2.putExtra(text2, "Вы выбрали третий пример. Далее наберите цифру.");
                startActivity(intsw2);
                break;
            case R.id.btn3:
                Intent intsw3 = new Intent(Mainfone.this, Switch3.class);
                intsw3.putExtra(text3, "Вы выбрали третий пример. Далее наберите цифру.");
                startActivity(intsw3);
                break;
            case R.id.btn4:
                Intent intsw4 = new Intent(Mainfone.this, Switch4.class);
                intsw4.putExtra(text4, "Вы выбрали четвертый пример. Далее наберите порядок букв: \"abc\", \"abcd\", abcdE\".");
                startActivity(intsw4);
                break;
            case R.id.btn5:
                Intent intsw5 = new Intent(Mainfone.this, Switch5.class);
                intsw5.putExtra(text5, "Вы выбрали пятый пример. Далее наберите цифру: 1, 2, 3 или 4.");
                startActivity(intsw5);
                break;
            case R.id.btn6:
                Intent intsw6 = new Intent(Mainfone.this, Switch6.class);
                intsw6.putExtra(text6, "Вы выбрали пятый пример. Далее если хотите продолжить, вы должны принять: \"Y\", \"Yes\", \"yes\",\"y\", либо отказать: \"N\", \"No\", \"no\", \"n\".");
                startActivity(intsw6);
                break;
            default:
                tvmainfone.setText("У нас пока всего 6 примеров");
        }
    }
}
