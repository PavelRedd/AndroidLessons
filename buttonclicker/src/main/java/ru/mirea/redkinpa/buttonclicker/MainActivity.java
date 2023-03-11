package ru.mirea.redkinpa.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView textOut;
    private Button buttonYes;
    private Button buttonNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOut = (TextView) findViewById(R.id.textOut);
        buttonYes = (Button) findViewById(R.id.Yes);
        buttonNo = (Button) findViewById(R.id.No);

        View.OnClickListener oclBtnYes = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {textOut.setText("Сообщение отправлено!)))");}
        };
        buttonYes.setOnClickListener(oclBtnYes);

        View.OnClickListener oclBtnNo = new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {textOut.setText("Сообщение не отправлено(((");}
        };
        buttonNo.setOnClickListener(oclBtnNo);
    }

    public void onMyButtonClick(View view)
    {
        Toast.makeText(this, "Попробуйте еще раз", Toast.LENGTH_SHORT).show();
    }
}