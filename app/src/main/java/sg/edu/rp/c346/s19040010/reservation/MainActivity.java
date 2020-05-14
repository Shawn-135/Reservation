package sg.edu.rp.c346.s19040010.reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnResetDateTime, btnResetData, btnSubmit;
    EditText etFullName, etMobileNumber, etSize;
    TextView tvShow;
    CheckBox cbSmoking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        etFullName = findViewById(R.id.editFullName);
        etMobileNumber = findViewById(R.id.editMobileNumber);
        etSize = findViewById(R.id.editSize);
        cbSmoking = findViewById(R.id.checkBoxSmokingTable);
        btnResetDateTime = findViewById(R.id.buttonResetDateTime);
        btnResetData = findViewById(R.id.buttonResetData);
        btnSubmit = findViewById(R.id.buttonSubmit);
        tvShow = findViewById(R.id.textView);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cbSmoking.isChecked()) {
                    tvShow.setText("The table you have chosen is smoking");
                }

                else {
                    tvShow.setText("The table you have chosen is non-smoking");
                }

                cbSmoking.setChecked(false);
            }
        });

        btnResetDateTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp.setMinDate(1 June 2020);
                tp.setTime(7:30PM);
            }
        });

        btnResetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etFullName.setText("");
                etMobileNumber.setText("");
                etSize.setText("");

            }
        });





    }
}
